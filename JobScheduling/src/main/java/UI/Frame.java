/*
 * Created by JFormDesigner on Sun Dec 12 14:58:01 CST 2021
 */

package UI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import calculate.Calculate;
import net.miginfocom.swing.*;
import pojo.Job;

/**
 * @author unknown
 */
public class Frame extends JFrame {
    public Frame() {
        initComponents();
        setButtonActionListen();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - DH Liu
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        label0 = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label15 = new JLabel();
        label8 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField13 = new JTextField();
        label9 = new JLabel();
        textField7 = new JTextField();
        textField8 = new JTextField();
        textField9 = new JTextField();
        textField10 = new JTextField();
        textField11 = new JTextField();
        textField12 = new JTextField();
        label14 = new JLabel();
        textField14 = new JTextField();
        textField15 = new JTextField();
        textField16 = new JTextField();
        textField17 = new JTextField();
        textField18 = new JTextField();
        textField19 = new JTextField();
        label10 = new JLabel();
        label7 = new JLabel();
        label11 = new JLabel();
        label51 = new JLabel();
        label52 = new JLabel();
        label53 = new JLabel();
        label54 = new JLabel();
        label55 = new JLabel();
        label56 = new JLabel();
        label22 = new JLabel();
        label12 = new JLabel();
        label61 = new JLabel();
        label62 = new JLabel();
        label63 = new JLabel();
        label64 = new JLabel();
        label65 = new JLabel();
        label66 = new JLabel();
        label67 = new JLabel();
        label13 = new JLabel();
        label71 = new JLabel();
        label72 = new JLabel();
        label73 = new JLabel();
        label74 = new JLabel();
        label75 = new JLabel();
        label76 = new JLabel();
        label77 = new JLabel();
        textArea2 = new JTextArea();
        label18 = new JLabel();
        label21 = new JLabel();

        //======== this ========
        setMaximizedBounds(new Rectangle(20, 20, 20, 20));
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[188,sizegroup 1,fill]" +
                        "[188,sizegroup 1,fill]" +
                        "[322,sizegroup 1,fill]" +
                        "[322,sizegroup 1,fill]" +
                        "[334,sizegroup 1,fill]" +
                        "[334,sizegroup 1,fill]" +
                        "[334,sizegroup 1,fill]" +
                        "[334,sizegroup 1,fill]",
                // rows
                "[74]" +
                        "[100,sizegroup 1]" +
                        "[35,sizegroup 1]" +
                        "[19,sizegroup 1]" +
                        "[100,sizegroup 2]" +
                        "[100,sizegroup 2]" +
                        "[109,sizegroup 2]" +
                        "[100,sizegroup 2]" +
                        "[76,sizegroup 2]" +
                        "[]"));

        //---- button1 ----
        button1.setText("FCFS");
        contentPane.add(button1, "cell 1 0");

        //---- button2 ----
        button2.setText("RR");
        contentPane.add(button2, "cell 3 0");

        //---- button3 ----
        button3.setText("RS");
        contentPane.add(button3, "cell 5 0");

        //---- label0 ----
        label0.setText("\u4f5c\u4e1a\u540d");
        contentPane.add(label0, "cell 0 1");

        //---- label1 ----
        label1.setText("A");
        contentPane.add(label1, "cell 1 1,alignx center,growx 0");

        //---- label2 ----
        label2.setText("B");
        contentPane.add(label2, "cell 2 1,alignx center,growx 0");

        //---- label3 ----
        label3.setText("C");
        contentPane.add(label3, "cell 3 1,alignx center,growx 0");

        //---- label4 ----
        label4.setText("D");
        contentPane.add(label4, "cell 4 1,alignx center,growx 0");

        //---- label5 ----
        label5.setText("E");
        contentPane.add(label5, "cell 5 1,alignx center,growx 0");

        //---- label6 ----
        label6.setText("F");
        contentPane.add(label6, "cell 6 1,alignx center,growx 0");

        //---- label15 ----
        label15.setText("\u65f6\u95f4\u7247");
        contentPane.add(label15, "cell 7 1,alignx center,growx 0");

        //---- label8 ----
        label8.setText("\u5230\u8fbe\u65f6\u95f4");
        contentPane.add(label8, "cell 0 2");
        contentPane.add(textField1, "cell 1 2");
        contentPane.add(textField2, "cell 2 2");
        contentPane.add(textField3, "cell 3 2");
        contentPane.add(textField4, "cell 4 2");
        contentPane.add(textField5, "cell 5 2");
        contentPane.add(textField6, "cell 6 2");
        contentPane.add(textField13, "cell 7 2");

        //---- label9 ----
        label9.setText("\u670d\u52a1\u65f6\u95f4");
        contentPane.add(label9, "cell 0 3");
        contentPane.add(textField7, "cell 1 3");
        contentPane.add(textField8, "cell 2 3");
        contentPane.add(textField9, "cell 3 3");
        contentPane.add(textField10, "cell 4 3");
        contentPane.add(textField11, "cell 5 3");
        contentPane.add(textField12, "cell 6 3");

        //---- label14 ----
        label14.setText("RS\u8c03\u5ea6\u6743\u91cd");
        contentPane.add(label14, "cell 0 4");
        contentPane.add(textField14, "cell 1 4");
        contentPane.add(textField15, "cell 2 4");
        contentPane.add(textField16, "cell 3 4");
        contentPane.add(textField17, "cell 4 4");
        contentPane.add(textField18, "cell 5 4");
        contentPane.add(textField19, "cell 6 4");

        //---- label10 ----
        label10.setText("\u8c03\u5ea6\u7ed3\u679c\uff1a");
        contentPane.add(label10, "cell 0 5");

        //---- label7 ----
        label7.setText("\u5e73\u5747");
        contentPane.add(label7, "cell 7 5,alignx center,growx 0");

        //---- label11 ----
        label11.setText("\u5b8c\u6210\u65f6\u95f4");
        contentPane.add(label11, "cell 0 6");

        //---- label51 ----
        label51.setText("  ");
        contentPane.add(label51, "cell 1 6,alignx center,growx 0");

        //---- label52 ----
        label52.setText("  ");
        contentPane.add(label52, "cell 2 6,alignx center,growx 0");

        //---- label53 ----
        label53.setText("  ");
        contentPane.add(label53, "cell 3 6,alignx center,growx 0");

        //---- label54 ----
        label54.setText("  ");
        contentPane.add(label54, "cell 4 6,alignx center,growx 0");

        //---- label55 ----
        label55.setText("  ");
        contentPane.add(label55, "cell 5 6,alignx center,growx 0");

        //---- label56 ----
        label56.setText("  ");
        contentPane.add(label56, "cell 6 6,alignx center,growx 0");

        //---- label22 ----
        label22.setText("  ");
        contentPane.add(label22, "cell 7 6,alignx center,growx 0");

        //---- label12 ----
        label12.setText("\u5468\u8f6c\u65f6\u95f4");
        contentPane.add(label12, "cell 0 7");

        //---- label61 ----
        label61.setText("  ");
        contentPane.add(label61, "cell 1 7,alignx center,growx 0");

        //---- label62 ----
        label62.setText("  ");
        contentPane.add(label62, "cell 2 7,alignx center,growx 0");

        //---- label63 ----
        label63.setText("  ");
        contentPane.add(label63, "cell 3 7,alignx center,growx 0");

        //---- label64 ----
        label64.setText("  ");
        contentPane.add(label64, "cell 4 7,alignx center,growx 0");

        //---- label65 ----
        label65.setText("  ");
        contentPane.add(label65, "cell 5 7,alignx center,growx 0");

        //---- label66 ----
        label66.setText("  ");
        contentPane.add(label66, "cell 6 7,alignx center,growx 0");

        //---- label67 ----
        label67.setText("  ");
        contentPane.add(label67, "cell 7 7,alignx center,growx 0");

        //---- label13 ----
        label13.setText("\u5e26\u6743\u5468\u8f6c\u65f6\u95f4");
        contentPane.add(label13, "cell 0 8");

        //---- label71 ----
        label71.setText("  ");
        contentPane.add(label71, "cell 1 8,alignx center,growx 0");

        //---- label72 ----
        label72.setText("  ");
        contentPane.add(label72, "cell 2 8,alignx center,growx 0");

        //---- label73 ----
        label73.setText("  ");
        contentPane.add(label73, "cell 3 8,alignx center,growx 0");

        //---- label74 ----
        label74.setText("  ");
        contentPane.add(label74, "cell 4 8,alignx center,growx 0");

        //---- label75 ----
        label75.setText("  ");
        contentPane.add(label75, "cell 5 8,alignx center,growx 0");

        //---- label76 ----
        label76.setText("  ");
        contentPane.add(label76, "cell 6 8,alignx center,growx 0");

        //---- label77 ----
        label77.setText(" ");
        contentPane.add(label77, "cell 7 8,alignx center,growx 0");
        pack();
        setLocationRelativeTo(getOwner());

        //---- label18 ----
        label18.setText("text");

        //---- label21 ----
        label21.setText("text");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - DH Liu
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label0;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label15;
    private JLabel label8;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField13;
    private JLabel label9;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JLabel label14;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JLabel label10;
    private JLabel label7;
    private JLabel label11;
    private JLabel label51;
    private JLabel label52;
    private JLabel label53;
    private JLabel label54;
    private JLabel label55;
    private JLabel label56;
    private JLabel label22;
    private JLabel label12;
    private JLabel label61;
    private JLabel label62;
    private JLabel label63;
    private JLabel label64;
    private JLabel label65;
    private JLabel label66;
    private JLabel label67;
    private JLabel label13;
    private JLabel label71;
    private JLabel label72;
    private JLabel label73;
    private JLabel label74;
    private JLabel label75;
    private JLabel label76;
    private JLabel label77;
    private JTextArea textArea2;
    private JLabel label18;
    private JLabel label21;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void setButtonActionListen() {
        button1.addActionListener(new FCFSActionListen());
        button2.addActionListener(new RRActionListen());
        button3.addActionListener(new RSActionListen());
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class FCFSActionListen implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            List<Job> jobList = getAllJob();
            Calculate calculate = new Calculate();
            List<Job> fcfs = calculate.fcfs(jobList);
            showLabels(fcfs,calculate.getAverageTurnaroundTime(),calculate.getAverageWeightedTurnaroundTime());
            for (int i = 0; i < fcfs.size(); i++) {
                System.out.println(fcfs.get(i));
            }
        }
    }

    private class RRActionListen implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            List<Job> jobList = getAllJob();
            Calculate calculate = new Calculate();
            String text = textField13.getText();
            int timeSlice = 2;
            if (!text.equals("")){
                timeSlice = Integer.parseInt(text);
            }
            List<Job> rr = calculate.rr(jobList, timeSlice);
            for (int i = 0; i < rr.size(); i++) {
                System.out.println(rr.get(i));
            }
            showLabels(rr,calculate.getAverageTurnaroundTime(),calculate.getAverageWeightedTurnaroundTime());
        }
    }

    private class RSActionListen implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            List<Job> jobList = getAllJob();
            Calculate calculate = new Calculate();
            List<Job> rs = calculate.rs(jobList);
            showLabels(rs,calculate.getAverageTurnaroundTime(),calculate.getAverageWeightedTurnaroundTime());
            for (int i = 0; i < rs.size(); i++) {
                System.out.println(rs.get(i));
            }
        }
    }

    //    /**
