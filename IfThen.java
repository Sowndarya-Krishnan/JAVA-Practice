package com.project;

public class IfThen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isJavaEasy = true;
		if(isJavaEasy == true) {
			System.out.println("Java is easy to learn.");
		}
		int sow = 90;
		int sri = 85;
		if((sow >= 95) && (sow > sri)){
			System.out.println("Sowndhu topped the exam.");
			System.out.println("Sowndhu beat the score of Sri");
		}
		if((sow >100) || (sri < sow)) {
			System.out.println("More marks needed to get a centum");
		}
		

	}

}
