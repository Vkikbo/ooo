package First;

import java.util.Scanner;

public class Main {
    public static int returnRandInt(int scale) {
        return (int) (Math.random() * scale);
    }

    public static void main(String[] args) {
        /////task 3/////
        int[] Mas = {1, 3, 5, 6, 8, 10};
        int sum = 0;
        for (int a : Mas) {

            sum += a;
        }
        System.out.println("Число суммы равно: " + sum);
/////Task 4/////
        System.out.println((int) returnRandInt(100));
        ////TASK 6 ////
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите рамзер массива: ");
        n = in.nextInt();
        arr = new int[n];
        for(int i:arr)
            i=(int)(Math.random() *n);
        System.out.println(n);
        }/*
Shape triangl =new Shape( numberOfShape:3, nameOfShapes:"triangle" */
    }







