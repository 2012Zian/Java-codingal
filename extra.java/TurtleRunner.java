package extra.java;

public class TurtleRunner 
{
    public static void main(String[] args)
    {
        Turtle t = new Turtle(0, 0, 0);

        t.drawPolygon(50, 4);
        int perimeter = t.calculatePerimeter(50, 4); 

        System.out.println("Perimeter: " + perimeter);
        System.out.println("X: " + t.getX() + ", Y: " + t.getY());
    }
}

    

