package _05_java_class._03_final;


//상수 : 변하는 않는 값!
//      - 상수는 객체마다 저장할 필요가 없고, 단 한번만 값이 선언되면 되기 때문에
//        static이면서 final인 특성을 가짐
//      - 모든글자를 대문자로 쓰는것이 관례

public class ConstEx {
    public static void main(String[] args) {
//        상수 읽기
//        static이니까 class명에다가 .점 찍어서 접근
        System.out.println(Constant.MAX_VALUE);
        System.out.println(Constant.GREETING);
    }
}
