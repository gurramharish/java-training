package com.hans.operators;

import java.util.Scanner;

public class ConditionalOperators {


    public static void main(String[] args) {
        System.out.println("Please enter number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(check1(n) && check2(n)) {
            System.out.println("Hello");
        } else if (check1(n) || check2(n)) {
            System.out.println("Hi");
        } else {
            System.out.println("Unlucky!!");
        }

        int n1 = 20;
        int n2 = 30;

        /*
        if( n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }*/

        int max = n1 > n2 ? n1 : n2;
        System.out.println("Max : " + max);

    }

    private static boolean check1(int n) {
        System.out.println("In check 1");
        return n % 3 == 0;
    }

    private static boolean check2(int n) {
        System.out.println("In check 2");
        return n % 5 == 0;
    }
}
