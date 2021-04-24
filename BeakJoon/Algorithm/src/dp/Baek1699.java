package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek1699 {
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num =Integer.parseInt(br.readLine());
		int d[] = new int[num+1];
		
		for(int i=1;i<=num;i++) {
			
			d[i]=i;
		
		
		
	
			
			for(int j=2;j*j<=i;j++) {
				
				d[i]=Math.min(d[i], d[i-j*j]+1);
				
			
			}
			
			
		}
		
		
			
			
		
		
		bw.write(d[0]+"\n");
		
		bw.flush();
		bw.close();
		br.close();
			
		}
}
