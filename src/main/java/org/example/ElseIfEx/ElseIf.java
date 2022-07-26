package org.example.ElseIfEx;

public class ElseIf {

    // If statement
    public void ifExer() {

        int num = 70;

        if (num < 100) {
            System.out.println("Number is less then hundred.");
        }


        // nested if statement

        int numb = 70;

        if (numb < 100) {
            System.out.println("1");

            if (numb < 75) {
                System.out.println("2");

            }
        }
    }

    public void ifExer2() {
        int num = 1234;

        if(num <100 && num >=100){
            System.out.println("Two digital number");
        }
        else if (num <1000 && num >= 100) {
            System.out.println("Three digital number");
        }
        else if (num <10000 && num >= 1000){
            System.out.println("Four digital number");
        }
        else if (num <100000 && num >=10000) {
            System.out.println("Five digital number");
        }
        else {
            System.out.println("Not between 1 and 99999");
        }
    }
}