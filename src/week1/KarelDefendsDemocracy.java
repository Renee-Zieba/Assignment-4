package week1;

import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		move();
		move();
		move();
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnAround();
		move();
		turnRight();
		move();
		move();
		turnLeft();
		move();
		if (beepersPresent()) {
			pickBeeper();
		turnAround();
		while (frontIsClear()) {
			move();
		}
		}
		turnAround();
		move();
		turnRight();
		move();
		move();
		move();
		move();
		turnLeft();
		move();
		if (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		while (frontIsClear()) {
			move();
		}
		if (beepersPresent()) {
			pickBeeper();
			pickBeeper();
		}
		turnAround();
		move();
		turnRight();
		while (frontIsClear()) {
		move();
		}
				
	}


	
		
}
