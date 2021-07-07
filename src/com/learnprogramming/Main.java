package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte myByteVariable = 10;
        short myShortVariable = 20;
        int myIntVariable = 50;
        int sum = (myByteVariable + myShortVariable + myIntVariable);
        System.out.println("Sum = " + sum);
        long myLongVariable = 50000 + (10 * sum);
        System.out.println("myLongVariable = " + myLongVariable);

        short shortTotal = (short) (1000 + 10 *
                (myByteVariable + myShortVariable + myIntVariable));

        System.out.println(shortTotal);
    }

}
