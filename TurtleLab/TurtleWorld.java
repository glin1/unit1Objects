import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle a = new Turtle(turtleWorld);
        a.setPenColor(Color.GREEN);
        a.penDown();
        a.setWidth(24);
        a.setHeight(15);
        Turtle b = new Turtle(turtleWorld);
        b.setPenColor(Color.BLACK);
        b.penDown();
        b.setWidth(50);
        b.setHeight(35);
        a.forward (40);
        a.turnLeft();
        a.forward (40);
        a.turnLeft();
        b.turnLeft();
        b.forward(40);
        b.turnLeft();
        b.forward(40);
        a.forward (40);
        a.turnLeft();
        a.forward (40);
        a.forward (40);
        a.turnLeft();
        a.setPenColor(Color.RED);
        a.forward (40);
        a.turnLeft();
        b.forward (30);
        b.turnLeft();
        b.forward (50);
        b.turnLeft();
        b.forward (30);
        b.setPenColor(Color.YELLOW);
        b.turnLeft();
        b.forward (50);
        b.turnLeft();
        b.forward (100);
        b.turnLeft();
        b.setPenColor(Color.BLACK);
        b.forward (150);
        b.turnLeft();
        b.forward (100);
        b.turnLeft();
        b.forward (150);
        b.turnLeft();
    }
}