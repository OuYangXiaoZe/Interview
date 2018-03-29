package xiecheng.profit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
        while (in.hasNextLine()) {  
            String line = in.nextLine();  
            String[] arry = line.split(",");  
            int result = 0;  
            int length = arry.length;  
            for (int i = 0; i < length; i++) {  
                int a = Integer.valueOf(arry[i]);  
                for (int j = i + 1; j < length; j++) {  
                    int b = Integer.valueOf(arry[j]);  
                    if (b > a) {  
                        int c = b - a;  
                        if (c > result) {  
                            result = c;  
                        }  
                    }  
                }  
            }  
            System.out.println(result);  
        }  
    }  
}
