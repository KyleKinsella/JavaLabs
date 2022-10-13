public class Triangle {
    private int width;
    private int lenght;
    private int area;
    private int Perimeter;
    private int printRect;

    public Triangle() {
        setWidth(1);
        setLenght(1);
    }

    public void setWidth(int width) {
        this.width = width;

        if(width == 0 || width <= 40) {
            System.out.println("The width is " + width);
        }
        
    }

    public int getWidth(int width) {
        return width;
    }





    public void setLenght(int lenght) {
        this.lenght = lenght;

        if(lenght == 0 || lenght <= 40) {
            System.out.println("The lenght is " + lenght);
        }
    }

    public int getLenght(int lenght) {
        return lenght;
    }


    public String toString() {
        return "Width " + getWidth(5) + ", " + " Lenght " + getLenght(10);
    }
    


    public void setArea(int area) {
        this.area = area;
    }


    public int getArea() {
        //formula Area = (width)(lenght)

        int w;
        int l;

        w = 5;
        l = 7;

        area = (w * l);

        System.out.println("Area of Triangle is: " + area);

        return area;
    }



    public void setPerimeter(int Perimeter) {
        this.Perimeter = Perimeter;
    }

    public int getPerimeter() {
        // formula = 2(lenght + width)

        int l;
        int w;

        l = 5;
        w = 7;
        Perimeter = 2*(l + w);

        System.out.println("Perimeter of Triangle is: " + Perimeter);

        return Perimeter;
    }



    public void setPrintRectangle(int printRect) {
        this.printRect = printRect;
    }


    public String getPrintRectangle() {
        int lenght;
        int width;
        int i;
        int k;

        width = 5;
        lenght = 7;

        for(i = 0; i < lenght; i++) {
            for(k = 0; k < width; k++) {
                if(i==0 || i == lenght -1 || k == 0 || k == width -1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return null;
        }
}


