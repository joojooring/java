package _05_java_class._05_abstract.Prac2;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String color, String type, double width, double height){
        super(color,type);
        this.width=width;
        this.height=height;
    }

    @Override
    void calculateArea() {
        double area = width * height;
        System.out.println("도형의 넓이 : "+area);
    }
}
