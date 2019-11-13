package divide.conquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek11728 {	
	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int alength = Integer.parseInt(st.nextToken());
		int blength = Integer.parseInt(st.nextToken());
		int arr[] = new int[alength+blength];
		
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		StringTokenizer str1 = new StringTokenizer(br.readLine());
		
		int i=0;
		for(i=0;i<alength;i++) {
			
			arr[i]=Integer.parseInt(str.nextToken());
		}
		
		for(int j=i;j<arr.length;j++) {
			
			arr[j]=Integer.parseInt(str1.nextToken());
		}
		Arrays.sort(arr);
		for(int k=0;k<arr.length;k++)
			bw.write(arr[k]+" ");
		bw.flush();
		bw.close();
		br.close();
		
		
		
		}
	}






			


		

		

		



		

		

		


