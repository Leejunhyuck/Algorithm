package exhaustivesearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek1476 {
	static int arr[];	
	
	public static void main(String[] args) throws IOException {
			
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int e =Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		
		int cnt=0;
		int e1=0,s1=0,m1=0;
		int n=20;
		while(true) {
			
			e1++; s1++; m1++;
			cnt++;
			
			if(15<e1)
				e1= e1-15;
			if(28<s1)
				s1=s1-28;
			if(19<m1)
				m1=m1-19;
			
			
			if(e1==e && s1==s && m1==m)
				break;
			
			
			
			
			
		}
		
		
		bw.write(cnt+"\n");
		
		
		bw.flush();
		bw.close();
		br.close();
		}
			


	}
		
