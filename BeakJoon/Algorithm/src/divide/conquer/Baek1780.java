package divide.conquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek1780 {
	static int arr[][];	
	static int count[];
public static void main(String[] args) throws IOException {
		

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	
	int n = Integer.parseInt(br.readLine());
	arr = new int[n][n];
	
	for(int i=0;i<n;i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int j=0;j<n;j++) {
			
			arr[i][j]=Integer.parseInt(st.nextToken());
		}
		
	}
	
	count = new int[3];
	
	divide(0,0,n);
	
	for(int i=0;i<3;i++)
		System.out.println(count[i]);	
	
	
	
	
	
	
	bw.flush();
	bw.close();
	br.close();
	
	
	
	}


public static void divide(int x,int y, int n) {
	
	if(check(x,y,n)) {count[arr[x][y]+1]++; return;}
	
	int m =n/3;
	
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<3;j++) {
			
			divide(x+i*m, y+j*m, m); //이것도 놀랍다
		}
	}
	
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

	    return true;
	
	
	
	
}


}

