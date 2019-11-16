package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek11399 {

	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n =Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int time[] = new int[n];
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			
			
		}
		Arrays.sort(arr);
		int sum=0;
		
		for(int i=1;i<n;i++) {
			
			arr[i]=arr[i-1]+arr[i];
			sum += arr[i];
		}
		
		
		
		
		
		
		System.out.println(sum+arr[0]);
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	

}


	
