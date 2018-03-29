package test2;

import java.util.Scanner;

public class test {
       public static void main(String[] args){
    	  Scanner in = new Scanner(System.in);
    	  String a = in.nextLine();
    	   System.out.println(checknum(a));
        }
    public static int checknum(String str){
    	
		int[] dp = new int[str.length()];
		dp[0] = 1;
    	for(int i=1;i<=str.length()-1;i++){
    		if(str.charAt(i-1)== '1' || str.charAt(i-1) == '2'){
    			dp[i] = dp[i-1]*2;
    		}else{
    			dp[i] = dp[i-1];
    		}
    	}
		return dp[str.length()-1];
    }
}
