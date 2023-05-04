package br.iasr19.Scheduling;

import java.util.Random;

public class Process {

    private final int PID;
    private final String nameProcess;
    private int burstTime;
    private int priority;

    public Process(String nameProcess, int burstTime){
        this.PID = new Random().nextInt(10000);
        this.nameProcess = nameProcess;
        this.burstTime = burstTime;
    }

    public Process(String nameProcess, int burstTime, int priority){
        this.PID = new Random().nextInt(10000);
        this.nameProcess = nameProcess;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return this.priority != 0 ? "\n\t\t" + nameProcess +
                                    " | busttime = " + burstTime + " | Priority = " + priority + " | PID = " + PID:
                                    "\n\t\t" + nameProcess +
                                    " | busttime = " + burstTime + " | PID = " + PID;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public String getNameProcess() {
        return nameProcess;
    }

}
