package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  H. Rizvi
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnRight();
        turnRight();
        mach5();
        turnRight();
        mach3();
        pickBeeper();
        turnRight();
        mach3();
        pickBeeper();
        turnRight();
        mach3();
        turnLeft();
        mach2();
    }
    public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
    public void mach2() {
       move();
       move();
    }
    public void mach3() {
       move();
       move();
       move();
    }
    public void mach5() {
       move();
       move();
       pickBeeper();
       move();
       move();
       move();
       pickBeeper();
    }
}

