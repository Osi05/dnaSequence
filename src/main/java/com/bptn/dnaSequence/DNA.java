package com.bptn.dnaSequence;

public class DNA {
	
	/*
	 Writing a DNA java program that determines whether there is a protein in a strand of DNA
	 */
	
	public static void main(String[] args) {
		
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";
		
		//creating dna and assigning dna2 to it
		
		String dna = dna2;
		
		//printing out length of dna
		
		System.out.println("Length of dna is: " + dna.length());
		
		//finding index of ATG
		
		int index = dna.indexOf("ATG");
		
		//Printing out the index 
		System.out.println("ATG was found at index: " + index);
		
	}

}
