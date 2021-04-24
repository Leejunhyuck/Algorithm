package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek2011 {
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n= br.readLine();
		
		int d[] = new int[n.length()+1];
		
		d[0]=1;
		
		
		
		
		if(n.equals("0")) {
			
			bw.write("0");
			bw.flush();
			return;
		}
		
		
		for(int i=1;i<n.length()+1;i++) {
			int now =i-1;
			
			if(n.charAt(now)-'0' !=0) {
				d[i]=d[i-1]% 1000000;
			}
			
			if(i==1)continue;

			
			
			int sum=(n.charAt(now-1)-'0')*10+(n.charAt(now)-'0');
			
			if(sum >=10 && sum <=26) {
				
				d[i] = (d[i] + d[i-2])% 1000000 ;
			}
			
			
		}
		
		
		
		
		
		
		bw.write(d[n.length()]+"\n");
		
		
		
		
			
			
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
			
		}

}
