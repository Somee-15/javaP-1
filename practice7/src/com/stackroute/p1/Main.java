package com.stackroute.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        int count = count_digit(num);
        long array_of_num[] = new long[count];
        int k = 0;
        long no = num;
        while (no > 0) {

            long r = no % 10;
            array_of_num[k] = r;
            no = no / 10;
            k++;
        }

        for (int i = 0; i <= array_of_num.length - 1; i++) {
            {
                for (int j = i + 1; j < array_of_num.length; j++) {
                    if (array_of_num[i] < array_of_num[j]) {
                        long temp = array_of_num[i];
                        array_of_num[i] = array_of_num[j];
                        array_of_num[j] = temp;
                    }
                }
            }
        }

        display(array_of_num);
        sum_even(array_of_num);

    }

    public static int count_digit(long num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void display(long a[]) {
        System.out.print("Sorted number in non-increasing order : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void sum_even(long a[]) {
        long sum = 0l;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum = sum + a[i];
            }
        }

        System.out.println();
        System.out.println("Sum of even numbers : " + sum);

        if (sum > 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
