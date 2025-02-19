package com.project;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((isPalindrome(111)? "Given Number is a Palindrome" :"Not a Palindrome"));
	}
	public static boolean isPalindrome(int number){
        int rev = 0;
        int org = number;
        while(org != 0){
            rev = rev*10 + org % 10;
            org /= 10;
            
        }
        return rev == number;
	}     

}
