package com.project;

public class ElseIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 45;
		if(mark <= 50){ //if this if condition gets true the else if statement won't get executed
			System.out.println("You got failed");
		}else if((mark > 50) && (mark <=95)){
			System.out.println("Good keep it up");
		}else {
			System.out.println("Good job");
		}
		
	}
	

}
