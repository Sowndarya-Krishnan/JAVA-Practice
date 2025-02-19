package com.project;

//import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the letter");
//		char letter = in.next().charAt(0);
		char letter = 'y';
		switch(letter) {
		case 'A': 
			System.out.println("Able");
			break;
		case 'B': 
			System.out.println("Baker");
			break;
		case 'C': 
			System.out.println("Charlie");
			break;
		case 'D': 
			System.out.println("Dog");
			break;
		case 'E': 
			System.out.println("Easy");
			break;
		default:
			System.out.println(letter + " is not found");
		}

	}

}
