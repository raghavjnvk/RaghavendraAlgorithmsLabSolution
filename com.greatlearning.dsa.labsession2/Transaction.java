package com.greatlearning.dsa.labsession2;

import java.util.Scanner;

public class Transaction {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the size of transaction array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("\n  Enter the values of array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("\n Enter the total no of targets that needs to be acheived");
        int targetNo = sc.nextInt();
        while (targetNo-- != 0) {
            int flag = 0;
            long target;
            System.out.println("\n Enter the value of Target");
            target = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                sum += array[i];
                if (sum >= target) {
                    System.out.println(" \n Target acheived after:" + (i + 1) + "transactions");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(" \n Given Target is not acheived ");
            }
        }
    }


}
