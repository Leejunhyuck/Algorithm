package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek1260_2 {
	
	static  List<Integer>[] list;
	static boolean[] check;
	static int n;
	
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		n= Integer.parseInt(str.nextToken());
		int m=Integer.parseInt(str.nextToken());
		
		list = new ArrayList[n+1];
		check = new boolean[n+1];
		
		int cnt=0;
		
		for(int i=0;i<=n;i++)
			list[i]= new ArrayList<Integer>();
		
		for(int i=0;i<m;i++) {
			StringTokenizer str1 = new StringTokenizer(br.readLine());
			int u=Integer.parseInt(str.nextToken());
			int v=Integer.parseInt(str.nextToken());
			
			list[u].add(v);
			list[v].add(u);
			
		}
	
	
		for(int i=0;i<=n;i++) {
			
			if(!check[i]) {
				cnt++;
				dfs(i);
		}}
		
		bw.write(cnt+"\n");
	
		bw.flush();
		br.close();
		bw.close();
	
		}

	public static void dfs(int start) {
		if(check[start]) return;
		
		check[start]=true;
		System.out.print(start+" ");
		for (int y : list[start]) {
			if(!check[y])
				dfs(y);
		}
		
	}
}
//	}// 인접리스트 dfs
//	public static void bfs(int start) {
//		
//		Queue<Integer> que = new LinkedList<Integer>();
//		
//		que.add(start);
//		check[start]=true;
//		
//		while(!que.isEmpty()) {
//			int temp =que.poll();
//			System.out.print(temp+" ");
//			for (int y : map[temp]) {
//				if(!check[y]) {
//					check[y]=true;
//					que.add(y);
//				}
//			}
//		}
//		
//		
//	}	
//		
//		
//	}//인접리스트 bfs
