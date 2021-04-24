package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baeck9461 {

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n =Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<n;i++) {
			int m =Integer.parseInt(br.readLine());
			long[] d = new long[101];
		
		d[1]=1;
		d[2]=1;
		d[3]=1;
		d[4]=2;
		d[5]=2;
		for(int j=6;j<=m;j++) {
			d[j]= d[j-1]+d[j-5];
			
		}
		
			
		
		
		bw.write(d[m]+"\n");
		
		}
		
		
		
		
			
			
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
			
		}

	
}
