package com.stackroute.practice1;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter no");
        int num=scan.nextInt();
        if(num>20 && num<30) {
            if (even(num)) {
                System.out.println("Jerry");
            } else {
                System.out.println("Tom");
            }
        }
    }

    public static boolean even(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
