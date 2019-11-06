package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek2178 {
	static int[] dirx= { 0, 0,  -1, 1};
	static int[] diry= { -1, 1, 0, 0 };
	static int[][] map;
	static boolean[][] visited;
	static int n,m,apart=0;
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		
	
			StringTokenizer st = new StringTokenizer(br.readLine());
			n= Integer.parseInt(st.nextToken());
			m= Integer.parseInt(st.nextToken());
			
			
			
			
			
			
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(str.charAt(j)+"");
			}
			
		}

		

		bfs();
//		int[] ans = new int[apart-1];
//		
//		
//			for(int i=0;i<n;i++) {
//			
//			for(int j=0;j<m;j++) {
//				if(map[i][j]!=0)
//					ans[map[i][j]-1] +=1;
//				}
//			
//			}
//			
			
		
		
		
//		Arrays.sort(ans);
		
		
//		for (int i : ans) {
//			bw.write(i+"\n");
//		}
		
		
		bw.write(apart+"\n");
	
		
		
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}





public static void bfs() {
	
	Queue<Node4> que = new LinkedList<Node4>() ;
	
	
	que.add(new Node4(0,0,1));
	
	
	while(!que.isEmpty()) {
		
		Node4 node = que.poll();
		int row = node.row;
		int col = node.col;
		int cnt = node.cnt;
		
		if(row ==n-1 && col == m-1) {
			apart =cnt;
			return;
		}
		for(int k=0;k<4;k++) {
			int nr= row+dirx[k];
			int nc= col+diry[k];
			
			
		
			
			if(isBoundary(nr, nc)&&map[nr][nc]!=0&&!visited[nr][nc]) {
				visited[nr][nc] =true;
				
				que.add(new Node4(nr,nc,cnt+1));
				
			}
		
		
		
	}
	}
}
	public static boolean isBoundary (int row, int col) {
		
		return (row>=0 && row<n)&&(col>=0 && col<m);
	}


}

class Node4 {
	
	int row;
	int col;
	int cnt;
	Node4(int row,int col,int cnt){
		
		this.row =row;
		this.col = col;
		this.cnt = cnt;
	}
	
}

//	
//	public static void bfs(int start) {
//		
//		Queue<Integer> que = new LinkedList<Integer>();
//		
//		que.add(start);
//		check[start]=true;
//		
//		while(!que.isEmpty()) {
//			int temp =que.poll();
//			
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