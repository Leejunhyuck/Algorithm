package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baeck2133 {
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n =Integer.parseInt(br.readLine());
		int d[] = new int[n+1];
		d[0]=1;
	
		for(int i=2;i<=n;i+=2) {
			d[i]= d[i-2]*3;
			for(int j=4;i>=j;j+=2) {
				d[i]+=d[i-j]*2;
				
			}
			
		}
	
	
		
		
			
			
		
		
		bw.write(d[n]+"\n");
		
		bw.flush();
		bw.close();
		br.close();
			
		}
}
