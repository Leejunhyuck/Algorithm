package dp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek9095 {
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[101][101];
		
		for(int i=1;i<10;i++) {
			
			arr[1][i]=1;
		}
		int mod = 1000000000;
		for(int i=2;i<=n;i++) {
			
			
			for(int j=0;j<=9;j++) {
				if(j==0) arr[i][j] = arr[i-1][j+1]%mod; //각각 해서 숫자를 줄여줘야 범위를 안 벋어난다.
				else if(j+1==10) arr[i][j] = arr[i-1][j-1]%mod;
				else arr[i][j]=(arr[i-1][j-1]+arr[i-1][j+1])%mod;
				
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
