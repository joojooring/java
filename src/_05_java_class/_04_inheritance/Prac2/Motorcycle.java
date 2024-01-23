package _05_java_class._04_inheritance.Prac2;

public class Motorcycle extends Vehicle {
    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    private String licenseType;

    public Motorcycle(String brand, String model, int year){
        super();
        setBrand("할리데이비슨");
        setModel("Sportster");
        setYear(2021);
    }

    public void Type(){
        System.out.println("울림통을 합니다.");
    }
}
