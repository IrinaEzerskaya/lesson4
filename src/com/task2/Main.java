package com.task2;

public class Main {
    public static void main(String[] args) {
        int number1=Integer.parseInt(args[0]);
        if (number1 > 0) {
            System.out.println("Положительное число " + number1);
        } else if (number1==0){
            System.out.println("Равно нулю " + number1);
        }
        else {
            System.out.println("Отрицательное число " + number1);
        }

        if (number1 %2 ==0){
            System.out.println("четное " + number1);
        } else {
            System.out.println("нечетное " + number1);
    }

    }
}