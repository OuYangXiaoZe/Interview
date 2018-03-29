package chizhuang;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    String s = in.nextLine();
	    int num = findMN(s);
	    
	    System.out.println(num!=0?num:1);
	}

	private static int findMN(String s) {
		int[] array = new int [26];
		int num=0;
		for(int i = 0; i <= s.length()-1; i++){
		
			array[s.charAt(i)-97] +=  1;
		}
		for(int i=0;i<26;i++)
		if(array[i]%2 != 0){
			num++;
		}
		return num;
	}
}
