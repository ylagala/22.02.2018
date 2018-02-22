package Arrays;
/*
 * 
 * 6
31415926535897932384626433832795
1
3
10
3
5
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BigSorting {

	  static String[] bigSorting(String[] arr) {
		  //List<String> list = new ArrayList<>();
		  
		  
		  
	       /* for(int i=0; i<arr.length; i++){
	            list.add(arr[i]);
	        }*/
	       
	         Arrays.sort(arr,new Comparator<String>() {
	        	public int compare(String o1,String o2){
	        		int o1Len = o1.length();
	        		int o2Len = o2.length();
	        		
	        		if(o1Len > o2Len){
	        			return 1;
	        		}
	        		else if (o1Len < o2Len) {
						return -1;
					}
	        		else{
	        			for(int i=0; i<o1Len; i++){
	        				if(o1.charAt(i) > o2.charAt(i)){
	        					return 1;
	        				}
	        				else if (o1.charAt(i) < o2.charAt(i)) {
								return -1;
							}
	        				else
	        				{
	        					return 0;
	        				}
	        			}
	        			return 0;
	        		}
	        		
	        		
	 	        	}
			}); 
		  
	         Arrays.sort(arr, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return 0;
				}
	        	
			});
		   
             
	        return arr;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] arr = new String[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.next();
	        }
	        String[] result = bigSorting(arr);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
	        }
	        System.out.println("");


	        in.close();
	    }

}
