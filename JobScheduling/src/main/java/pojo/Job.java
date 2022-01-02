package pojo;

import lombok.Data;

/**
 * @author LiuDongHao
 * @version 1.0
 * @date 2021/12/16 20:01
 */

@Data
public class Job {
    /**
     * 作业名字
     */
    private String jobName;

    /**
     * 到达时间
     */
    private double arrivalTime;

    /**
     * 服务时间
     */
    private double serviceTime;

    /**
     * 开始时间
     */
    private double startTime;

    /**
     * 完成时间
     */
    private double completeTime;

    /**
     * 周转时间
     */
    private double turnaroundTime;

    /**
     * 带权周转时间
     */
    private double weightedTurnaroundTime;

    /**
     * 优先级
     */
    private int priority;

    /**
     * 实际服务时间
     */
    private double serviceRemainingTime;

    public Job(String Name, double ArrivalTime, double ServerTime, int priority) {
        this.jobName = Name;
        this.arrivalTime = ArrivalTime;
        this.serviceTime = ServerTime;
        this.priority = priority;
    }

    public Job() {

    }
}
