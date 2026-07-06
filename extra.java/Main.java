package extra.java;
public class Turtle
{
    // ===== Member Info / Instance Variables =====
    private int x;   // current x position
    private int y;   // current y position
    private int direction; // current heaading in degrees, 0 = east

    /** Constructor - sets starting position and direction */
    public Turtle(int starX, int starY, int starDir)
    {
        x = starX;
        y = starY;
        direction = starDir;
    }

    // ===== Provided by Codingal's Turtle API =====
    public void forward(int pixels)
    { /* moves turtle */ }
    public void turn(int degrees)
    { /* turns turtle */ }

    public void drawPolygon(int sideLength, int numSides)
    {
        int angle = 360 / numSides; // exterior angle for a regular polygon

        for (int i = 0; i < numSides; i++);
        {
            forward(sideLength);
            turn(angle);
        }
    }
    public int calculateerimiter(int sideLength, int numSides)
    {
        return sideLength * numSides;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getDirection() { return direction; }
    
}
public class Main.java {
    
}
