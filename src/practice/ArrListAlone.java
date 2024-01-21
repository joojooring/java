package practice;

//ArrayList
// : Collection Framework( 객체를 효율적으로 추가 , 삭제, 검색할 수 있도록
//                          관련 인터페이스 &클래스를 java.util에 포함시킴
//ArrayList 클래스 :
//                -> 표준 배열보다는 느림. But, 배열에서 많은 조작이 필요한 경우 유용함.
//                  배열과 다른 점 : 동적할당( 크기를 미리 지정하지 않아도 됨)
//                  리스트 자체도 기본타입이 아니라 참조형 ( 객체 자체를저장하는게 아니라 객체 주소값, 번지를 저장 : 동일한 객체를 중복 저장할 수 있음.
//                  즉 , 동일한 번지수가 저장될 수 있으므로 null도 가능!
// ArrayList<Integer같은 type> 변수명 = new ArrayList<>(); 동적할당이어서 크기를 안쓴거임


import java.util.ArrayList;
import java.util.Arrays;

public class ArrListAlone {
    public static void main(String[] args) {
//        1. ArrayList 생성 (정수형)
        ArrayList<Integer> numbers = new ArrayList<>();

//        2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

//        3. 요소 접근 : 변수명.get(인덱스번호)
        System.out.println("첫번째 요소 : "+ numbers.get(0));

//        4. 요소 수정 : 변수명.set(인덱스번호, 수정할 값)
        numbers.set(1,77);
        System.out.println("수정 값은 set으로"+ numbers);

//        5. 요소 삽입 (지정된 위치)
        numbers.add(5, 8465);
        System.out.println("삽입할 값은 add에 인덱스랑 값을 넣기 : "+numbers);

//        6. ArrayList 끼리 연결
        System.out.println(Arrays.asList(99,895,5656));
        numbers.addAll(Arrays.asList(99,895,5656));
        System.out.println("ArrayList끼리 연결할 땐 asList 후 addAll로:"+numbers);

//        7. 요소 위치 찾기 : indexof

        System.out.println(numbers.indexOf(10)); // 0
        System.out.println(numbers.indexOf(8465)); // 5

//        8. 요소 삭제 : remove()
        numbers.remove(5);
        System.out.println("요소 삭제시 remove" + numbers);

//        9.요소 전부 삭제시 : clear()
        numbers.clear();
        System.out.println("다 삭제됐니:??" + numbers);

//        10. 리스트 크기 확인 : size() - .length같은거임
        System.out.println("리스트 크기 : " +numbers.size());

//        11. 모든 요소 출력 : print()
        for (Integer arr : numbers){
            System.out.print( arr + " ");
        }

//        Student클래스의 타입으로 ArrayList 생성
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("John", 55));
//
//        Student std1 = new Student("Jenny" , 99);

    }
}

class Student {
    private String name;
    private int age;

    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge(){return age;};


}
