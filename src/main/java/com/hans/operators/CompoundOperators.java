package com.hans.operators;

public class CompoundOperators {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("A : " + a);

        int b = ++a;
        int c = b++;
        System.out.println("B: " + b);
        System.out.println("C : " + c);
        System.out.println("A : " + a);

        int d = --c;
        int e = c--;
        System.out.println("D: " + d);
        System.out.println("E : " + e);
        System.out.println("C: " + c);

        int x = 20;
        x += 23;
        System.out.println("X : " + x);

        x -= 10; // 33
        x *= 3; // 99
        x /= 10; // 9
        System.out.println("X : " + x);
    }
}
