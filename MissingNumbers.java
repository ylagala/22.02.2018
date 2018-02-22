package Arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204
*/
public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		List<BigInteger> list1 = new ArrayList<>();
		for(int i=0; i<m; i++){
			list1.add(sc.nextBigInteger());
		}
		List<BigInteger> list2 = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			list2.add(sc.nextBigInteger());
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		for(int i=0; i<list2.size()-1; i++){
			int rem =  Collections.binarySearch(list2, list1.get(i));
			if(rem != -1){
				list2.remove(rem);
			}
		}
		list2.stream().forEach(i -> System.out.print(i + " "));
		sc.close();

	}

}
