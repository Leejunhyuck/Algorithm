package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baek1967 {
	static boolean[] check;
	static List<Node101>[] list;
	static int n,m;

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
	
			StringTokenizer st = new StringTokenizer(br.readLine());
			n= Integer.parseInt(st.nextToken());
			
			list = new ArrayList[n+1];
			
			for(int i=0;i<=n;i++)
				list[i]= new ArrayList<Node101>();
			
			
			
		
		check = new boolean[n+1];
		
		for(int i=0;i<n-1;i++) {
			
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int v = Integer.parseInt(str.nextToken());
			int u = Integer.parseInt(str.nextToken());
			int w=Integer.parseInt(str.nextToken());
			
			
			list[v].add(new Node101(u,w));
			list[u].add(new Node101(v,w));
			
		}
	
				
		Node101 first =dfs(1,0);
		check = new boolean[n+1];
		
		Node101 end = dfs(first.value, 0);
		
		//System.out.println(first.value);
		System.out.println(end.weight);
			
		
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}


	public static Node101 dfs(int start,int weight) {
		
		
		
		check[start]=true;
		
		Node101 node = new Node101(start,weight);
		
		for (Node101 no : list[start]) {
			
			if(!check[no.value]) {
				Node101 result =dfs(no.value,weight+no.weight);
				if(node.weight < result.weight)
					node=result;
			}
		}
		
				
		return node;
		
		
	}

	


}

class Node101 {
	
	int value;
	int weight;
	
	Node101(int value, int weight){
		this.value = value;
		this.weight =weight;
		
	}
}