package bfs.dfs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Baek9466 {

		//static List<Integer>[] list;
		static int list[];
		static boolean check[];
		static int cnt;
		static boolean done[];
		
	public static void main(String[] args) throws IOException {
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			
			int n= Integer.parseInt(br.readLine());
			
			while(n-- >0) {
				cnt=0;
				int m = Integer.parseInt(br.readLine());
				
				//list = new ArrayList[m+1];
				list= new int[m+1];
				check = new boolean[m+1];
				done = new boolean[m+1];
				
//				
//				for(int i=0;i<=m;i++) {
//					
//					list[i] = new ArrayList<Integer>(); 
//				}
				
				
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int i=1;i<=m;i++) {
					
					//list[i].add(Integer.parseInt(st.nextToken())); 
					list[i]=(Integer.parseInt(st.nextToken()));
				}
				
					for(int i=1;i<=m;i++) {
					
					if(!check[i]) {dfs(i);}
				}
				
					bw.write(m-cnt+"\n");
			}
			
		
			
			
			
			bw.flush();
			br.close();
			bw.close();
		
		
			}




	public static void dfs(int start) {
		
		if(check[start]) return;
		
		check[start] =true;
		
		int next = list[start];
		
		if(!check[next]) dfs(next);
		
		else {
			if(!done[next]) {
				
				 // 노드가 끝나려면 싸이클을 무조건 거쳐야한다.
	            // 따라서 현재 노드가 아닌 다음 노드 기준으로 하면 싸이클이 무조건 존재
				  cnt++;
	              for(int i=next; i != start; i = list[i])
	                  cnt++;
			}
			
			
		}
		
		done[start] =true;
		}
	}
		


	//	
//		public static void bfs(int start) {
//			
//			Queue<Integer> que = new LinkedList<Integer>();
//			
//			que.add(start);
//			check[start]=true;
//			
//			while(!que.isEmpty()) {
//				int temp =que.poll();
//				
//				for (int y : list[temp]) {
//					if(!check[y]) {
//						check[y]=true;
//						que.add(y);
//					}
//				}
//			}
//			
//			
//		}	
//			
			
		


