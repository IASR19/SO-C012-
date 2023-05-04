package br.iasr19.Scheduling;

public class RR {

    private final PCB pcb;

    private final int quantum;

    private int count = 0;

    private int timeOfCycle = 0;

    public RR(PCB pcb, int quantum, int timeOfCycle){
        this.pcb = pcb;
        this.quantum =  quantum;
        this.timeOfCycle = timeOfCycle;
    }

    public RR(PCB pcb, int quantum){
        this.pcb = pcb;
        this.quantum =  quantum;
    }

    public int run() throws InterruptedException{

        System.out.print("\t\tQuantum: " + quantum + "\n\t\tProcessos:" );
        System.out.println(pcb.processList.toString());
        System.out.println("-----------------------------------------------------------");

        if(pcb.processList.isEmpty()){
            System.out.println("A lista esta vazia!!!");
            return 0 ;
        }else {
            while (pcb.processList.size() != 0) {

                if(pcb.processList.get(count).getBurstTime() > 0){
                    pcb.processList.get(count).setBurstTime(pcb.processList.get(count).getBurstTime() - quantum);
                    if (pcb.processList.get(count).getBurstTime() < 0){
                        pcb.processList.get(count).setBurstTime(0);
                    }
                    System.out.println(pcb.processList.get(count).toString());
                    Thread.sleep(timeOfCycle);
                    count++;


                }
                else if(pcb.processList.get(count).getBurstTime() == 0){
                    pcb.processList.remove(count);
                }
                if(count > pcb.processList.size() -1){
                    count = 0;
                }

            }

            return 1;
        }

    }


}
