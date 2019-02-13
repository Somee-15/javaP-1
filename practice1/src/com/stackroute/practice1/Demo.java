package com.stackroute.practice1;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
	    System.out.println("Enter no");
	    long num=scan.nextLong();
	    if(palindrome(num)){
	       if(sum_even(num)>25){
	           System.out.println(num+" is palindrome and the sum of even numbers is greater than 25");
           }
	       else{
	           System.out.println(num+" is palindrome and sum of even numbers is less than 25");
           }
        }
	    else
        {
            System.out.println(num+" is not palindrome");
        }
    }

    public static boolean palindrome(long num){
        long rev_num=0;
        long org_num=num;
        while(num!=0){
            long r=num%10;
            rev_num=rev_num*10+r;
            num=num/10;
        }
        if(rev_num==org_num){
            return true;
        }
        else {
            return false;
        }
    }
    public static long sum_even(long num){
        long sum=0;

        while (num!=0){
            long r=num%10;
            if(r%2==0){
                sum=sum+r;
            }
            num=num/10;
        }
        return sum;
    }
}
