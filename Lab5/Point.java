public class Point{
    private int X;
    private int Y;

    public Point() {
        
    }

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getX() {
        return X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getY() {
        return Y;
    }

    public String toString() {
        return "Your X value is " + getX() + " your Y value is " + getY();
    }
}