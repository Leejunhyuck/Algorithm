package com.miridih.exam;

import java.util.*;
import java.io.*;

public class Stock implements Solver {

	public static void main(String[] args) {
		new Stock().solve(System.in, System.out);
	}

	/**
	 * 문제 풀이 메인 메소드
	 * 
	 * @param in  테스트 케이스 입력을 받이들이는 InputStream
	 * @param out 결과값을 출력할 PrintStream
	 */
	public void solve(InputStream in, PrintStream out) {
		Scanner sc = new Scanner(in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int[] stock = new int[N + 1];
			long totalMoney = 0;
			int max = Integer.MIN_VALUE;

			for (int j = 0; j < N; j++) {
				stock[i] = sc.nextInt();
			}
			for (int j = N - 1; j >= 0; j--) {
				if (stock[i] > max)
					max = stock[i];
				else
					totalMoney += (max - stock[i]);
			}
			out.println(totalMoney);
		}
	}
}
