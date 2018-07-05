import org.jointheleague.graphical.robot.Robot;

import java.awt.*;

public class RobotGraffiti {
    private static Robot myName;

    public static void main(String[] args) throws Exception {
        myName = new Robot();
        myName.setSpeed(200);
        myName.penDown();
        myName.setX(100);
        myName.setY(500);

        drawA();
        between2Letters();
        drawN();
        between2Letters();
        drawN();
        between2Letters();
        drawE();
        myName.hide();

    }

    private static void between2Letters() {
        myName.penUp();
        myName.turn(-90);
        myName.move(50);
        myName.penDown();

    }

    private static void drawE() {
        myName.setPenColor(Color.red);
        myName.turn(-90);
        myName.move(200);
        myName.turn(90);
        myName.move(100);
        myName.turn(180);
        myName.move(100);
        myName.turn(-90);
        myName.move(75);
        myName.turn(-90);
        myName.move(60);
        myName.turn(180);
        myName.move(60);
        myName.turn(-90);
        myName.move(125);
        myName.turn(-90);
        myName.move(100);
    }

    private static void drawN() {
        myName.setPenColor(Color.green);
        myName.turn(-90);
        myName.move(200);
        myName.turn(150);
        myName.move(226);
        myName.turn(-150);
        myName.move(200);
        myName.turn(180);
        myName.move(200);
    }

    private static void drawA() {
        myName.setPenColor(Color.blue);
        myName.move(200);
        myName.turn(90);
        myName.move(100);
        myName.turn(90);
        myName.move(75);
        myName.turn(90);
        myName.move(100);
        myName.turn(180);
        myName.move(100);
        myName.turn(90);
        myName.move(125);
    }
}
