package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek1260_1 {
	static int map[][];
	static boolean[] check;
	static int m,n;
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(str.nextToken());
		m = Integer.parseInt(str.nextToken());
		int  v= Integer.parseInt(str.nextToken());
		
		map = new int[n+1][n+1];
		check = new boolean[n+1];
		
		for(int i=0;i<m;i++) {
			String arr[] = br.readLine().split(" ");
			int v1=Integer.parseInt(arr[0]);
			int v2=Integer.parseInt(arr[1]);
			
			map[v1][v2]=1;
			map[v2][v1]=1;
		}
		
		dfs(v);
		
		check = new boolean[n+1];
		System.out.println();
		bfs(v);	
		
		
		br.close();
		}
		
	public static void dfs(int start) {
		
		if(check[start]) {
			return;
		}
		check[start]=true;
		System.out.print(start+" ");
		for(int i=1;i<=n;i++) {
			if(map[start][i]==1 && !check[i])
				dfs(i);
			
			
		}
		
		
		
	}// 인접행렬 dfs
	public static void bfs(int start) {
		
		Queue<Integer> que = new LinkedList<>();
		que.add(start);
		check[start] = true;
		
	while (!que.isEmpty()) {
	
		int temp=que.poll();
		
		
		System.out.print(temp+" ");
		for(int i=1;i<=n;i++) {
			if(map[temp][i]==1 && !check[i]) {
				check[i] = true;
				que.add(i);
			
			}
		}
		
	}	
		
		
	}//인접행렬 bfs

}

		


	

	