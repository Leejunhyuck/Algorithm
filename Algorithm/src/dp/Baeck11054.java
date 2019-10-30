package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baeck11054 {

	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num =Integer.parseInt(br.readLine());
		
		int a[] = new int[num];
		int d[] = new int[num];
		int p[] = new int[num];
		int maxdp=0;
		
		String str[] =br.readLine().split(" ");
		for(int i=0;i<num;i++)
		{
			a[i]=Integer.parseInt(str[i]);
			d[i]=1;
			
			for(int j=0;j<i;j++) {
				if(a[j]<a[i]) {
					if(d[i]<d[j]+1)
						d[i]=d[j]+1;
				}
				
				
			}}
		for(int i=num-1;i>=0;i--) {
			p[i]=1;
			for (int j= num-1;i<=j;j--){
				if(a[j]<a[i]) {
					if(p[i]<p[j]+1)
						p[i]=p[j]+1;
				}
				
				
			}}

			for(int k=0;k<num;k++) {
				
				maxdp=Math.max(p[k]+d[k],maxdp);
			}
			
			
			
			
		
		
		bw.write(maxdp-1+"\n");
		
		bw.flush();
		bw.close();
		br.close();
			
		}
	
}
