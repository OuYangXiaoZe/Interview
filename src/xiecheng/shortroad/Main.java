package xiecheng.shortroad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
        while (in.hasNextLine()) {  
            int num = Integer.valueOf(in.nextLine());  
            int[][] nums = new int[num][num];  
            for (int i = 0; i < num; i++) {  
                String line = in.nextLine();  
                String[] strs = line.split(",");  
                for (int j = 0; j < num; j++) {  
                    nums[i][j] = Integer.valueOf(strs[j]);  
                }  
            }  
            int result = 0;  
            for (int i = 1; i < num; i++) {  
                int a = nums[i][0];  
                for (int j = 0; j < i; j++) {  
                    if (nums[i][j] < a) {  
                        a = nums[i][j];  
                    }  
                }  
                result += a;  
            }  
            System.out.println(result);  
        }  
    } 
}
