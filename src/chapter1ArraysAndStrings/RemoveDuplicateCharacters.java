package chapter1ArraysAndStrings;

import java.util.Arrays;

public class RemoveDuplicateCharacters {
	
	public static void main(String[] args){
		char[] input = {'a','b','a','d','e','f','g'};
		removeDuplicates(input);
		System.out.println(Arrays.toString(input));
	}
	
	public static void removeDuplicates(char[] str) {
		if (str == null) return;
		 int len = str.length;
		 if (len < 2) return;
		
		 int tail = 1;
		
		 for (int i = 1; i < len; ++i) {
		 int j;
		 for (j = 0; j < tail; ++j) {
		 if (str[i] == str[j]) break;
		 }
		 if (j == tail) {
		 str[tail] = str[i];
		 ++tail;
		 }
		 }
		 str[tail] = 0;
		 }
	
	public static void removeDuplicatesSatvir(char[] string){
		for(int i = 1; i < string.length; i++){
			for (int j=0; j<i; j++){
				if (string[j]==string[i]){
					string[i] = string[i+1];
					i++;
				}
			}
		}
		
	}

}
