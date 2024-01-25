package _05_java_class._05_abstract.Prac2;

public abstract class Shape {

    private String color;
    private  String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Shape(String color, String type ){
        this.color=color;
        this.type=type;
    }

    abstract void calculateArea();

}
