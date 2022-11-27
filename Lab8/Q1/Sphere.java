public class Sphere extends ThreeDShape{

    private String name;
    private String color;
    private int number;
    

    public Sphere(String name, String color, int number) {
        super(name, color);

        this.name = name;
        this.color = color;
        this.number = number;
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

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public double volume() {
        // TODO Auto-generated method stub
        double v;
        double pie;
        int height;

        height = 8;
    
        pie = 3.14;
        
        v = pie * number*number * height;
        return v;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        double a;
        double pie;

        pie = 3.14;

        a = 4 * pie * number*number;
        return a;
    }
}
