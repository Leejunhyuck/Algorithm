package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek2875 {
	static int arr[];	
	
	public static void main(String[] args) throws IOException {
			

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int max = n/2 <m ? n/2:m;
		v -= m+n -3*max;
		
		while(v>0) {
			
			v -= 3; max--;
		}
			
		
		
		System.out.println(max);
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
		
		
		
		}


	}