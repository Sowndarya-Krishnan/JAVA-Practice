package com.project;

public class AdvaceSwitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDayOfWeek(1);
		printDay(8);
	}
	public static void printDayOfWeek(int day) {
		
		String dayOfWeek = switch(day){
		case 0 -> "0 is Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Invalid";
		};
		System.out.println(day + " stand for " + dayOfWeek);
	}
	public static void printDay(int day) {
		String dayOfWeek = "Invalid";
		if(day == 0) {
			dayOfWeek = "Sunday";
		}else if(day == 1) {
			dayOfWeek = "Monday";
		}else if(day == 2) {
			dayOfWeek = "Tuesday";
		}else if(day == 3) {
			dayOfWeek = "Wednesday";
		}else if(day == 4) {
			dayOfWeek = "Thrusday";
		}else if(day == 5) {
			dayOfWeek = "Friday";
		}else if(day == 6) {
			dayOfWeek = "Saturday";
		}
		System.out.println(day + " stand for " + dayOfWeek);
	}
}
