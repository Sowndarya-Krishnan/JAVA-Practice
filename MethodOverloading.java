package com.project;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("5ft 8in= " + inchToCentimeter(5,8) + " cm");
		System.out.println("68in= " + inchToCentimeter(68) + " cm");
	}
	public static double inchToCentimeter(int heightInInch) {
		
		return heightInInch * 2.54;
	}
	public static double inchToCentimeter(int heightInFeet, int remainHeightInInch) {
		int inch = heightInFeet * 12 + remainHeightInInch;
		double result = inchToCentimeter(inch);
		return result;
//		return (heightInFeet * 12 + remainHeightInInch) * 2.54;
//		return inchToCentimeter(heightInFeet * 12 + remainHeightInInch);
	}

}
