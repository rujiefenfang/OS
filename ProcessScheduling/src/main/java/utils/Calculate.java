package utils;

import lombok.Data;
import pojo.Process;

import java.text.DecimalFormat;
import java.util.List;

/**
 * @author LiuDongHao
 * @version 1.0
 * @date 2021/12/13 12:51
 */
@Data
public class Calculate {

    /**
     * 平均周转时间
     */
    public static double averageTurnaroundTime = 0;

    /**
     * 平均带权周转时间
     */
    public static double averageWeightedTurnaroundTime = 0;

    public static List<Process> calculate(List<Process> processList) {
        averageTurnaroundTime = 0;
        averageWeightedTurnaroundTime = 0;

        DecimalFormat df = new DecimalFormat("#.00");

        // 计算完成时间，周转时间
        for (int i = 0; i < processList.size(); i++) {
            Process process = processList.get(i);

            if (i == 0) {
                process.setStartTime(process.getArrivalTime());
            }else {
                process.setStartTime(Math.max(process.getArrivalTime(), processList.get(i - 1).getCompleteTime()));
            }
            process.setCompleteTime(process.getStartTime() + process.getServiceTime());

            process.setTurnaroundTime(Double.parseDouble(df.format(process.getCompleteTime()-process.getArrivalTime())));

            process.setWeightedTurnaroundTime(Double.parseDouble(df.format(process.getTurnaroundTime()/process.getServiceTime())));

            averageTurnaroundTime += process.getTurnaroundTime();
            averageWeightedTurnaroundTime += process.getWeightedTurnaroundTime();

        }
        averageTurnaroundTime = Double.parseDouble(df.format(averageTurnaroundTime / processList.size()));
        averageWeightedTurnaroundTime = Double.parseDouble(df.format(averageWeightedTurnaroundTime / processList.size()));

        return processList;
    }
}
