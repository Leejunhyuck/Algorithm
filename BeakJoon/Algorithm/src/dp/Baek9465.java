package dp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek9465 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		
		long[][] d= new long[2][100001];
		long[][] a= new long[2][100001];
		
		
		for(int i=0;i<num;i++) {
			
			int col = Integer.parseInt(br.readLine());
			
			for(int j=0;j<2;j++) {
				String[] str = br.readLine().split(" ");
				for(int k=1;k<=col;k++) {
					a[j][k]= Long.parseLong(str[k-1]);
					
				}
				
				
			}
			
			d[1][1]=a[1][1];
			d[0][1]=a[0][1];
			d[1][0]=0;
			d[0][0]=0;
			
			for(int k=2;k<=col;k++) {
				
				d[0][k]=Math.max(d[1][k-1],d[1][k-2])+a[0][k];
				d[1][k]=Math.max(d[0][k-1],d[0][k-2])+a[1][k];
			}
			
			
			bw.write(Math.max(d[0][col],d[1][col])+"\n");
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
		
		
			
		}
}
