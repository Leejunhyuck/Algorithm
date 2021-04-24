package exhaustivesearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek1697 {
	static boolean check[];
	static int[] dist;
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken());
		int k =Integer.parseInt(st.nextToken());
		
		
		check=new boolean[100001];
		dist = new int[100001];
		bfs(n,k);
		
		
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	
	public static void bfs(int v, int k) {
		
		Queue<Integer> q =new LinkedList<Integer>();
		q.add(v);
		
		while(!q.isEmpty()) {
			
			
			
			int v1 = q.poll();
			
			if(v1 ==k ) {
				System.out.println(dist[v1]);
				break;
				
				
			}
		
				
			else {
			if(v1-1>=0&&!check[v1-1]) {
				q.add(v1-1);
				check[v1-1]=true;
				dist[v1-1]=dist[v1]+1;
			}
				
			if(v1+1<=100000&&!check[v1+1]){
				q.add(v1+1);
				check[v1+1]=true;
				dist[v1+1]=dist[v1]+1;
			}

			if(2*v1<=100000&&!check[2*v1]) {
				q.add(2*v1);
				check[2*v1]=true;
				dist[v1*2]=dist[v1]+1;
			}
			
		}}
		
		
	}

}


	
