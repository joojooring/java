package _05_java_class._06_interface.Prac2;

import java.util.ArrayList;

public class MovingEx {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];;
        Car car = new Car();
        Airplane airplane = new Airplane();
        
        vehicles[0] =car;
        vehicles[1] =airplane;

        for (int i = 0; i < vehicles.length; i++) {
            car.move();
            airplane.move();
            airplane.fly();
        }
        
    }
}
