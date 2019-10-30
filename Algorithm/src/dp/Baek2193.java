package dp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek2193 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		long dp[][]=new long[num+1][2];
		
		dp[1][0]=0;
		dp[1][1]=1;
		
		for(int i=2;i<=num;i++) {
			
			dp[i][0]=dp[i-1][0]+dp[i-1][1];
			dp[i][1]=dp[i-1][0];
			
		}
		
		bw.write(dp[num][0]+dp[num][1]+"\n");
		
		
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
		
		
			
		}
	
}
