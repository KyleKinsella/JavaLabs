public class Circle extends TwoDShape{

    private String name;
    private String color;
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);

        this.name = name;
        this.color = color;
        this.radius = radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return radius;
    }
}
