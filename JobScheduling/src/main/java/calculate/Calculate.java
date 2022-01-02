package calculate;

import lombok.Data;
import pojo.Job;

import java.text.DecimalFormat;
import java.util.*;

/**
 * @author LiuDongHao
 * @version 1.0
 * @date 2021/12/16 20:00
 */
@Data
public class Calculate {

    /**
     * 进程装载列表
     */
    private static List<Job> jobList;

    /**
     * 平均周转时间
     */
    public  double averageTurnaroundTime = 0;

    /**
     * 平均带权周转时间
     */
    public  double averageWeightedTurnaroundTime = 0;

    /**
     * 先来先服务
     * @param jobList
     * @return
     */
    public List<Job> fcfs(List<Job> jobList) {
        // 按到达时间排序
        Collections.sort(jobList, (o1, o2) -> o1.getArrivalTime() >= o2.getArrivalTime() ? 1 : -1);
        // 计算开始时间
        for (int i = 0; i < jobList.size(); i++) {
            Job job = jobList.get(i);
            if (i == 0) {
                job.setStartTime(job.getArrivalTime());
            } else {
                job.setStartTime(Math.max(job.getArrivalTime(), jobList.get(i - 1).getCompleteTime()));
            }
            job.setCompleteTime(job.getStartTime() + job.getServiceTime());
        }
        return calculate(jobList);
    }

    /**
     * 时间片轮转
     *
     * @param jobList
     * @param timeSlice
     * @return
     */
    public List<Job> rr(List<Job> jobList, int timeSlice) {
        //到达时间排序
        Collections.sort(jobList, (o1, o2) -> o1.getArrivalTime() >= o2.getArrivalTime() ? 1 : -1);

        //当前时间
        double currentTime = jobList.get(0).getArrivalTime();

        //作业数
        int jobNumber = jobList.size();

        //将时间为0的，压入运行时的列表
        List<Job> jobListTemp = new LinkedList<>();

        for (Job job : jobList) {
            if (job.getArrivalTime() <= currentTime && !jobListTemp.contains(job)&&
                    job.getServiceRemainingTime()!=job.getServiceTime()) {
                jobListTemp.add(job);
            }
        }

        //完成的作业
        List<Job> jobOverList = new LinkedList<>();

        while (jobOverList.size()<jobNumber) {

            for (int i=0;i<jobListTemp.size();i++) {
                //时间片加入服务
                Job job = jobListTemp.get(i);
                job.setServiceRemainingTime(job.getServiceRemainingTime() + timeSlice);
                if (job.getStartTime() == 0){
                    job.setStartTime(currentTime);
                }
                currentTime+=timeSlice;

                //超过了服务时间
                if (job.getServiceTime() < job.getServiceRemainingTime()){
                    double outTime = job.getServiceRemainingTime() - job.getServiceTime();
                    job.setServiceRemainingTime(job.getServiceTime());
                    currentTime-=outTime;
                }
                //服务时间满后加入完成的List
                if (job.getServiceTime() == job.getServiceRemainingTime()){
                    job.setCompleteTime(currentTime);
                    jobListTemp.remove(job);
                    jobOverList.add(job);
                    i--;
                }
                //一次轮转后判断作业到达时间与当前时间
                for (Job job1 : jobList) {
                    if (job1.getArrivalTime() <= currentTime && !jobListTemp.contains(job1) &&
                        job1.getServiceRemainingTime()!=job1.getServiceTime()) {
                        jobListTemp.add(job1);
                    }
                    //当运行的列表等于0，且当前时间<没有进入完成列表的作业的到达时间
                    if (jobListTemp.size() == 0 && currentTime < job1.getArrivalTime()){
                        currentTime = job1.getArrivalTime();
                        jobListTemp.add(job1);
                    }
                }
            }
        }
        //现在时间 >= 到达时间,加入jobListTem

        //一个时间片过后，再比较到达时间

        //时间片加入服务剩余时间，是否超过服务时间，超过则减去超过的时间 ，，现在时间也要减去，然后加入jobOverList
        return calculate(jobOverList);
    }

    /**
     * 优先权调度
     * @param jobList
     * @return
     */
    public List<Job> rs(List<Job> jobList){
        Collections.sort(jobList, (o1, o2) -> {
            if (o1.getArrivalTime()>o2.getArrivalTime()) return 1;
            else if (o1.getArrivalTime() == o2.getArrivalTime()){
                if (o1.getPriority()<o2.getPriority()) return 1;
                else return -1;
            }else return -1;
        });
        List<Job> jobListClone = new LinkedList<>();

        jobListClone.add(jobList.get(0));

        double currentTime = jobList.get(0).getArrivalTime()+jobList.get(0).getServiceTime();

        jobList.remove(jobList.get(0));

        while (jobList.size()>0){
            List<Job> jobListTemp = new LinkedList<>();
            for (Job job:jobList){
                if (currentTime > job.getArrivalTime() && !jobListClone.contains(job)){
                    jobListTemp.add(job);
                }
            }
            if (jobListTemp.size() == 0){
                jobListTemp.add(jobList.get(0));
            }

            Collections.sort(jobListTemp,(o1, o2) -> o1.getPriority() < o2.getPriority() ? 1 : -1);

            jobListTemp.get(0).setStartTime(currentTime);
            currentTime += jobListTemp.get(0).getServiceTime();
            jobListTemp.get(0).setCompleteTime(currentTime);

            jobListClone.add(jobListTemp.get(0));
            jobList.remove(jobListTemp.get(0));
        }

        return calculate(jobList);
    }



    /**
     * 按照到达顺序排序
     *
     * @param jobList
     * @return
     */
    private  List<Job> calculate(List<Job> jobList) {
        averageTurnaroundTime = 0;
        averageWeightedTurnaroundTime = 0;

        DecimalFormat df = new DecimalFormat("#.00");

        // 计算完成时间，周转时间
        for (int i = 0; i < jobList.size(); i++) {
            Job job = jobList.get(i);


            job.setTurnaroundTime(Double.parseDouble(df.format(job.getCompleteTime() - job.getArrivalTime())));

            job.setWeightedTurnaroundTime(Double.parseDouble(df.format(job.getTurnaroundTime() / job.getServiceTime())));

            averageTurnaroundTime += job.getTurnaroundTime();
            averageWeightedTurnaroundTime += job.getWeightedTurnaroundTime();

        }
        averageTurnaroundTime = Double.parseDouble(df.format(averageTurnaroundTime / jobList.size()));
        averageWeightedTurnaroundTime = Double.parseDouble(df.format(averageWeightedTurnaroundTime / jobList.size()));

        return jobList;
    }

    public static void main(String[] args) {
        List<Job> jobList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Job job = new Job();
            job.setServiceTime(random.nextInt(10) + 1);
            job.setArrivalTime(random.nextInt(5));
            job.setPriority(random.nextInt(10));
            jobList.add(job);
            System.out.println(job);
        }
        System.out.println();



        Calculate calculate = new Calculate();
        List<Job> rs = calculate.rs(jobList);

//        List<Job> fcfs = calculate.fcfs(jobList);
//        List<Job> rr = calculate.rr(jobList, 2);
//        for (int i = 0; i < fcfs.size(); i++) {
//            Job job = fcfs.get(i);
//            System.out.println(fcfs.get(i));
//            fcfs.remove(job);
//            i--;
//        }
//        for (int i = 0; i < rr.size(); i++) {
//            System.out.println(rr.get(i));
//        }
        for (int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i));
        }
    }
}
