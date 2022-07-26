package org.example.LoopEx;

public class DoWhileLoop {

    public static void main(String[] args) {

    }
    public void doWhileLo() {


    int applesToEat = 4;

        do
    { // DO

        applesToEat++;  //increases one step
        applesToEat--;  //decreases one step

    } while(applesToEat !=0 && applesToEat <4);
        System.out.println(applesToEat);


// DO LOOP 2
        int right = 10;

        do {
            System.out.println("Now is the value of 'right': " + right);
            right++;

        } while (right <= 0);

        System.out.println("And now is value of 'right': " + right);
        System.out.println();

    }
}
