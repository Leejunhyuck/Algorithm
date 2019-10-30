package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek11053 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num =Integer.parseInt(br.readLine());
		
		int a[] = new int[num];
		int d[] = new int[num];
		
		String str[] =br.readLine().split(" ");
		for(int i=0;i<num;i++)
		{
			a[i]=Integer.parseInt(str[i]);
			d[i]=1;
			for(int j=0;j<i;j++) {
				if(a[j]<a[i]&& d[i]<d[j]+1) {
					d[i]=d[j]+1;
				}
				
				
			}
			
			
		}
		int max=0;
		for(int j=0;j<num;j++) {
			max=Math.max(max, d[j]);
			
		}
		
		bw.write(max+"\n");
		
		bw.flush();
		bw.close();
		br.close();
			
		}
	
}
