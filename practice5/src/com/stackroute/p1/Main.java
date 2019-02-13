package com.stackroute.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String nums=scan.nextLine();
        int count=no_of_nums(nums);
        System.out.println(count);
        String array_of_num[]=new String[count];
        String temp="";
        int j=0;
        int sum=0;
        for(int i=0;i<nums.length();i++){
            if(nums.charAt(i)!=' '){
                temp+=nums.charAt(i);

            }
            else{
                array_of_num[j]=temp;
                j++;
                temp="";
            }
        }
        array_of_num[j]=temp;


        for (int i=0;i<array_of_num.length;i++){
            sum=sum+Integer.parseInt(array_of_num[i]);
            System.out.println(sum);
        }

    }

    public static int no_of_nums(String s){
        int count=1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }

}
