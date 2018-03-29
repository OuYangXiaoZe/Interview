package chizhuang;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    String s = in.nextLine();
	    int num =  new Test().checkswapnum(s);
	   System.out.println(num);
	}
	public int checkswapnum(String s){
		char currentchar;
		int num = 0;
       for(int i = 0;i < s.length()-1&&i < 10;i++){
    	   currentchar = s.charAt(i);
    	   if(currentchar == s.charAt(i+1)){
    		   num++;
    		   i++;
    	   }
       }
       return num;
	}
}
