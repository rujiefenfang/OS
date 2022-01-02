package calculate;

import lombok.Data;

import java.text.DecimalFormat;
import java.util.*;

import pojo.Process;
import utils.Calculate;

/**
 * @author LiuDongHao
 * @version 1.0
 * @date 2021/12/12 19:22
 */
@Data
public class FCFS {

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


    public FCFS(List<Process> processList) {
        this.processList = processList;
    }


    public List<Process> calculate() {

        // 按到达时间排序
        Collections.sort(processList, (o1, o2) -> o1.getArrivalTime() >= o2.getArrivalTime() ? 1:-1);

//        DecimalFormat df = new DecimalFormat("#.00");
//
//        // 计算完成时间，周转时间
//        for (int i = 0; i < processList.size(); i++) {
//            Process process = processList.get(i);
//
//            if (i == 0) {
//                process.setStartTime(process.getArrivalTime());
//            }else {
//                process.setStartTime(Math.max(process.getArrivalTime(), processList.get(i - 1).getCompleteTime()));
//            }
//            process.setCompleteTime(process.getStartTime() + process.getServiceTime());
//
//            process.setTurnaroundTime(Double.parseDouble(df.format(process.getCompleteTime()-process.getArrivalTime())));
//
//            process.setWeightedTurnaroundTime(Double.parseDouble(df.format(process.getTurnaroundTime()/process.getServiceTime())));
//
//            averageTurnaroundTime += process.getTurnaroundTime();
//            averageWeightedTurnaroundTime += process.getWeightedTurnaroundTime();
//
//        }
//        averageTurnaroundTime = Double.parseDouble(df.format(averageTurnaroundTime / processList.size()));
//        averageWeightedTurnaroundTime = Double.parseDouble(df.format(averageWeightedTurnaroundTime / processList.size()));
//
//        return processList;

        List<Process> calculate = Calculate.calculate(processList);
        averageTurnaroundTime = Calculate.averageTurnaroundTime;
        averageWeightedTurnaroundTime = Calculate.averageWeightedTurnaroundTime;

        return calculate;
    }

    public static void main(String[] args) {
        List<Process> processList1 = new LinkedList<>();
        FCFS fcfs = new FCFS(processList1);
        List<Process> processList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Process process = new Process();
            process.setServiceTime(random.nextInt(10)+1);
            process.setArrivalTime(random.nextInt(100));
            processList.add(process);
        }
        fcfs.setProcessList(processList);

        fcfs.calculate();
        for (int i = 0; i < fcfs.getProcessList().size(); i++) {
            Process process = fcfs.getProcessList().get(i);
            System.out.println(process);
        }
        System.out.println(fcfs.getAverageTurnaroundTime());
        System.out.println(fcfs.getAverageWeightedTurnaroundTime());


    }

}
