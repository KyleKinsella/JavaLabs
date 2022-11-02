public class Circle extends Point{
    private int radius;
    //private int c;
    //private double half;
    private int Z;

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
        // formula = r = c/2 pie(3.14)
        
        /*c = 30;

        radius = c /2;
        half = radius * 3.14;
        
        */
        
        return radius;
    }


    public void setZ(int Z) {
        this.Z = Z;
    }

    public int getZ() {
        return Z;
    }

    public String toString() {
        return "The Radius is " + getRadius();
    }
}
