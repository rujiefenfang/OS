package calculate;

import lombok.Data;
import pojo.Process;
import utils.Calculate;

import java.util.*;

/**
 * @author LiuDongHao
 * @version 1.0
 * @date 2021/12/13 13:33
 */
@Data
public class HRRN {
    /**
     * 进程装载列表
     */
    private List<Process> processList;

    /**
     * 平均周转时间
     */
    private double averageTurnaroundTime = 0;

    /**
     * 平均带权周转时间
     */
    private double averageWeightedTurnaroundTime = 0;

    public HRRN(List<Process> processList) {
        this.processList = processList;
    }

    public List<Process> calculate() {


        //按到达时间排序
        Collections.sort(processList, (o1, o2) -> {
            if (o1.getArrivalTime() > o2.getArrivalTime()) return 1;
            else if (o1.getArrivalTime() == o2.getArrivalTime()) {
                if (o1.getServiceTime() > o2.getServiceTime()) return 1;
                else return -1;
            } else return -1;
        });
        List<Process> processListClone = new LinkedList<>();

        processListClone.add(processList.get(0));

        //下一个进程开始时间
        double currentTime = processList.get(0).getArrivalTime() + processList.get(0).getServiceTime();

        //已经运行成功的进程弹出
        processList.remove(processList.get(0));

        while (processList.size() > 0) {
            List<Process> processListTemp = new LinkedList<>();
            for (Process process : processList) {
                if (currentTime > process.getArrivalTime() && !processListTemp.contains(process)) {

                    //计算响应比
                    process.setResponseRatio((currentTime - process.getArrivalTime()) / process.getServiceTime());
                    processListTemp.add(process);
                }
            }
            //前面进程结束后，其他进程未到达，则加入后面第一个到达的进程
            if (processListTemp.size() == 0) {
                processListTemp.add(processList.get(0));
            }
            //响应比排序，高到低
            Collections.sort(processListTemp, (o1, o2) -> o1.getResponseRatio() <= o2.getResponseRatio() ? 1 : -1);


            //获得第一，加入clone，processList 弹出
            processListClone.add(processListTemp.get(0));
            processList.remove(processListTemp.get(0));

            currentTime += processListTemp.get(0).getServiceTime();
            //循环processList.size() <=0 结束
        }
        processList = processListClone;

        List<Process> calculate = Calculate.calculate(processList);
        averageTurnaroundTime = Calculate.averageTurnaroundTime;
        averageWeightedTurnaroundTime = Calculate.averageWeightedTurnaroundTime;

        return calculate;
    }
    public static void main(String[] args) {
        List<Process> processList1 = new LinkedList<>();
        HRRN hrrn = new HRRN(processList1);
        List<Process> processList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Process process = new Process();
            process.setProcessName(String.valueOf(i));
            process.setServiceTime(random.nextInt(5)+1);
            process.setArrivalTime(random.nextInt(20)+1);
            processList.add(process);
        }
        hrrn.setProcessList(processList);

        List<Process> calculate = hrrn.calculate();


        for (Process process : calculate){
            System.out.println(process);
        }
        System.out.println(hrrn.getProcessList().size());
    }
}


















