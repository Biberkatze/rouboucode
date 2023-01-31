package CedricTuma;
import robocode.*;
public class ErichHartmann extends JuniorRobot
{
    public void aroundTheWorld() {		//The robot spins around
            back(5);
            turnRight(180);
            ahead(20);
        }
    public void run() {
        setColors(black, black, black, green, green);
        while(true) {                    //what the robot does when nothing else happens
            ahead(200);
			turnGunRight(90);
			turnGunLeft(90);
        } 
    }
    public void onScannedRobot() {
        turnGunTo(scannedAngle);        //The Robot shoots stronger the closer the enemy is
        fire(1);
        if(scannedDistance < 15){
        turnGunTo(scannedAngle);
        fire(3);
        back(20);
            }
    }
    public void onHitByBullet() {
        back(10);                        //tries to evade the next bullet and fire back
        turnGunTo(hitByBulletAngle);
        fire(2);
        aroundTheWorld();
    }
}