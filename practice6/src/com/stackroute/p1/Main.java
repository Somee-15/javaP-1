package com.stackroute.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char character = scan.next().charAt(0);

        if(character>=65 && character <=90){
            System.out.println("Capital letter");
        }
        else if(character>=97 && character<=122){
            System.out.println("Small Case letter");
        }
        else{
            System.out.println("Digit or Special Character");
        }



    }
}
