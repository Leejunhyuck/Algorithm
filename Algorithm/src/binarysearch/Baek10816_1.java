package binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek10816_1 {
	static long line[];
	
public static void main(String[] args) throws IOException {
	
	// 시간초과 코드
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	int K = Integer.parseInt(br.readLine());
	
	
	line= new long[K];
	
	StringTokenizer st1 = new StringTokenizer(br.readLine());
	
	for(int i=0;i<K;i++) {
		
		line[i]=Long.parseLong(st1.nextToken());
		
	}
	
	
	Arrays.sort(line);
	
	
	

	int N = Integer.parseInt(br.readLine());
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	for(int i=0;i<N;i++) {
		int value = Integer.parseInt(st.nextToken());
		
		int right = line.length-1;
		int left= 0;
		
		
		
		bw.write((binarysearch(left,right,0,value))+" ");
	}
	
	
	
	bw.flush();
	br.close();
	bw.close();


	}


public static int binarysearch(int left, int right, int count, int value) {
	int mid = (left+right)/2;
	int res;
	if(left>right) 
		return count;
	else{
	
	
	
		 if(line[(int) mid] >value) {
			res =binarysearch(left, mid-1, count, value);
		}
		 else if(line[(int) mid] <value){
				res =binarysearch(mid+1, right, count, value);
		 }			
		 else {
		
		res =binarysearch(left, mid-1, count, value);
		res +=binarysearch(mid+1, right, count, value);
		res +=1;
	}
	
	
	
	
		 return res;	
}
	
	
}

}






	









