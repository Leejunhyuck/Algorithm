package binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek2805 {
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		
		int K = Integer.parseInt(str[0]);
		long N = Long.parseLong((str[1]));
		
		long line[]= new long[K];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0;i<K;i++) {
			
			line[i]=Long.parseLong(st.nextToken());
			
		}
		
		Arrays.sort(line);
		
		long max = line[K-1];
		long min= 1;
		long mid =0; 
		
		
		while(min<=max) {
			mid = (max+min)/2;
			long count =0;
			long total=0;
			
			for(int i=0;i<K;i++) {
				count = line[i]-mid;	
				
				if(count <0)
					count =0;
				
				total += count;
				
			}
			
			
			if(total >=N) {
				
				min = mid +1;
			}
			else
				max = mid-1;
			
			
			
		}
		System.out.println(max);
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}


}

		