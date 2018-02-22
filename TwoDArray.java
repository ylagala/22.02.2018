package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i=0; i<6; i++){
			List<Integer> l = new ArrayList<>();
			for(int j=0;j<6;j++)
			{
				l.add(sc.nextInt());
			}
			list.add(l);
		}
		//System.out.println(list);
		
		int sum =0;
		int max =0;

		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				
				sum =  list.get(i).get(j) + list.get(i).get(j+1) + list.get(i).get(j+2)
						+ list.get(i+1).get(j+1)
						+ list.get(i+2).get(j) + list.get(i+2).get(j+1)+list.get(i+2).get(j+2);
				
				if(sum > max){
					max = sum;
				}
				
				
			}
		}
		System.out.println(max);
		
		
		sc.close();
		

	}

}
