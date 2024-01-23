package _05_java_class._04_inheritance.Prac2;

public class Bus extends Vehicle{

    private int passengerCapacity;

    public Bus(String brand, String model, int year){
        super();
        setBrand("현대");
        setModel("City Bus");
        setYear(2022);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void Type(){
        System.out.println("승객을 운송합니다.");
    }
}
