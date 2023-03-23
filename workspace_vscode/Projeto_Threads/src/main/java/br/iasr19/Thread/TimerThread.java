package br.iasr19.Thread;

import java.lang.InterruptedException;

public class TimerThread extends Thread {

    private int time;
    private int maxTime;

    public TimerThread(int maxTime){
        this.time = 0;
        this.maxTime = maxTime;
        start();
    }

    @Override
    public void run(){

        try {
            for(int i = 0;i < maxTime; i++){
                sleep(1000);
                this.time++;
                if(time == maxTime){
                    interrupt();
                    System.out.print("\nSeu tempo esgotou!!!!\nJogue novamente");
                    System.exit(0);
                    
                }
            }
        }catch (InterruptedException e){
            System.out.println("\n");
        }

        

    }

    public int getTime(){
        return time;
    }

}
