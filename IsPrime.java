package com.project;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeCount = 0;
			for(int i = 10; primeCount < 3 && i <= 50; i++) {
				if(isPrime(i)) {
					System.out.println(i +" is" + (isPrime(i) ? " " : " Not ") + "a Prime Number");
					primeCount++;
				}
//				if(primeCount == 3) {
//					System.out.println("Found 3 - exit loop");
//					break;
//				}
			}
		
		
		
//		System.out.println("0 is" + (isPrime(0) ? " " : " Not ") + "a Prime Number");
//		System.out.println("1 is" + (isPrime(1) ? " " : " Not ") + "a Prime Number");
//		System.out.println("2 is" + (isPrime(2) ? " " : " Not ") + "a Prime Number");
//		System.out.println("51 is" + (isPrime(2) ? " " : " Not ") + "a Prime Number");
//		System.out.println("3 is" + (isPrime(3) ? " " : " Not ") + "a Prime Number");
//		System.out.println("11 is" + (isPrime(11) ? " " : " Not ") + "a Prime Number");
//		

	}
	public static boolean isPrime(int number) {
		if(number <= 2) {
			return (number == 2);
		}
		for(int divisor = 2; divisor < number;divisor ++) {
			if(number % divisor ==0) {
				return false;
			}
		}
		return true;
		
	}

}
