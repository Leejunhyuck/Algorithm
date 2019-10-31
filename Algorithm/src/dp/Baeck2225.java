package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baeck2225 {

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m=Integer.parseInt(str[1]);
		long d[][] = new long[m+1][n+1];
		
		
		
		
		for(int i=0;i<=n;i++) {
			
			d[1][i]=1;
		}
		
		for(int i=2;i<m+1;i++) {
			d[i][0]=1;
			
			for(int j=1;j<n+1;j++) {
				d[i][j]=(d[i-1][j]+d[i][j-1])%	1000000000;
					
			}
			
			
		}
		
		
		bw.write(d[m][n]+"\n");
		
		
		
		
			
			
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
			
		}
	
}
