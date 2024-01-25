package _05_java_class._05_abstract.Prac2;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, String type, double radius){
        super(color,type);
        this.radius=radius;
    }

    @Override
    void calculateArea() {
        double area= radius*radius*3.141592;
        System.out.println("원의 넓이 : "+area);
    }
}
