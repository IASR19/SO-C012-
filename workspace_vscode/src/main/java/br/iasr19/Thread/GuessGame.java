package br.iasr19.Thread;
import java.util.Scanner;

import java.util.Random;

public class GuessGame {

    private int maxTime = 30;
    private final int  upperBound;


    public GuessGame(int upperBound){
        this.upperBound = upperBound;
    }

    public GuessGame(int upperBound, int maxTime){

        this.upperBound = upperBound;
        this.maxTime = maxTime;
    }

    public void Start() {
        int randomNumber = new Random().nextInt(this.upperBound);
        Scanner sc = new Scanner(System.in);
        TimerThread timer = new TimerThread(maxTime);
        String yourShot;
        int count = 0;
        System.out.print("\nO Jogo Vai Começar!!!!\nSua tentativa: ");

        while (true) {

            yourShot = sc.nextLine();
            count++;
            if (yourShot.isEmpty()) {
                System.out.print("Digite novamente: ");
            } else if (yourShot.equals(Integer.toString(randomNumber))) {
                timer.interrupt();
                System.out.println("\n****************************************\nParabens, você acertou o numero!!! \n" +
                        "Com " + count + " tentativas e em " + timer.getTime() + " segundos!!!!");
                break;

            }else if (!yourShot.equals(Integer.toString(randomNumber))) {
                System.out.print(Integer.parseInt(yourShot) > randomNumber ? "Esse numero é maior\nNova Tentativa: "
                                                                        : "Esse numero é menor" + "\nNova Tentativa: ");

            }

        }

    }

}
