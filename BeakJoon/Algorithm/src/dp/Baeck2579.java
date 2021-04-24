package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baeck2579 {

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num =Integer.parseInt(br.readLine());
		
		int a[] = new int[301];
		int d[] = new int[301];
		
		
		
		for(int i=0;i<num;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
			d[0]=a[0];
			d[1]=a[1]+d[0];
			d[2]=Math.max(a[2]+a[0], a[1]+a[2]);
			for(int i=3;i<=num;i++) {
				d[i]=Math.max(d[i-2]+a[i],d[i-3]+a[i-1]+a[i]);
				
				
			}
			
			
			
			
		
		
		bw.write(d[num-1]+"\n");
		
		bw.flush();
		bw.close();
		br.close();
			
		}
	
}
