package com.example;

public class forlorn {
    public static void main(String[] args) {
        // print hi and how many times loop starts until random hits under .05
        boolean done = false;
        int counter = 1;
        while (!done) {
            System.out.println("hi " + counter++);
            if (Math.random() < .05) {
                done = true;
            }
        }
        // print even number of 20 using a loop
        for(int i = 0; i < 20; i = i + 2) {
            System.out.println(i);
        }

        // print names of fruit I like for each fruit in the array
        String[] fruits = {"Pomegranate", "Cherry's", "Oranges", "Mango", "Plums", "Kiwis", "Pears"};

        for (String fruit : fruits) {
            System.out.println("I love " + fruit);
        }

        // print song "10 little monkeys jumping on the bed, one fell of and bumped his head,
        // mommy called the doctor and the doctor said no more monkeys jumping on the bed"
        boolean done2 = false;
        int monkeys = 10;
        while(!done2) {
            System.out.println(monkeys +" " +  "little monkeys jumping on the bed, one fell of and bumped his head, mommy called the doctor and the doctor said no more monkeys jumping on the bed!");
            monkeys--;
            if(monkeys <= 1){
                System.out.println(monkeys +" " +  "little monkey jumping on the bed, one fell of and bumped his head, mommy called the doctor and the doctor said no more monkeys jumping on the bed!");
                done2 = true;
            }
        }
    }
}


