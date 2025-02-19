package com.project;

public class WhileLoopChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int evenCount = 0;
		int oddCount = 0;
		while(a <= 20) {
			a++;
			if(!(isEvenNumber(a))) {
				oddCount++;
				continue;
			}
			System.out.println("Even Number " + a + " ");
			evenCount++;
			if(evenCount >= 5) {
				break;
			}
		}
		System.out.println("Number of Even Number: " + evenCount);
		System.out.println("Number of Odd Number: " + oddCount);

	}
	public static boolean isEvenNumber(int number) {
		if(number % 2 == 0) {
			return true;
		}
		return false;
	}

}
