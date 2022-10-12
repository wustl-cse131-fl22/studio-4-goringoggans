package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.clear();
		StdDraw.setPenColor(213, 255, 4);
		StdDraw.filledRectangle(2, 2, 3, 4);
		StdDraw.filledRectangle(2, 12, 3, 4);
		StdDraw.filledRectangle(15, 2, 8, 4);
		StdDraw.filledRectangle(15, 12, 8, 4);
		StdDraw.setPenColor(255, 51, 153);
		StdDraw.filledRectangle(10, 10, 13, 1);
		StdDraw.filledRectangle(16, 10, 1, 10);
		StdDraw.setPenColor(51, 51, 0);
		StdDraw.filledCircle(11, 8, 2);
	}
}