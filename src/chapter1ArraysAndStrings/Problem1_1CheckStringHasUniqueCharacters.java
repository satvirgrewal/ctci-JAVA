package chapter1ArraysAndStrings;

import java.util.Scanner;

public class Problem1_1CheckStringHasUniqueCharacters {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String ip = input.nextLine();
		
		boolean[] counter = new boolean[256];
		String duplicate = "unique";
		for(int i=0;i<ip.length();i++){
			if(counter[ip.charAt(i)]==true){
				duplicate = "repeated";
				break;
			}
			else{
				counter[ip.charAt(i)]=true;
			}
			
		}
		System.out.println("String contains " +duplicate + " characters");
	}
}
