package com.project;

public class CE_3MegaByteConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(5000);
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes){
		if (kiloBytes < 0){
			System.out.println("Invalid Value");
	        return; // or can use else statement
	    } 
	    System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + 
	    (kiloBytes % 1024) + " KB");
	        
	}

}
