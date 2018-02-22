package Arrays;

import java.util.Scanner;

public class PairArray {

	 static int pairs(int k, int[] arr) {
		   int diff =0;
	        for(int i=0; i<arr.length; i++){
	        	for(int j=0; j<arr.length; j++)
	        	if((arr[i]-arr[j]) == k){
	        		diff++;
	        	}	
	        }
	        
	        return diff;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] arr = new int[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        int result = pairs(k, arr);
	        System.out.println(result);
	        in.close();
	    }

}
