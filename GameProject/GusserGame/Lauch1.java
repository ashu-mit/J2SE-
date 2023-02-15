package GusserGame;

import java.util.Scanner;

public class Lauch1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how much you want to play");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            umpire ump=new umpire();
            ump.InputFromGusser();
            ump.InputFromPlayer();
            ump.Compare();
        }




    }
}

class Gusser
{
    int guessNum;

    int GuessTheNumber()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Gusser,Guess a Nummber and provide the input");
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class Player
{
    int guessNum;

    int GuessTheNumber()
    {
        System.out.println("Player,Guess a Number and provide the input");
        Scanner sc=new Scanner(System.in);
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class umpire
{
    int guessNumByPlayer1;
    int guessNumByPlayer2;
    int guessNumByPlayer3;
    int guessNumByGusser;

    void InputFromGusser()
    {
        Gusser g=new Gusser();
        guessNumByGusser=g.GuessTheNumber();
    }
    void InputFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        guessNumByPlayer1=p1.GuessTheNumber();
        guessNumByPlayer2=p2.GuessTheNumber();
        guessNumByPlayer3=p3.GuessTheNumber();
    }
    void Compare()
    {
        if(guessNumByGusser==guessNumByPlayer1)
        {
            {
                if(guessNumByGusser==guessNumByPlayer2 && guessNumByGusser==guessNumByPlayer3)
                {
                    System.out.println("All are winner");
                }
                else if (guessNumByGusser==guessNumByPlayer2)
                {
                    System.out.println("player 1 and 2 are winner");
                }
                else if (guessNumByGusser==guessNumByPlayer3)
                {
                    System.out.println("player 1 and 3 are winner");
                }
                else {
                    System.out.println("player 1 and 2 are winner");
                }
            }
        }
        else if(guessNumByGusser==guessNumByPlayer2) {
            if (guessNumByGusser == guessNumByPlayer3)
            {
                System.out.println("player 2 and 3 are winner");
            }
            else
            {
                System.out.println("player 2 is winner");
            }
        }
        else if(guessNumByGusser==guessNumByPlayer3)
        {
            System.out.println("player 3 is winner");
        }
        else
        {
            System.out.println("No one is winner");
        }
    }
}