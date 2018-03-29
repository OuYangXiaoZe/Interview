package test1;

import java.util.HashSet;
import java.util.Scanner;

// ����������
public class Main {

    public static void main(String[] args) {
     double d=15.2%5;
     System.out.println(d);
    }

    private static void sum(int a, long b) {
	  System.out.println("int"+(a+b));
		
	}
    private static void sum(int a, float b) {
    	System.out.println("int2");
		
	}
    private static void sum(int a, double b) {
    	System.out.println("int3");
		
	}

	@SuppressWarnings("resource")
    private void input() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);
        int[] array = new int [n];
        int index = 0;
        while (index<n) {
            array[index] = in.nextInt();
            System.out.print(array[index]);
            index++;
        }
        if (n == 0)    return ;
        solve(n, array);
        in.close();
    }

    private void solve(int n, int[] array) {
        int[] dp = new int [n+1];
        dp[0] = 1;
        for (int i=1; i<=n; i++) {
            HashSet<Integer> set = new HashSet<>();
            int j = i-1;
            while (j>=0 && !set.contains(array[j])){
                set.add(array[j]);
                dp[i] += dp[j];
                dp[i] = (int) (dp[i] % (Math.pow(10,9)+7));
                j--;
            }
        }
        System.out.println(dp[n]);
        return ;
    }
}