import stanford.karel.*;

public class MyKarel extends Karel {

    public void run() {

        // Beeper at (7,1)
        move(); move(); move(); move(); move(); move();
        pickBeeper();

        // Beeper at (7,4)
        turnLeft();
        move(); move(); move();
        pickBeeper();

        // Beeper at (3,4)
        turnLeft();
        move(); move(); move(); move();
        pickBeeper();

        // Beeper at (3,7)
        turnRight();
        move(); move(); move();
        pickBeeper();

        // Beeper at (8,7)
        turnRight();
        move(); move(); move(); move(); move();
        pickBeeper();
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}