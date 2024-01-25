package practice.inheriprac.vehiclePrac;

public class Bus extends Vehicles{

    private int passengerCapacity;

//    2. 생성자
    public Bus(String brand,String model,int year,int passengerCapacity){
        super(brand,model,year);
        this.passengerCapacity=passengerCapacity;
    }

//    3. 메소드 생성
    public void carryPassengers(){
        System.out.println("승객을 운송합니다.");

    }
    // 객체 정보를 문자열로 반환하는 메소드를 오버라이드
    @Override
    public String toString() {
        return (
                "Bus {" +
                        "brand='" +
                        getBrand() +
                        '\'' +
                        ", model='" +
                        getModel() +
                        '\'' +
                        ", year=" +
                        getYear() +
                        ", passengerCapacity=" +
                        passengerCapacity +
                        '}'
        );
    }
}
