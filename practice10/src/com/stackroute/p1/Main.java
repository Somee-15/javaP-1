package com.stackroute.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int num=scan.nextInt();
        String extra="";
        for (int i=word.length()-num;i<word.length();i++){
            extra+= word.charAt(i);
        }

        for (int i=0;i<num;i++){
            word+=extra;
        }

        System.out.println(word);

    }
}
