package dp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek11057 {

	
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n+1][10];
		
		for(int i=0;i<10;i++) {
			
			arr[1][i]=1;
		}
		int mod = 10007;
		for(int i=2;i<=n;i++) {
			
			
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=j;k++) {
					arr[i][j]+=arr[i-1][k];
					arr[i][j] %=mod;
					
				}
				
			}
		}
		int sum=0;
		for(int i=0;i<=9;i++) {
			sum =(sum+arr[n][i])%mod;
			
		}
		
		
		bw.write(sum+"\n");
		
		bw.flush();
		br.close();
		bw.close();
		
		
	}
	
}
