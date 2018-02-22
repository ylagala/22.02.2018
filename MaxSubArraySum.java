package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

public class MaxSubArraySum {

	static long maximumSum(long[] a, long m) {
		
        //LongStream.of(a).forEach(System.out::print);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<a.length; i++){
        	sb.append(String.valueOf(a[i]));
        }
        //System.out.println(sb);
        
        
        HashSet<Long> hs = new HashSet<>();
        for(int i=0; i<=sb.length(); i++){
        	for (int j = i; j < sb.length(); j++) {
        	hs.add(Long.valueOf(sb.substring(i, j+1)));
        }
        
        }
        System.out.println(hs);
        List<Long> list = new ArrayList<>();
        for(int i=0; i<hs.size(); i++){
        	 long num = hs.iterator().next();
             long sum = 0;
             while (num > 0) {
                 sum = sum + num % 10;
                 num = num / 10;
             }
             list.add(sum % m);
        }
        
        long max = Collections.max(list);
        
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            long m = in.nextLong();
            long[] a = new long[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextLong();
            }
            long result = maximumSum(a, m);
            System.out.println(result);
        }
        in.close();
    }

}
