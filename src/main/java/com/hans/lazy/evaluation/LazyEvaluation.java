package com.hans.lazy.evaluation;

public class LazyEvaluation {

    private static int add(int a, int b) {
        System.out.println("Called add!!");
        return a + b;
    }

    private static int evalute(int n) {
        return n;
    }

    public static void main(String[] args) {
        int x = 4;

        int temp = add(10, 20);
        if(x > 5 && temp > 20) {
            System.out.println("Path 1");
        } else {
            System.out.println("Path 2");
        }
    }
}
