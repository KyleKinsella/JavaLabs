public class Cylinder extends ThreeDShape{
    private String name;
    private int height;
    private String color;
    private int radius;

    public Cylinder(String name, String color, int radius, int height) {
        super(name, color);

        this.name = name;
        this.color = color;
        this.radius = radius;
        this.height = height;
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

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }


    

    @Override
    public double volume() {
        // TODO Auto-generated method stub
        double v;
        double pie;
    
        pie = 3.14;
        
        v = pie * radius*radius * height;
        return v;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 0.5 * radius * height;
    }
}
