package chizhuang;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    String s = in.nextLine();
	    int num = findMN(s);
	    System.out.println(num+1);
	}

	private static int findMN(String s) {
		boolean flag = true;
		
		if(s.length()%2!=0){
			return 0;
		}
		for(int i = s.length()-3; i > 0;i = i -2){
			flag = true;
			for(int j = i,head = (i+1)/2; j > (i+1)/2; j--){
				 
				if(s.charAt(j)==s.charAt(head-1)){
					head--;
				}else{
					flag = false;
					break;
				}
			}
			if(flag){
				return i;
			}
		}
		return 0;
	}
}
