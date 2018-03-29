package xiecheng.binarySearch;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
        while (in.hasNextInt()) {  
            int num = in.nextInt();  
            int qty = in.nextInt();  
            int nums[] = new int[qty];  
            for (int i = 0; i < qty; i++) {  
                nums[i] = in.nextInt();  
            }  
            System.out.println(binarySearch(nums, num));  
        }  
    }  
  
    public static int binarySearch(int[] array, int desc) {  
        int low = 0;  
        int high = array.length - 1;  
        int middle = 0;  
        while (low <= high) {  
            middle = (low + high) / 2;  
            if (desc == array[middle]) {  
                return middle;  
            } else if (desc < array[middle]) {  
                high = middle - 1;  
            } else {  
                low = middle + 1;  
            }  
        }  
        int result = 0;  
        for (int i = 0; i < array.length; i++) {  
            if (array[i] < desc) {  
                result++;  
            }  
        }  
        return -1 - result;  
    }  
}
