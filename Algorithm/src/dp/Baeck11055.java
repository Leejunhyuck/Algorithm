package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baeck11055 {
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num =Integer.parseInt(br.readLine());
		
		int a[] = new int[num];
		int d[] = new int[num];
		int maxdp=0;
		
		String str[] =br.readLine().split(" ");
		for(int i=0;i<num;i++)
		{
			a[i]=Integer.parseInt(str[i]);
			d[0]=a[0];
			int max=0;
			for(int j=0;j<i;j++) {
				if(a[j]<a[i]) {
					if(max<d[j])
						max=d[j];
				}
				
				
			}
			d[i]=max+a[i];
			
			if(maxdp<d[i])
				maxdp=d[i];
			
		}
		
		bw.write(maxdp+"\n");
		
		bw.flush();
		bw.close();
		br.close();
			
		}
}
