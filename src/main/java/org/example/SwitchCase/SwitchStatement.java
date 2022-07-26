package org.example.SwitchCase;

public class SwitchStatement {

    public void switStat() {

        int numb = 2;

        switch (numb + 2) {
            case 1:
                System.out.println("Value is " + numb);
            case 2:
                System.out.println("Value is " + numb);
            case 3:
                System.out.println("Value is " + numb);
            default:
                System.out.println("Default value is " + numb);
        }
    }
}