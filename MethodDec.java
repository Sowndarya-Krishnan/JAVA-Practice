package com.project;

public class MethodDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameOver = true;
		int score = 10_000;
		int levelCompleted = 8;
		int bonus = 200;
		
		calculate(gameOver,score, levelCompleted,bonus);
		calculate(true, 800, 5, 100);
		
		int highScore = calc(true, 1000, 6, 300);
		System.out.println("ur highScore is: " + highScore);
		// or 
		System.out.println("high score: " + calc(true, 1000, 6, 300));

	}
//	Method declaration with void return type
	
	public static void calculate(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		int finalScore = score;
		if(gameOver) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score is: " + finalScore);
		}
	}
// Method declaration with return return type
	public static int calc(boolean gameOver, int score, int levelCompleted, int bonus) {
		int finalScore = score;
		if(gameOver) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
//			System.out.println("Your final score is: " + finalScore);
		}
		return finalScore;
	}


}
