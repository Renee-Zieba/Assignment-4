package week2;

/* This will draw ten circles of random size, random color,
 * and position on the canvas, never extending past the
 * edges.
 */

import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.*;
import acm.util.RandomGenerator;


public class RandomCircles extends GraphicsProgram {
	
	private static final int MAX_CIRCLES = 10;
	private static final double MIN_RADIUS = 5;
	private static final double MAX_RADIUS = 50;
	private RandomGenerator rGen = RandomGenerator.getInstance();
	
	public void run () {
		
		for (int i = 0; i < MAX_CIRCLES; i++) {
			int x = rGen.nextInt(50, 500);
			int y = rGen.nextInt(50, 400);
			int r = rGen.nextInt(5, 50);
				Color color = rGen.nextColor();
				GOval circle = new GOval (x, y, 2 * r, 2 * r);
				circle.setFilled(true);
				circle.setFillColor(color);
				add(circle);
			
			
		}
	}

}
