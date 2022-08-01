package com.company;

import java.util.Random;
import java.util.Scanner;

public class Level2 {
        private Random rand;
        private Scanner input;
        private int score;
        private boolean finished;

    public Level2() {
            rand = new Random();
            input = new Scanner(System.in);
            score = 10;
            finished = false;
        }
        public void test2(){
            while(!finished) {
                int n = 1 + rand.nextInt(20);
                int m = 1 + rand.nextInt(20);
                System.out.println( m + " * " + n + " = ?");
                System.out.print("> ");
                int number = input.nextInt();
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

        }

    }
