package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek1783 {
	
public static void main(String[] args) throws IOException {
		
	
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	StringTokenizer st = new StringTokenizer(br.readLine());
	int n = Integer.parseInt(st.nextToken());
	int m = Integer.parseInt(st.nextToken());
	
	
	if(n==1) {System.out.println(1); }
	else if(n==2) {
		int v = Math.min(4, (m+1)/2);   // 난 저렇게 코드 못짤듯... 대단하다 홀수 짝수를 m+1 해서 2를 나눠준거
		System.out.println(v); 
		}
	else {
		if(m>=7) {
			System.out.println(m-2);
			
		}
		else
			System.out.println(Math.min(4, m));
	}
	
	bw.flush();
	bw.close();
	br.close();
	}
		


}
	
