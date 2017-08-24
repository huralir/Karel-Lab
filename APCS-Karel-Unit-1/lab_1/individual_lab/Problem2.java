package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
       reposition1();
       bottomLeftHalf8();
       topRightHalf8();
       topLeftHalf8();
       bottomRightHalf8();
       
    }
    public void reposition1() {
        turnLeft();
        move();
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void bottomLeftHalf8() {
        move();
        move();
        turnRight();
        move();
        move();
        turnLeft();
    }
    public void topRightHalf8() {
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
    }
    public void topLeftHalf8() {
        move();
        move();
        turnLeft();
        move();
        move();
        turnRight();
    }
    public void bottomRightHalf8() {
        move();
        move();
        turnRight();
        move();
        turnRight();
    }
}