package com.project;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String isCar = "Hyundai i20";
//		boolean familycar = isCar == "Hyundai i20" ? true : false;
//		System.out.println(familycar);
		double first = 20.00;
		double second = 80.00;
		double a = first + second*100;
		System.out.println(a);
		double rem = a % 40.00;
		System.out.println(rem);
		boolean res = (rem == 0.00)? true : false;
		System.out.println(res);
		if(!res) {//res != true
			System.out.println("Got some reminder");
		}

	}

}
