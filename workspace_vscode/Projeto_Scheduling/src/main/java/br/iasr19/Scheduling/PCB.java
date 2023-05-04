package br.iasr19.Scheduling;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class PCB {

    List<Process> processList = new ArrayList<>();

    public void addProcessToList(Process p){
        processList.add(p);
    }

    public void sortByPriority(Process p){
        this.processList.sort(new Comparator<Process>() {
            @Override
            public int compare(Process p1, Process p2) {
                return Integer.compare(p1.getPriority(), p2.getPriority());
            }
        });
    }

    public void sortByBurstTime(Process p){
        this.processList.sort(new Comparator<Process>() {
            @Override
            public int compare(Process p1, Process p2) {
                return Integer.compare(p1.getBurstTime(), p2.getBurstTime());
            }
        });
    }

    public List<Process> getProcessList() {
        return processList;
    }

}
