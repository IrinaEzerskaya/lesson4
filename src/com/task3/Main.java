package com.task3;

public class Main {
    public static void main(String[] args) {

        int result;
        for (int num1=1; num1<=10; num1++) {

            for (int num2=1; num2<=10; num2++) {

                result = num1*num2;
                System.out.print(num1 + " * " + num2 + " = " + result+ ", ");

            }
            System.out.println("");
        }

    }
}
