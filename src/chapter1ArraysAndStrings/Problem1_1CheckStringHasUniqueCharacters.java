package chapter1ArraysAndStrings;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1_1CheckStringHasUniqueCharacters {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		boolean[] bool = new boolean[256];
		String string = scan.nextLine();
		for (int i=0; i<string.length();i++){
			int a = string.charAt(i);
			if(bool[a]&& a!=32) {
				System.out.println("String has duplicate characters");
				return;
			}
			bool[a] = true;
		}

		System.out.println("String has unique characters");
		scan.close();
	}
}
