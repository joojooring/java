package practice.inheriprac.vehiclePrac;

public class Car extends Vehicles {
    private boolean convertible;

    //    2. 생성자 생성
    public Car(String brand, String model, int year, boolean convertible) {
        super(brand, model, year);
        this.convertible = convertible;
    }

    //    3.객체 정보를 문자열로 반환하는 메소드를 오버라이드
    @Override
    public String toString() {
        return (
                "Car {" +
                        "brand='" +
                        getBrand() +
                        '\'' +
                        ", model='" +
                        getModel() +
                        '\'' +
                        ", year=" +
                        getYear() +
                        ", convertible=" +
                        convertible +
                        '}'
        );
    }
}
