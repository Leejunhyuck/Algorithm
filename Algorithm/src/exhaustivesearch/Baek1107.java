package exhaustivesearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek1107 {
	static int arr[];	
	
public static void main(String[] args) throws IOException {
		
	
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	int v= Integer.parseInt(br.readLine());
	int n = Integer.parseInt(br.readLine());
	boolean zero = false;
	boolean[] brk = new boolean[10];
	if(n>0) {
	StringTokenizer st  = new StringTokenizer(br.readLine());
	
	
	for(int i=0;i<n;i++) {
		int ck = Integer.parseInt(st.nextToken());
		if(ck==0) zero=true;
		brk[ck]=true;
	}
	}
	int ans = Math.abs(v-100); //abs 절댓값
	
	for(int i=0;i<=1000000;i++) {
		
		int channel =i, temp=i;
		int length=0;
		if(i==0) {
			if(zero) length =0;
			else length =1;
		}
		
		while(temp>0) {
			if(brk[temp%10]) {
				length=0;
				break;
			}
			length++;
			temp = temp/10;
		}
		
		if(length>0) {
			ans = Math.min(ans, length+Math.abs(channel-v));
			
		}
		
		
	}
	bw.write(ans+"\n");
	
	
	
	bw.flush();
	bw.close();
	br.close();
	}
		


}
	
