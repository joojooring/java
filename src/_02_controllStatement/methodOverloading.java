package _02_controllStatement;

//오버로딩 : 하나의 클래스에서 동일한 이름의 메서드 여러개 정의
// - 이름이 같고 매개변수 타입, 개수, 순서가 다른 경우를 의미
// - 동작이 유사할 때 사용하면 편함
public class methodOverloading {
    public static void main(String[] args) {
    //1. 객체 생성
         methodOverloading ol = new methodOverloading();

//  2. 객체의 메서드 사용
        System.out.println(ol.add(1,2));
        System.out.println(ol.add(1.1,2.2));
//        부동 소수점의 한계 :
        System.out.println(ol.add(5,5,5));
        System.out.println(ol.add(1.1,2,1.1));
    }
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b, double c){
        return a+b+c;
    }

}
