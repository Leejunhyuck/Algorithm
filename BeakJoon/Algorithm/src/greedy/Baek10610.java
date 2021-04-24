package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek10610 {
	static int arr[];	
	
public static void main(String[] args) throws IOException {
		
	
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	arr = new int[10];
	
	String str = br.readLine();
	int total=0;
	
	for(int i=0;i<str.length();i++)
	{int num = Integer.parseInt(str.substring(i,i+1));
	arr[num] += 1;
	total += num;}
	
	
	
	
	
	if(!str.contains("0") || total%3!=0) {
		System.out.println(-1);
		return;
	}
	
	
	StringBuilder sb = new StringBuilder();
	for(int i=9;i>=0;i--) {
		while(arr[i]>0) {
			bw.write(i+"");
			arr[i] -= 1;
		}
	}
	
	
    //System.out.println(sb.toString());
	
	
	
	bw.flush();
	bw.close();
	br.close();
	}
		


}
	
