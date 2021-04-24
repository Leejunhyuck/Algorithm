package binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek1992 {


	
		static int arr[][];
		static int count;
	public static void main(String[] args) throws IOException {
			

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			String str = new String(br.readLine());
			for(int j=0;j<n;j++) {
				
				arr[i][j]=Integer.parseInt(str.charAt(j)+"");
			}
			
		}
		
		
		
		divide(0,0,n);
		
		
		
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
		
		
		
		}


	public static void divide(int x,int y, int n) {
		
		if(check(x,y,n)) {System.out.print(count); return;}
		
		System.out.print("(");
		int m =n/2;
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				
				divide(x+i*m, y+j*m, m); //이것도 놀랍다
			}
		}
		System.out.print(")");
		
	}

	public static boolean check(int x, int y, int n) {
		
		 for (int i = x; i < x + n; i++)
		    {
		        for (int j = y; j < y + n; j++) //코드가 놀랍다 
		        {
		            if (arr[x][y] != arr[i][j])
		                return false;
		        }
		    }
		 	count=arr[x][y];
		    return true;
		
		
		
		
	}


	}

