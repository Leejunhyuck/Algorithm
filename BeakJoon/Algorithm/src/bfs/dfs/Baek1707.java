package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baek1707 {
	static  List<Integer>[] list;
	static boolean check;
	static int[] color;
	static int n;
	static final int red =1;
	static final int blue =-1;
	
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num=Integer.parseInt(br.readLine());
		while( num--> 0 ) {
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		n= Integer.parseInt(str.nextToken());
		int m=Integer.parseInt(str.nextToken());
		
		list = new ArrayList[n+1];
		check = true;
		color = new int[n+1];
		
		
		for(int i=0;i<=n;i++) {
			list[i]= new ArrayList<Integer>();
			color[i]=0;
		}
		for(int i=0;i<m;i++) {
			StringTokenizer str1 = new StringTokenizer(br.readLine());
			int u=Integer.parseInt(str1.nextToken());
			int v=Integer.parseInt(str1.nextToken());
			
			list[u].add(v);
			list[v].add(u);
			
			
		}
	
	
		for(int i=1;i<=n;i++) {
			
			if(!check )
				break;
			
			if(color[i]==0) {
				
				
				dfs(i,red);
		}}
		
		bw.write(check ? "YES":"NO");
		bw.write("\n");
		}
		bw.flush();
		br.close();
		bw.close();
	
	
		}

	public static void dfs(int start,int f) {
		color[start]=f;
		
		
		
		//System.out.print(start+" ");
		for (int y : list[start]) {
			
			if(color[y]==f) {
				check=false;
				return;
			}
			if(color[y]==0)
				dfs(y,-f);
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

