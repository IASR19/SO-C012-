package br.iasr19;
import br.iasr19.Thread.GuessGame;

public class ThreadApp 
{
    public static void main( String[] args )
    {
        GuessGame game = new GuessGame(100, 40);

        game.Start();
    }
}
