package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Baek4963 {
	
	static int[] dirx= { 0, 0, 1, -1, 1, -1, 1, -1 };
	static int[] diry= { -1, 1, 0, 0, -1, 1, 1, -1 };
	static int[][] map;
	static boolean[][] visited;
	static int n,m,apart=1;
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		while(true) {
	
			StringTokenizer st = new StringTokenizer(br.readLine());
			n= Integer.parseInt(st.nextToken());
			m= Integer.parseInt(st.nextToken());
			
			if(m==0&&n==0) {
				break;
			}
			
		map = new int[m][n];
		visited = new boolean[m][n];
		
		for(int i=0;i<m;i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				map[i][j]=Integer.parseInt(str.nextToken());
			}
			
		}
		

		for(int i=0;i<m;i++) {
		
			for(int j=0;j<n;j++) {
				if(map[i][j]!=0 && !visited[i][j]) {
					bfs(i,j);
					apart += 1;
				}
			}
			
		}
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
		bw.write(apart-1+"\n");
		apart =1;
		}
//		for (int i : ans) {
//			bw.write(i+"\n");
//		}
		
		
		
	
		
		
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}





public static void bfs(int startRow,int startCol) {
	
	Queue<Node> que = new LinkedList<Node>() ;
	visited[startRow][startCol] =true;
	map[startRow][startCol]=apart;
	que.add(new Node(startRow,startCol));
	
	while(!que.isEmpty()) {
		
		Node node = que.poll();
		int row = node.row;
		int col = node.col;
		
		for(int i=0;i<8;i++) {
			int nr= row+dirx[i];
			int nc= col+diry[i];
			
			
			if(isBoundary(nr, nc) && !visited[nr][nc] && map[nr][nc]!=0) {
				visited[nr][nc]=true;
				map[nr][nc]=apart;
				que.add(new Node(nr,nc));
				
			}
		}	
		
		
	}
	
}
	public static boolean isBoundary (int row, int col) {
		
		return (row>=0 && row<m)&&(col>=0 && col<n);
	}


}

class Node {
	
	int row;
	int col;
	
	Node(int row,int col){
		
		this.row =row;
		this.col = col;
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
		
	



		


	

	

	


