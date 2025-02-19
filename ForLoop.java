package com.project;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(double inst = 2; inst <= 6; inst++) {
//			System.out.println("10000 at "+ inst + "% intrestRate = "+ 
//					calculateIntrest(10_000,inst));
//		}
		for(double inst = 7.5; inst <= 10; inst+=0.25) {
			double intrestAmount = calculateIntrest(100,inst);
			if(intrestAmount > 8.5) {
				break;
			}
			System.out.println("100$ at "+ inst + "% intrestRate = $"+intrestAmount);
		}
	}
	public static double calculateIntrest(double amount, double intrestRate) {
		return (amount * (intrestRate/100));
	}

}
