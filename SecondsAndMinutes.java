package com.project;

public class SecondsAndMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(65,145));

	}
	public static String getDurationString(int seconds) {
		int minutes = seconds /60;
		int hour = minutes / 60;
		int remaingMin = minutes % 60;
		int remaingSec = seconds % 60;
		return hour + "h:" + remaingMin + "m:" + remaingSec + "s";
	}
	public static String getDurationString(int minutes, int seconds) {
		int hour = minutes / 60;
		int remainingMin = minutes % 60;
		int remainingSec = 0;
		if(seconds >= 60) {
		     int secMin = seconds / 60;
		     remainingMin += secMin;
		     remainingSec = seconds % 60;
		}
		
		return hour+"h:"+remainingMin+"m:"+remainingSec+"s";
	}
	

}
