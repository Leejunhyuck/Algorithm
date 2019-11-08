package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baek11725 {
	
	static int[] dirx= { 0, 0,  -1, 1};
	static int[] diry= { -1, 1, 0, 0 };
	//static int[][] map;
	static boolean[] check;
	static List<Integer>[] list;
	static int temp[];
	static int n,m;

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
	
			StringTokenizer st = new StringTokenizer(br.readLine());
			n= Integer.parseInt(st.nextToken());
			//m= Integer.parseInt(st.nextToken());
			//m=n;
			
			list = new ArrayList[n+1];
			
			for(int i=0;i<=n;i++)
				list[i]= new ArrayList<Integer>();
			
			
			
		//map = new int[n][m];
		check = new boolean[n+1];
		
		for(int i=0;i<n-1;i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int v= Integer.parseInt(str.nextToken());
			int w = Integer.parseInt(str.nextToken());
			
			//map[v][w]=1;
		//map[w][v]=1;
			list[v].add(w);
			list[w].add(v);
		}
	
		temp = new int[n+1];
		
		dfs(1);
	
		
		for(int i=2;i<temp.length;i++)
			bw.write(temp[i]+"\n");
	
		
		
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}


	public static void dfs(int start) {
		
		if(check[start]) return;
		
		check[start]=true;
		
		for (int y : list[start]) {
			
			if(!check[y]) {
				temp[y]=start;
				dfs(y);
			}
		}
				
		
		
		
	}



}


		

