package com.miridih.exam;

import java.util.*;
import java.io.*;

public class Stock implements Solver {

	public static void main(String[] args) {
		new Stock().solve(System.in, System.out);
	}

	/**
	 * ���� Ǯ�� ���� �޼ҵ�
	 * 
	 * @param in  �׽�Ʈ ���̽� �Է��� ���̵��̴� InputStream
	 * @param out ������� ����� PrintStream
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
