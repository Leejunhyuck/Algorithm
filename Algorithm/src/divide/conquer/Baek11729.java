package divide.conquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek11729 {
	static int cnt=0;
	static StringBuilder sb = new StringBuilder();
public static void main(String[] args) throws IOException {
		

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int n = Integer.parseInt(br.readLine());
	
	
	hanoi(n, 1, 3);
	System.out.println(cnt);
	System.out.println(sb);
	
	
	
	bw.close();
	br.close();
	
	
	
	}

	public static void  hanoi(int n, int start , int end ) {
		
		if(n==0)  return;
		
		else {
			cnt++;
			hanoi(n-1,start,6-start-end);
			sb.append(start+" "+end+"\n");
			hanoi(n-1,6-start-end,end);
			
			
			
		}
		
		
		
	}


}