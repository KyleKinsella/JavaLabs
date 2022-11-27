public class Rectangle extends TwoDShape{
    
    private String name;
    private String color;
    private double lenght;
    private double breadth;

    public Rectangle(String name, String color, double lenght, double breadth) {
        super(name, color);

        this.name = name;
        this.color = color;
        this.lenght = lenght;
        this.breadth = breadth;
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


    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getBreadth() {
        return breadth;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 0.5 * lenght * breadth;
    }
}
