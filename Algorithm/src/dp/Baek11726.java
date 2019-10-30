package dp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baek11726 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());
		int d[]= new int[1001];//1000으로 하면 오류남
		Arrays.fill(d, -1);
		d[0]=0;
		d[1]=1;
		d[2]=2;
		
		for(int i=3;i<=num;i++) {
			d[i]=d[i-1]+d[i-2];
			d[i] %= 10007;
			
		}
		bw.write(String.valueOf(d[num]));
		
	
		
		
		bw.flush();
		br.close();
		bw.close();
		
		
	}

}
