package com.project;

public class CodingExercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toMilesPerHour(250);
		printConversion(250);
	}
	public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour >= 0){
            kilometersPerHour /= 1.609;
            return Math.round(kilometersPerHour);
            
        }else{
            return -1;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0){
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }else{
            System.out.println("Invalid Value");
            return;
        }
    }

}
