package dp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baek1463 {
public static int memo[];
	
	public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			
			
			int num = Integer.parseInt(br.readLine());
			memo = new int[num+1];
			
		
			Arrays.fill(memo, -1);
			bw.write(dp(num)+"\n");
			
			
			
			bw.flush();
			br.close();
			bw.close();
			
			
		}
		
		public static int dp(int n) {
			
			
			if(n==1) return 0;
			if(memo[n]!=-1) return memo[n];
			memo[n]=Integer.MAX_VALUE;
			if(n%3==0) memo[n]=Math.min(memo[n],dp(n/3)+1);
			if(n%2==0) memo[n]=Math.min(memo[n], dp(n/2)+1);
			memo[n]=Math.min(memo[n],dp(n-1)+1);
			
			return memo[n];
			
			
		}
}
