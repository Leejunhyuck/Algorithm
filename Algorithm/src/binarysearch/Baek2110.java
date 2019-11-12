package binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baek2110 {
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		
		int K = Integer.parseInt(str[0]);
		long N = Long.parseLong((str[1]));
		
		long line[]= new long[K];
		
		for(int i=0;i<K;i++) {
			
			line[i]=Long.parseLong(br.readLine());
			
		}
		
		Arrays.sort(line);
		
		long right = line[K-1]-line[0];
		long left= 1;// 가능한 최소 거리
		long mid =0;
		int ans=0;
		int d=0;
		
		
		while(left<=right) {
			mid = (left+right)/2;
			int cnt=1;
			int start = (int) line[0];
			
			for(int i=1;i<K;i++) {
				
				d= (int) (line[i]-start);  // 간격(d) 를 기준으로 공유기 설치
				if(mid<=d) {
					cnt++;
					start = (int) line[i];
					
				}
				
				
			}  
			
			
			if(cnt >=N) {
				ans =(int) mid;  // 공유기의 수를 줄이자 => 간격 넓히기
				left = mid +1;
			}
			else
				right = mid-1;  // 공유기가 더 설치되어야한다. => 간격 좁히기
			
			
			
		}
		System.out.println(ans);
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}//문제가 어려워서 검색하여 참고하였다.


}

		

