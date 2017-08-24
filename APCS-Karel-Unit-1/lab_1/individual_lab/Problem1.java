package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        move2AndTurnLeft();
        move2AndTurnRight();
        turnRight();
        pick5Beepers();
        move2AndTurnRight();
        move2AndTurnRight();
        turnRight();
        drop5Beepers();
        move2AndTurnRight();
        move2AndTurnRight();
        turnRight();
        
    }
    public void drop5Beepers() {
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
         move();
         putBeeper();
    }
    public void pick5Beepers() {
         pickBeeper();
         move();
         pickBeeper();
         move();
         pickBeeper();
         move();
         pickBeeper();
         move();
         pickBeeper();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move2() {
        move();
        move();
    }
    public void move2AndTurnRight() {
        turnRight();
        move2();
    }
    public void move2AndTurnLeft() {
        turnLeft();
        move2();
    }
}
