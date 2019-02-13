package com.stackroute.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no");
        int num=scan.nextInt();
        for(int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
        }
    }
}
