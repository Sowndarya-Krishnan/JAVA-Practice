package com.project;

public class Sum3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		for(int i = 1; i<= 1000; i++) {
			if((i % 3 == 0) && (i % 5 == 0) && (count < 5)) {
				count++;
				System.out.println(i + " is divisible by both 3 and 5");
				sum += i;
			}
		}
		System.out.println("The sum of first 5 terms: " + sum);

	}

}
