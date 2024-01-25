package _05_java_class._06_interface.Prac2Correct;

public class VehicleEx {
    public static void main(String[] args) {
//      Vehicle 배열 생성
        Vehicle[] vehicles = new Vehicle[2];

//        Car 객체 생성 및 배열에 저장
        Car car = new Car("자동차", 100);
        vehicles[0] = car;

//        Airplane 객체 생성 및 배열에 저장
        Airplane airplane = new Airplane("비행기", 500);
        vehicles[1] = airplane;

//        형변환 : upcasting 과 downcasting
//        상위 ->하위 : ()괄호로 명시
//        하위 ->상위 : 생략 가능


//        배열 순회하면서 출력
        for(Vehicle vehicle : vehicles){
            System.out.println("이름 : "+vehicle.getName());
            vehicle.move();

//            instanceof연산자? 자동차 - false / 비행기 - true
//              - instanceof : 여러가지 클래스나 객체가 있을 텐데 각각의 type을 알 수 가 없을 때 type을 검사함
//            airplane에선 flyable을 구현했기 때문에 true가 나온거고
//            car에선 flyable을 구현하지 않았기 때문에 false가 나온거임

            System.out.println(vehicle instanceof Flyable);

//            Flyable 구현한 경우 fly() 메서드를 호출
            //if(vehicle instanceof  Flyable){
               // ((Flyable) vehicle).fly(); // 앞에 괄호에 붙은건 형변환 해준거임 (형변환=캐스팅)
//                형변환(upcasting 과 downcating ) 상위클래스로 변환할거냐/ 하위클래스로 변환할거냐
//                명시할 때는 상위클래스에 하위클래스로 변환할 때임

            if(vehicle instanceof Airplane){
                ((Airplane) vehicle).fly();
            }
        }

    }
}
