package TKO;

import robocode.*;

public class LtDan extends Robot{
	
	public void run() {
		while(true) {
			ahead(90);
			turnGunRight(360);
			back(90);
			turnGunLeft(360);
		}
	}
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}
	

}
