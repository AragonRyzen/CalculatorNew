package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Используется для занесения данных из консоли
        System.out.println("Введите первую цифру");
        double x1, x2, y;
        int v;
        x1 = in.nextDouble();//получение значения для первой переменной
        System.out.println("Введите вторую цифру");
        x2 = in.nextDouble();//получение значения для второй переменной
        System.out.println("Что необходимо сделать?\n1)Сложить\n2)Отнять\n3)Умножить\n4)Делить\n");
        v = in.nextInt();
        if (v == 1) {y = x1+x2; System.out.println("Результат сложения = "+ y);}
        if (v == 2) {y = x1-x2; System.out.println("Результат вычитания = "+ y);}
        if (v == 3) {y = x1*x2; System.out.println("Результат умножения = "+ y);}
        if (v == 4) {y= x1/x2; System.out.println("Результат деления = "+ y);}
        System.out.println("Hello WOrld");
        in.close();
    }
}
