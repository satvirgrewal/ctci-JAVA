package chapter1ArraysAndStrings;

import java.util.Scanner;

public class Problem2_ReverseCString {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String ip = scan.nextLine();
		scan.close();
		char[] input = ip.toCharArray();
		int i = 0;
		int j = input.length-1;
		char temp;
		while(i<j){
			temp = input[i];
			input[i] = input[j];
			input[j] = temp;
			i++;
			j--;
		}
		String result = new String(input);
		System.out.println(result);
	}
}
