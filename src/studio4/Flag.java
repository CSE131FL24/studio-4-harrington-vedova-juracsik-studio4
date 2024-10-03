package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(1500,800);
		
		Color bratGreen = new Color(138, 206, 0);
		Color neonPurple = new Color(171,32,253);
		Color hotPink = new Color(255, 105, 180);
		Color black = new Color(0,0,0);
		
		
		
		for(double i = 0; i < 1; i = i + 0.1){
			StdDraw.setPenColor(neonPurple);
			StdDraw.filledRectangle(.5, i, 1, .05);
			StdDraw.setPenColor(hotPink);
			StdDraw.filledRectangle(.5, i+0.05, 1, .05);
		}
		
		
		
		StdDraw.setPenColor(bratGreen);
		StdDraw.filledSquare(0.25, 0.75, .25);
		StdDraw.setPenColor(black);
		
		StdDraw.text(0.25, .75, "aleksei");
		
	}
}