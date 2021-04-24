package binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek10815 {

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int K = Integer.parseInt(br.readLine());
		
		
		long line[]= new long[K];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		for(int i=0;i<K;i++) {
			
			line[i]=Long.parseLong(st1.nextToken());
			
		}
		
		Arrays.sort(line);
		
		int flag=0;
	
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
		
		
		
			int value = Integer.parseInt(st.nextToken());
			long right = line.length-1;
			long left= 0;
			long mid =0;
			flag=0;
			while(left<=right) {
			
			mid = (left+right)/2;
			
			
			
			if(line[(int) mid] ==value) {flag =1; break;}
			
			if(line[(int) mid] >value) {
				right = mid-1; 	
			}
			else
				left = mid +1;
						
			
			
		}
			System.out.print(flag+" ");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}


}

		


	

	

	


