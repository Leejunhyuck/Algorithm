package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baek10451 {
	static  List<Integer>[] list;
	static boolean[] color;
	static int n;
	static int cnt=0;
	
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num=Integer.parseInt(br.readLine());
		while( num--> 0 ) {
		
		
		n= Integer.parseInt(br.readLine());
		
		
		list = new ArrayList[n+2];
		cnt =0;
		color = new boolean[n+2];
		
		
		for(int i=0;i<=n;i++) {
			list[i]= new ArrayList<Integer>();
			
		}
		StringTokenizer str1 = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			
			
			int v=Integer.parseInt(str1.nextToken());
			
			list[i].add(v);
			
			
			
		}
	
	
		for(int i=1;i<=n;i++) {
			
			
			if(!color[i]) {
				
				cnt++;
				dfs(i);
				}
			
		}
		
		bw.write(cnt+"\n");
		
		}
		bw.flush();
		br.close();
		bw.close();
	
	
		}

	public static void dfs(int start) {
		
		if(color[start]) {
			
			return; 
		}
		color[start]=true;
		
		//System.out.print(start+" ");
		for (int y : list[start]) {
			
			if(!color[y])
				dfs(y);
		}
	}

}		
//	// 인접리스트 dfs
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
//			for (int y : list[temp]) {
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
//



