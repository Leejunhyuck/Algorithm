package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek11651 {

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Point2 a[] = new Point2[n];
		
		for(int i=0;i<n;i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			a[i]=new Point2(Integer.parseInt(str.nextToken()),Integer.parseInt(str.nextToken()));
			
			
			
		}
		
		Arrays.sort(a);
		
		
		
		for(int i=0;i<n;i++) {
			
			bw.write(a[i].x + " " + a[i].y+"\n");
				
			}
			
			
		
		bw.flush();
		bw.close();
		br.close();
		}
			


}
		
		
class Point2 implements Comparable<Point2> {
	
	int x;
	int y;
	Point2(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	
	
	@Override
	public int compareTo(Point2 o) {
		
		if(this.x==o.x)
			return this.y- o.y;
		else
			return this.x-o.x;
		
		
		
	}
}
