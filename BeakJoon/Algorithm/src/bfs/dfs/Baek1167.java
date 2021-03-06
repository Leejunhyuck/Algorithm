package bfs.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baek1167 {
	static boolean[] check;
	static List<Node100>[] list;
	static int n,m;

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
	
			StringTokenizer st = new StringTokenizer(br.readLine());
			n= Integer.parseInt(st.nextToken());
			
			list = new ArrayList[n+1];
			
			for(int i=0;i<=n;i++)
				list[i]= new ArrayList<Node100>();
			
			
			
		
		check = new boolean[n+1];
		
		for(int i=0;i<n;i++) {
			
			StringTokenizer str = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(str.nextToken());
			while(str.hasMoreTokens()) {
				
			int u = Integer.parseInt(str.nextToken());
			if(u == -1)
				break;
			
			int w=Integer.parseInt(str.nextToken());
			
			
			list[v].add(new Node100(u,w));
			
			}
		}
	
				
		Node100 first =dfs(1,0);
		check = new boolean[n+1];
		Node100 end = dfs(first.value, 0);
		
		System.out.println(end.weight);
			
		
		
		bw.flush();
		br.close();
		bw.close();
	
	
		}


	public static Node100 dfs(int start,int weight) {
		
		
		
		check[start]=true;
		
		Node100 node = new Node100(start,weight);
		
		for (Node100 no : list[start]) {
			
			if(!check[no.value]) {
				Node100 result =dfs(no.value,weight+no.weight);
				if(node.weight < result.weight)
					node=result;
			}
		}
		
				
		return node;
		
		
	}

	


}

class Node100 {
	
	int value;
	int weight;
	
	Node100(int value, int weight){
		this.value = value;
		this.weight =weight;
		
	}
}


		