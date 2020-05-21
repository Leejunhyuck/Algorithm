package com.miridih.exam;

import java.util.*;
import java.io.*;

public class RotatedRect implements Solver {

	public static void main(String[] args) {
		new RotatedRect().solve(System.in, System.out);
	}

	public void solve(InputStream in, PrintStream out) {
		Scanner sc = new Scanner(in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int weight = sc.nextInt();
			int height = sc.nextInt();
			int angle = sc.nextInt();

			Point point = new Point(x1, y1, weight, height, angle);

			point.rotateLtRect();
			point.rotateCRect();

			out.println(point.getX1() + " " + point.getY1());

		}
	}

	public class Point {
		private int x1, y1;
		private int x2, y2;
		private int x3, y3;
		private int x4, y4;
		private int weight, heigh;
		private int angle;

		Point(int x, int y, int weight, int heigh, int angle) {
			this.x1 = x;
			this.y1 = y;
			this.x2 = x + weight;
			this.y2 = y;
			this.x3 = x;
			this.y3 = y + heigh;
			this.x4 = x + weight;
			this.y4 = y + heigh;
			this.angle = angle;

		}

		private void rotateLtRect() {
			int mx = (this.x1);
			int my = (this.y1);
			int temp;

			temp = moveXPoint(this.x2, this.y2, mx, my);
			this.y2 = moveYPoint(this.x2, this.y2, mx, my);
			this.x2 = temp;

			temp = moveXPoint(this.x3, this.y3, mx, my);
			this.y3 = moveYPoint(this.x3, this.y3, mx, my);
			this.x3 = temp;

			temp = moveXPoint(this.x4, this.y4, mx, my);
			this.y4 = moveYPoint(this.x4, this.y4, mx, my);
			this.x4 = temp;
		}

		private void rotateCRect() {
			double mx = (this.x1 + this.x4) / 2;
			double my = (this.y1 + this.y4) / 2;
			this.angle = this.angle * -1;

			int temp;

			temp = moveXPoint(this.x1, this.y1, mx, my);
			this.y1 = moveYPoint(this.x1, this.y1, mx, my);
			this.x1 = temp;

			temp = moveXPoint(this.x2, this.y2, mx, my);
			this.y2 = moveYPoint(this.x2, this.y2, mx, my);
			this.x2 = temp;

			temp = moveXPoint(this.x3, this.y3, mx, my);
			this.y3 = moveYPoint(this.x3, this.y3, mx, my);
			this.x3 = temp;

			temp = moveXPoint(this.x4, this.y4, mx, my);
			this.y4 = moveYPoint(this.x4, this.y4, mx, my);
			this.x4 = temp;
		}

		private int getX1() {
			return this.x1;
		}

		private int getY1() {
			return this.y1;
		}

		private int moveXPoint(int x, int y, double mx, double my) {
			return (int) Math.round(((x - mx) * trans(Math.cos(Math.toRadians(this.angle)))
					- (y - my) * trans(Math.sin(Math.toRadians(this.angle))) + mx));
		}

		private int moveYPoint(int x, int y, double mx, double my) {
			return (int) Math.round(((x - mx) * trans(Math.sin(Math.toRadians(this.angle)))
					+ (y - my) * trans(Math.cos(Math.toRadians(this.angle))) + my));
		}

		private double trans(double input) {
			return Double.parseDouble(String.format("%3f", input));
		}

	}
}
