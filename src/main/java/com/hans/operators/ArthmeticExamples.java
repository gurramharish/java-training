package com.hans.operators;

import java.util.Scanner;

public class ArthmeticExamples {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = scan.nextInt();
        System.out.println("Enter number 2: ");
        // Hello harish
        int n2 = scan.nextInt();
        int total = n1 + n2;
        System.out.println(total);

        double q = n1 / (n2 + 0.0f);
        int r = n1 % n2;
        System.out.println("Multiply : " + (n1 * n2));
        System.out.println("Quient : " + q);
        System.out.println("Reminder : " + r);


        int  x = 10;
        int y = 20;
        // x2 + y2 + x2ab
        int xPlusYWholeSquare = (x * x) + (y * y) + (2 * x * y);
    }
}
