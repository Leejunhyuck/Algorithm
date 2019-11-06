package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Baek2667 {

	
	static int[] dirx= {0,0,-1,1};
	static int[] diry= {-1,1,0,0};
	static int[][] map;
	static boolean[][] visited;
	static int n,apart=1;
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		n= Integer.parseInt(br.readLine());
		map = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			for(int j=0;j<n;j++) {
				map[i][j]=Integer.parseInt(str.charAt(j)+"");
			}
			
		}
		

		for(int i=0;i<n;i++) {
		
			for(int j=0;j<n;j++) {
				if(map[i][j]!=0 && !visited[i][j]) {
					bfs(i,j);
					apart += 1;
				}
			}
			
		}
		int[] ans = new int[apart-1];
		
		
			for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(map[i][j]!=0)
					ans[map[i][j]-1] +=1;
				}
			
			}
			
			
		
	
		
		Arrays.sort(ans);
		bw.write(apart-1+"\n");
		
		for (int i : ans) {
			bw.write(i+"\n");
		}
		
		
		
	
		
		
		
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
		
		for(int i=0;i<4;i++) {
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
		
		return (row>=0 && row<n)&&(col>=0 && col<n);
	}


}

class Node1 {
	
	int row;
	int col;
	
	Node1(int row,int col){
		
		this.row =row;
		this.col = col;
	}
	
}
	

