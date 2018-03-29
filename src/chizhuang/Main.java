package chizhuang;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
	    Scanner in = new Scanner(System.in);
	    String s = in.nextLine();
	    int num = findMDS(s);
	    System.out.println(num);
	}
	public static int findMDS(String s){
		int maxnum = 0;
		int currentmaxnum = 0;
		
		for(int i = 0;i<s.length()&&i<50;i++){
		   if(checkchar(s.charAt(i))){
			   currentmaxnum++;
			   if(maxnum < currentmaxnum)
				   maxnum = currentmaxnum;
		   }else{
			   currentmaxnum = 0;
		   }	
		}
		return maxnum;
	}
	public static boolean checkchar(char c){
		switch(c){
		case 'A':  return true;
		case 'T':  return true;
		case 'G':  return true;
		case 'C':  return true;
		default :return false;
		}
	}
}
