package com.task4;

public class Main {
    public static void main(String[] args) {

        int step=Integer.parseInt(args[0]);
        int result1 = 0;

        for (int num1=1; num1<=20; num1++) {
            result1 = result1+step;
            System.out.print(result1 + ", ");
        }
        System.out.println("");

    }
}
