package com.company;
import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    private int userNumber;
    int randomNumber;
    static int chancesPlayed;
    private int number2;
    GuessTheNumber(){this.randomNumber = random.nextInt(101);
        chancesPlayed = 0;}

    public void TakeInputUser(){
        System.out.print("Enter a number: ");
        userNumber = sc.nextInt();}
    public void isCorrectNumber(){
        do {
            TakeInputUser();
                if (randomNumber == userNumber) {
                    System.out.println("WIN WIN WIN!!! YOU GUESSED THE CORRECT ANSWER");
                }

                if (userNumber > randomNumber){
                    System.out.println("You guessed a BIGGER number");
                    chancesPlayed += 1;
                }

                if(userNumber < randomNumber){
                    System.out.println("You guessed a SMALLER number");
                    chancesPlayed += 1;
                }

        }while(userNumber != randomNumber);
    }

    public void getter(){
        System.out.println("Congrats! Answer: "+randomNumber+" But lives you used: "+chancesPlayed);
    }

}

public class _43_Exercise3 {
    public static void main(String[] args) {
        GuessTheNumber player1 = new GuessTheNumber();
        player1.isCorrectNumber();
        player1.getter();
        GuessTheNumber player2 = new GuessTheNumber();
        player2.isCorrectNumber();
        player2.getter();
        /*
        * here you can create N number of players[objects] play with them
        * When you complete the java course do come for me and check if there is way we can compare results of
        * objects and declare a winner
        * Not now once you figure please come back ABOOD */
    }
}
