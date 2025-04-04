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
		
		//finding index of TGA
		int stop = dna.indexOf("TGA");
		
		//Printing out the index 
		System.out.println("ATG was found at index: " + stop);
		
		//checking for protein in dna
		if(index != -1 && stop != -1) {
			System.out.println("Protein found!");
		}
		else {
			System.out.println("No protein found");
		}
		
	}

}
