package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean javaProgrammer = true;

        while(javaProgrammer) {
            System.out.println("How many months do you need to train coding Java to be a Java programmer?");
            int months = scan.nextInt();

            if (months >= 80 && months <= 90) {
                System.out.println("O my god, hurry up man!");
            }

            if (months >= 100) {
                System.out.println("Yes, after 100 months your are a good java programmer.");
                break;
            }
            else {
                System.out.println("You are still a rookie.");
                javaProgrammer = true;
            }
        }
    }
}