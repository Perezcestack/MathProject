package com.example;

public class MathApplication {
        public static void main(String[] args) {
        int bobSalary = 100000;
        int garySalary = 150000;
        int highestSalary = Math.max(bobSalary,garySalary);

            System.out.println("The highest salary is " + highestSalary);
            // This is question one ^

            int carPrice = 5000;
            int truckPrice = 10000;
            int lowestCost = Math.min(carPrice, truckPrice);

            System.out.println("The lowest car price is " + lowestCost);
            // question 2 ^

            float circleRadius = 7.25f;
            float circleArea = (float) (circleRadius*circleRadius*3.14);

            System.out.println("The area of a circle is " + circleArea);
            // question 3 ^

            double square = 5.0;
            double root = Math.sqrt(square);

            System.out.println("The square root of " + square + " is " + root);
            //question 4 ^

            float negative = -3.8f;
            float absValue = Math.abs(negative);
            System.out.println("The absolute value of " + negative + " is " + absValue );
            //question 6 ^

            double random = Math.random();
            System.out.println("YOU'VE REQUESTED A RANDOM NUMBER SO HERE IT IS " + random);
            //question 7^

            //5. Find and display the distance between the points (5, 10) and (85, 50)
            // d=√((x2 – x1)² + (y2 – y1)²).

            double x1 = 5;
            double x2 = 85;
            double y1 = 10;
            double y2 = 50;

            double distance = Math.sqrt(Math.pow(x2 - x1,2) + (Math.pow(y2 - y1,2)));
            System.out.println("The distance between the points is " + distance);
        }
}
