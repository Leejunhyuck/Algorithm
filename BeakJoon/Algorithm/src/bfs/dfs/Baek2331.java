package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek2331 {
	
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(str.nextToken());
		int p = Integer.parseInt(str.nextToken());
		
		boolean visit[]=new boolean[295246];
		int check[] = new int[295246];
		int cnt =0;
		
		while(true) {
			if(visit[num]) break;
			check[cnt]=num;
			cnt++;
			visit[num]=true;
			int sum =0;
			for (int i=num; i>0; i/=10) {
	            sum += Math.pow(i % 10, p);
	        }

			num=sum;
			//System.out.println(num);

		}
		
		for (int i = 0; i < 295246; i++) {
			if (check[i] == num) bw.write(i+"\n");; 
			
			 }

		
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}

}

