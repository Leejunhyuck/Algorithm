package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek7576 {
	static int[] dirx= { 0, 0,  -1, 1};
	static int[] diry= { -1, 1, 0, 0 };
	static int[][] map;
	//static boolean[][] visited;
	static int n,m,apart=1;
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		
	
			StringTokenizer st = new StringTokenizer(br.readLine());
			m= Integer.parseInt(st.nextToken());
			n= Integer.parseInt(st.nextToken());
			
			
			
			
			
			
		map = new int[n][m];
		//visited = new boolean[m][n];
		
		for(int i=0;i<n;i++) {
			String str[] = br.readLine().split(" ");
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(str[j]);
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
		
		
		
	
		
		
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}





public static void bfs() {
	
	Queue<Node3> que = new LinkedList<Node3>() ;
	
	
	for(int i=0;i<n;i++) {
		
		for(int j=0;j<m;j++) {
			if(map[i][j]==1)
				que.add(new Node3(i,j));
			}
		
		}
	
	
	while(!que.isEmpty()) {
		
		Node3 node = que.poll();
		int row = node.row;
		int col = node.col;
		
		for(int i=0;i<4;i++) {
			int nr= row+dirx[i];
			int nc= col+diry[i];
			
			if(map[nr][nc]!=0) continue;
			
			if(isBoundary(nr, nc)) {
				
				map[nr][nc]=map[row][col]+1;
				que.add(new Node3(nr,nc));
				
			
				
				map[nr][nc]=map[row][col]+1;
				que.add(new Node3(nr,nc));
				
			
		}	
		
		}
	}
	int max = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (map[i][j] == 0) {
               
                System.out.println(-1);
                return;
            }
            max = Math.max(max, map[i][j]);
        }
    }
   
    System.out.println(max - 1);
	
}
	public static boolean isBoundary (int row, int col) {
		
		return (row>=0 && row<n)&&(col>=0 && col<m);
	}


}

class Node3 {
	
	int row;
	int col;
	
	Node3(int row,int col){
		
		this.row =row;
		this.col = col;
	}
	
}