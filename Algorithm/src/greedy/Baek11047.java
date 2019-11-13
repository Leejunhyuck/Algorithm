package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek11047 {
	static int arr[];	
	
public static void main(String[] args) throws IOException {
		

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	int n= Integer.parseInt(st.nextToken());
	int v = Integer.parseInt(st.nextToken());
	arr = new int[n];
	
	for(int i=0;i<n;i++)
		arr[i]=Integer.parseInt(br.readLine());
	int temp=0;
	int ans=0;
	for(int i=n-1;i>=0;i--) {
		
		if(arr[i]<=v) {
			temp = v/arr[i];
			ans+=temp;
			v = v%arr[i];
			
			
			}
	}
		
		
	
	
	System.out.println(ans);
	
	
	
	
	bw.flush();
	bw.close();
	br.close();
	
	
	
	}


}