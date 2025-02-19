package com.project;

public class MethodChanange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int position = calculateHighScorePosition(1500);
		dispalyHighScorePosition("Tim", position);
		
		position = calculateHighScorePosition(1000);
		dispalyHighScorePosition("bob", position);
		
		position = calculateHighScorePosition(500);
		dispalyHighScorePosition("gim", position);
		
		position = calculateHighScorePosition(100);
		dispalyHighScorePosition("lim", position);
		
		position = calculateHighScorePosition(25);
		dispalyHighScorePosition("him", position); 

	}
	public static void dispalyHighScorePosition(String playerName, int playerPosition) {
		System.out.println(playerName + " managed to get into position " + playerPosition  + " on high score list.");
	}
	public static int calculateHighScorePosition(int playerScore) {
		int result = 0;
		if(playerScore >= 1000) {
			result = 1;
		}else if(playerScore >= 500 && playerScore < 1000) {
			result = 2;
		}else if(playerScore >= 100 && playerScore < 500) {
			result = 3;
		}else {
			result = 4;
		}
		
		return result;
	}

}
