package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek1931 {
	
public static void main(String[] args) throws IOException {
		
	
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
	int n = Integer.parseInt(br.readLine());
	Queue<Time> q = new PriorityQueue<Time>();
	
	for(int i=0;i<n;i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x =Integer.parseInt(st.nextToken());
		int y =Integer.parseInt(st.nextToken());
		q.add(new Time(x,y));
		
		
	}
	int end=-1;
	int cnt=1;
	
	
	end = q.poll().y;
	
	while(!q.isEmpty()) {
		
		Time time = q.poll();
		
		
		
		if(end<=time.x)
		{
			end = time.y;
			cnt++;
			
		}
		
	}
	
	bw.write(cnt+"\n");
	
	
	bw.flush();
	bw.close();
	br.close();
	}
		



 
}
class Time implements Comparable<Time>{
	int x;
	int y;
	
	Time(int x,int y){
		this.x=x;
		this.y =y;
		
	}

	@Override
	public int compareTo(Time o) {
		
		if(this.y != o.y)
			return this.y-o.y;
		else
			return this.x-o.x;
		
	
	}
	
}


	
