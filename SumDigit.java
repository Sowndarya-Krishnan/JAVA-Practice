package com.project;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigit(32123));

	}
	public static int sumDigit(int num) {
		int last = 0;
		if(num > 0) {
			while(num > 0) {
				int rem = num % 10;
				last += rem;
				num /= 10;
			}
			return last;
		}
		return -1;
	}

}
