package com.minnumber;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа для поиска минимального из двух чисел:");
        int number1=Integer.parseInt(args[0]);
        int number2=Integer.parseInt(args[1]);
        if (number1 > number2) {
            System.out.println("Минимальное число " + number2);
        } else {
            System.out.println("Минимальное число " + number1);
        }
    }
}
