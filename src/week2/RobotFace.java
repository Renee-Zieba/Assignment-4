package week2;

import acm.graphics.GOval;
import acm.graphics.GRect;

/*This program inputs a robot face. */

import acm.program.GraphicsProgram;
import java.awt.*;

public class RobotFace extends GraphicsProgram {
	
/* These are the parameters for the robot face. */
	private int HEAD_WIDTH = 200;
	private int HEAD_HEIGHT = 300;
	private int EYE_RADIUS = 20;
	private int MOUTH_WIDTH = 120;
	private int MOUTH_HEIGHT = 40;
	private double x = getWidth();
	private double y = getHeight();
	
	
	public void run() {
	
	
/*This sets the head centered at (cx, cy) */
	
		GRect head = new GRect(x + 275, y + 75, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setColor(Color.BLACK);
		head.setFillColor(Color.GRAY);
		add(head);
		
		
	
/*This adds eyes at (cx, cy) */
		
		GOval eye = new GOval(x + 300, y + 150, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setColor(Color.YELLOW);
		eye.setFillColor(Color.YELLOW);
		add(eye);
		
		GOval eye1 = new GOval(x + 400, y + 150, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye1.setFilled(true);
		eye1.setColor(Color.YELLOW);
		eye1.setFillColor(Color.YELLOW);
		add(eye1);
		
/*This adds a mouth centered at (cx, cy) */
		
		GRect mouth = new GRect(x + 315, y + 275, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	}
	
	
	}
	
