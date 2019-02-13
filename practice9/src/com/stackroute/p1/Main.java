package com.stackroute.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String rev_word = rev(word);

        System.out.println(rev_word);

    }

    public static String rev(String word) {
        String rev_word = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev_word += word.charAt(i);

        }

        return rev_word;
    }
}
