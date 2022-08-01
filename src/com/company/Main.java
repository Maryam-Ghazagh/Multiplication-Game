package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Level1 level1 = new Level1();
        System.out.println("Welcome to this game!" + "\n" +
                "In this game we learn multiply together!" + "\n"+
                "If are you ready please enter 'y'.");
        System.out.print("> ");
        String answer = input.nextLine();
        if(answer.equals("y") || answer.equals("Y")){
            System.out.println("Lets start!");
            level1.test();
        }
    }
}
