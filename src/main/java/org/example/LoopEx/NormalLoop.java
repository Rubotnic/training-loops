package org.example.LoopEx;

import java.util.Scanner;

public class NormalLoop {

public void normLoop(){

        Scanner scan = new Scanner(System.in);

        System.out.println("How many cups of coffee can you drink? ");
        int cupOfCoffee = scan.nextInt();

        if (cupOfCoffee >= 15) {
            System.out.println("I think you're addicted to coffee.");
        } else {
            System.out.println("Well, me too.");
        }
    }
}
