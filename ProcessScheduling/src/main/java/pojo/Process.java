package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiuDongHao
 * @version 1.0
 * @date 2021/12/12 19:23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Process  {

    /**
     * 进程名字
     */
    private String processName;

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
     * 响应比
     */
    private double responseRatio;

    public Process(String name, double arrivalTime, double serverTime) {
        this.processName = name;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serverTime;
    }


//    @Override
//    public int compareTo(Process o) {
////        if (o.getArrivalTime()<this.getArrivalTime())
////        {
////            return 1;
////        }
////        return -1;
//        return o.getArrivalTime() < this.getArrivalTime() ? 1 : -1;
//    }
}
