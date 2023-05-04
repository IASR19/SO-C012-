package br.iasr19;

import br.iasr19.Scheduling.*;
import br.iasr19.Scheduling.Process;

public class SchedulingApp {

    public static void main(String[] args) throws InterruptedException {


        Process process1 = new Process("Add ",7);
        Process process2 = new Process("Multi ",10);
        Process process3 = new Process("Sub",4);

        PCB queue = new PCB();
        queue.addProcessToList(process1);
        queue.addProcessToList(process2);
        queue.addProcessToList(process3);

        // FCFS fcfs = new FCFS(queue, 100);
        SJF sjf = new SJF(queue, 1000);

        sjf.run();


    }

}
