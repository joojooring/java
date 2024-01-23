package _05_java_class._04_inheritance.Prac2;

public class VehicleEx {
    public static void main(String[] args) {
        Bus bus1= new Bus("현대","City Bus", 2022);
        System.out.println("====Bus 정보====");
        bus1.setPassengerCapacity(30);
        System.out.println(bus1.getBrand()+" / "+bus1.getModel()+" / "+bus1.getYear()+" / "+bus1.getPassengerCapacity());
        bus1.startsaying();
        bus1.Type();
        bus1.endsaying();
        System.out.println("\n");


        Car car1 = new Car("도요타","Camry", 2023);
        System.out.println("===Car 정보===");
        car1.setCovertible(true);
        System.out.println(car1.getBrand()+" / "+car1.getModel()+" / "+car1.getYear()+" / "+car1.isCovertible());
        car1.startsaying();
        car1.Type();
        car1.endsaying();
        System.out.println("\n");

        Motorcycle bike1 = new Motorcycle("할리데이비슨","Sportster",2021);
        System.out.println("===Motorcycle정보===");
        bike1.setLicenseType("A");
        System.out.println(bike1.getBrand()+ " / "+ bike1.getModel()+ " / "+bike1.getYear()+ " / "+bike1.getLicenseType());
        bike1.startsaying();
        bike1.Type();
        bike1.endsaying();



    }
}
