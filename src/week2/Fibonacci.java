package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private int MAX_TERM_VALUE = 10000;
	private int t = 0;
	private int t1 = 1;
	private int t2 = t + t1;
	
	public void run() {
		
		println("This program lists the Fibonacci sequence.");
			
			while ( t <= MAX_TERM_VALUE) {
				println(t);
				t2 = t + t1;
				t1 = t;
				t = t2;
				
			}
			
			
	}
	
	
}			


