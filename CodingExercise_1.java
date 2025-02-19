package com.project;

public class CodingExercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumber(0);
		
	
	}
	public static void checkNumber(int number){
         if (number > 0){
             System.out.println("positive");
         } else if (number < 0) {
             System.out.println("negative");
         } else if (number == 0) {
             System.out.println("zero");
         }
        System.out.println(number>0 ? "positive" : (number < 0 ? "negative" : "zero"));
    }

}
