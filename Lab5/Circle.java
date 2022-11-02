public class Circle extends Point{
    private int radius;

    public Circle() {
       this(0, 0, 0);
    }

    public Circle(int X, int Y, int radius) {
        super(X, Y);
        setRadius(radius);
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return "The Radius is " + getRadius();
    }
}