//     * FCFS????????????
//     */
//    private class FCFSActionListen implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            List<Process> allProcess = getAllProcess();
//            FCFS fcfs = new FCFS(allProcess);
//            List<Process> calculate = fcfs.calculate();
//            showLabels(calculate,fcfs.getAverageTurnaroundTime(),fcfs.getAverageWeightedTurnaroundTime());
//
//        }
//    }
//
//    /**
//     * SJF????????????
//     */
//    private class SJFActionListen implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            List<Process> allProcess = getAllProcess();
//            SJF sjf = new SJF(allProcess);
//            List<Process> calculate = sjf.calculate();
//            showLabels(calculate,sjf.getAverageTurnaroundTime(),sjf.getAverageWeightedTurnaroundTime());
//        }
//    }
//
//    /**
//     * HRRN????????????
//     */
//    private class HRRNActionListen implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            List<Process> allProcess = getAllProcess();
//            HRRN hrrn = new HRRN(allProcess);
//            List<Process> calculate = hrrn.calculate();
//            showLabels(calculate,hrrn.getAverageTurnaroundTime(),hrrn.getAverageWeightedTurnaroundTime());
//        }
//    }
//
//    /**
//     * ??????????????????????????????????????????????????????????????????
//     * @return allProcess
//     */
    private List<Job> getAllJob() {
        //A??????
        String aName = label1.getText();
        double aArrivalTime = Double.parseDouble(textField1.getText());
        double aServerTime = Double.parseDouble(textField7.getText());
        int apriority ;
        if (textField14.getText().equals("")){
            apriority = 0;
        }else {
            apriority=Integer.parseInt(textField14.getText());
        }

        Job A = new Job(aName, aArrivalTime, aServerTime, apriority);
        //B??????
        String bName = label2.getText();
        double bArrivalTime = Double.parseDouble(textField2.getText());
        double bServerTime = Double.parseDouble(textField8.getText());
        int bpriority ;
        if (textField15.getText().equals("")){
            bpriority = 0;
        }else {
            bpriority=Integer.parseInt(textField15.getText());
        }
        Job B = new Job(bName, bArrivalTime, bServerTime, bpriority);
        //C??????
        String cName = label3.getText();
        double cArrivalTime = Double.parseDouble(textField3.getText());
        double cServerTime = Double.parseDouble(textField9.getText());
        int cpriority ;
        if (textField16.getText().equals("")){
            cpriority = 0;
        }else {
            cpriority=Integer.parseInt(textField16.getText());
        }
        Job C = new Job(cName, cArrivalTime, cServerTime, cpriority);
        //D??????
        String dName = label4.getText();
        double dArrivalTime = Double.parseDouble(textField4.getText());
        double dServerTime = Double.parseDouble(textField10.getText());
        int dpriority ;
        if (textField17.getText().equals("")){
            dpriority = 0;
        }else {
            dpriority=Integer.parseInt(textField17.getText());
        }
        Job D = new Job(dName, dArrivalTime, dServerTime, dpriority);
        //E??????
        String eName = label5.getText();
        double eArrivalTime = Double.parseDouble(textField5.getText());
        double eServerTime = Double.parseDouble(textField11.getText());
        int epriority ;
        if (textField18.getText().equals("")){
            epriority = 0;
        }else {
            epriority=Integer.parseInt(textField18.getText());
        }
        Job E = new Job(eName, eArrivalTime, eServerTime, epriority);
        //F??????
        String fName = label6.getText();
        double fArrivalTime = Double.parseDouble(textField6.getText());
        double fServerTime = Double.parseDouble(textField12.getText());
        int fpriority ;
        if (textField19.getText().equals("")){
            fpriority = 0;
        }else {
            fpriority=Integer.parseInt(textField19.getText());
        }
        Job F = new Job(fName, fArrivalTime, fServerTime, fpriority);

        List<Job> jobList = new LinkedList<>();
        jobList.add(A);
        jobList.add(B);
        jobList.add(C);
        jobList.add(D);
        jobList.add(E);
        jobList.add(F);
        return jobList;
    }

    /**
     * ???????????????
     *
     * @param jobList
     * @param averageTurnaroundTime
     * @param averageWeightedTurnaroundTime
     */
    private void showLabels(List<Job> jobList, double averageTurnaroundTime, double averageWeightedTurnaroundTime) {

        Job A = new Job();
        Job B = new Job();
        Job C = new Job();
        Job D = new Job();
        Job E = new Job();
        Job F = new Job();
        for (Job job : jobList) {
            switch (job.getJobName()) {
                case "A":
                    A = job;
                    break;
                case "B":
                    B = job;
                    break;
                case "C":
                    C = job;
                    break;
                case "D":
                    D = job;
                    break;
                case "E":
                    E = job;
                    break;
                case "F":
                    F = job;
                    break;
            }
        }
        label51.setText(String.valueOf(A.getCompleteTime()));
        label61.setText(String.valueOf(A.getTurnaroundTime()));
        label71.setText(String.valueOf(A.getWeightedTurnaroundTime()));

        label52.setText(String.valueOf(B.getCompleteTime()));
        label62.setText(String.valueOf(B.getTurnaroundTime()));
        label72.setText(String.valueOf(B.getWeightedTurnaroundTime()));

        label53.setText(String.valueOf(C.getCompleteTime()));
        label63.setText(String.valueOf(C.getTurnaroundTime()));
        label73.setText(String.valueOf(C.getWeightedTurnaroundTime()));

        label54.setText(String.valueOf(D.getCompleteTime()));
        label64.setText(String.valueOf(D.getTurnaroundTime()));
        label74.setText(String.valueOf(D.getWeightedTurnaroundTime()));

        label55.setText(String.valueOf(E.getCompleteTime()));
        label65.setText(String.valueOf(E.getTurnaroundTime()));
        label75.setText(String.valueOf(E.getWeightedTurnaroundTime()));

        label56.setText(String.valueOf(F.getCompleteTime()));
        label66.setText(String.valueOf(F.getTurnaroundTime()));
        label76.setText(String.valueOf(F.getWeightedTurnaroundTime()));


        label67.setText(String.valueOf(averageTurnaroundTime));
        label77.setText(String.valueOf(averageWeightedTurnaroundTime));


    }


}





























