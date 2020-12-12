package com.multiplicationtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа для вывода на экран таблицы умножения:");
        System.out.println("Вариант 1:");
        int result;
        for (int num1=1; num1<=10; num1++) {

            for (int num2=1; num2<=10; num2++) {

                result = num1*num2;
                System.out.print(num1 + " * " + num2 + " = " + result+ ", ");

            }
            System.out.println("");
        }

        System.out.println("Вариант 2:");
        int num1=1; int num2;

        while (num1<=10) {
            num2=1;
            while (num2<=10) {
                result = num1*num2;
                System.out.print(num1 + " * " + num2 + " = " + result+ ", ");
                num2++;
            }
            System.out.println("");
            num1++;
        }

    }
}
