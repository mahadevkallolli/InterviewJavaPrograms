package com.interviewPrograms;

public class PalindromNumber {
    public static void main(String[] args) {
        int remainder;
        int sum = 0;
        int number = 454;
        int temp = number;


        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println("RevNo is palindrome");
        } else
            System.out.println("not a palindrome");
    }
}
