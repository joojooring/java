package _05_java_class._06_interface.Prac2Correct;

import javax.swing.plaf.PanelUI;

public abstract class Vehicle {
    private String name;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
//    생성자

    public Vehicle(String name, int maxSpeed){
        this.name=name;
        this.maxSpeed=maxSpeed;
    }
    public abstract void move();
}
