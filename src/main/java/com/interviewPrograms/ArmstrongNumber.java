package com.interviewPrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number=371;
        int total=0;
        int original=number;
        int rem;
        while(number>0){
            rem=number%10;
            total=total+(rem*rem*rem);
            number=number/10;
        }
        if(original==total){
            System.out.println("armstrong number");
        }else
            System.out.println("not an armstrong number");
    }
}
