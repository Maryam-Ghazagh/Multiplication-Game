package com.company;
import java.util.Random;
import java.util.Scanner;

public class Level1 {
    private Random rand;
    private Scanner input;


    public Level1() {
        rand = new Random();
        input = new Scanner(System.in);
    }

    public void test(){
        int score = 0;
        boolean finished = false;
        while(!finished && score <= 10) {
            int n = 1 + rand.nextInt(10);
            int m = 1 + rand.nextInt(10);
            System.out.println( m + " * " + n + " = ?");
            System.out.print("> ");
            int number = input.nextInt();
            input.nextLine();
            if (number == m * n) {
                ++score;
            }
            else {
                System.out.println("Current answer for " + m + " * " + n + " = " + m * n);
                System.out.println("Game over!" + "\n" +
                        "Good job! " + "Your score = " + score);
                finished = true;
            }
        }
        if (score > 10) {
            System.out.println("You win!" + "\n" + "Now you go to the level2!");
            Level2 level2 = new Level2();
            level2.test2();
            }
        else{
            System.out.println("if you want play again, Enter yes or y.");
            System.out.print("> ");
            String answer = input.nextLine();
            if(answer.equals("yes") || answer.equals("y") || answer.equals("Yes") || answer.equals("Y")){
                test();
            }
            else{
                System.out.println("Have a good time! Bye...");
            }
        }
    }

}
