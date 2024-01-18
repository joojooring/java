package _03_array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
//        ArrayList
//          : Collection Framework (객체를 효율적으로 추가, 삭제,검색할 수 있도록 관련 인터페이스& 클래스를 java.util에 포함 시켜 놓음)
//                => List (이 안에 ArrayList : 이건 class로 씀) / Set(이 안에 HashSet, TreeSet) / Map (이 안에 HashMap, HashTable, TreeMap)

////        ArrayList 클래스 : List 컬렉션에서 가장 많이 사용하는 컬렉션
//                  => 표준 배열보다는 느림. But, 배열에서 많은 조작이 필요한 경우 유용함.
//                      배열이랑 다른 점 : 동적할당 (크기를 미리 지정하지 않아도 됨)
//                      리스트 자체도 기본타입이 아니라 참조형(객체 자체를 저장하는게 아니라 객체 주소값,번지를 저장 : 동일한 객체를 중복 저장할 수 있음. 즉, 동일한 번지수가 저장될 수 있으므로 null도 가능)
//        ArrayList<Integer같은 type> 변수명 = new ArrayList<>(); 동적할당이라서 크기를 안쓴거임
public class ArrayListEx {
    public static void main(String[] args) {
//        1. ArrayList 생성 (정수형)
        ArrayList<Integer> numbers = new ArrayList<>();

//        2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

//        3. 요소 접근
        System.out.println("첫번째 요소 : " + numbers.get(0));

//        4. 요소 수정
        numbers.set(1,77);
        System.out.println("numbers : " + numbers);

//        5. 요소 삽입 (지정된 위치)
        numbers.add(5,8888);
        System.out.println("numbers 삽입 : " + numbers);

//        6. ArrayList끼리 연결
        System.out.println(Arrays.asList(99,33,55)); //[99, 33, 55] 리스트 형식으로 생성

        numbers.addAll(Arrays.asList(99,33,55));
        System.out.println(" ArrayList끼리 연결 : " + numbers); //[10, 77, 30, 40, 50, 8888, 99, 33, 55]


//        7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10)); //10은 0번째 인덱스니까 0
        System.out.println(numbers.indexOf(30));
        System.out.println(numbers.indexOf(99));


//        8. 요소 삭제
        numbers.remove(5);
        System.out.println("사라졌니 : "+numbers);

//        9. 요소 전부 삭제시 .clear()
//        numbers.clear();
        System.out.println("비었니 " + numbers);

//        10. 리스트 크기 확인 : size() ( length같은거)
        System.out.println("리스트 크기 : " + numbers.size()); //lenth가 8이라서 8

//        11. 모든 요소 출력 print()
        for(Integer n : numbers) {
            System.out.print( n + " ");
        }

///////////////////////////////////////////////////////////////////
//        Student클래스의 타입으로 ArrayList 생성
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 55));

        Student std1 = new Student("Jennny",99);
        students.add(std1);


        students.add(new Student("Rose", 18));
        students.add(new Student("Lily", 13));
        students.add(new Student("Lisa", 21));


        System.out.println("학생들 : " + students); // 이렇게 하면 학생들 : [_03_array.Student@568db2f2, _03_array.Student@378bf509, _03_array.Student@5fd0d5ae, _03_array.Student@2d98a335, _03_array.Student@16b98e56]
        System.out.println("학생 수 : " + students.size());

        Student std = students.get(0); //students에 있는 index로 접근해서 0번 학생을 확인해봄
        System.out.println(std.getName() + " 나이는 " + std.getAge()+"세 입니다.");

//        반복문 이용해서 출력할 수도 있음
        System.out.println("==학생 명단==");
        for (Student student : students){
            System.out.println(student.getName()+" 나이는 " + student.getAge());
        }

//        반복문을 꼭 이용해야 출력이 가능한가????
//       클래스로 만들어서 참조형이면 주소값이 나오므로 for문으로 순회하면서 값을 가져와야 됨.
        System.out.println(Arrays.toString(numbers.toArray())); // toString은 배열이 들어가야되는데 numbers는 배열이 아니므로 .toArray()로 배열을 만들어준거임


//        ArrayList 메소드
//        ArrayList.add(값) : 맨 뒤에 추가
//        ArrayList.add(index, 값) : index 위치에 값이 추가됨
//        ArrayList.addAll()
//        ArrayList.size() : leghth랑 똑같은 역할 . ArrayList의 길이를 알려줌
//        ArrayList.get(index) : index에 해당하는 요소 리턴
//        ArrayList.indexOf(매개변수) : params와 같은 첫번째 요소의 index 리턴, 없으면 -1 리턴

    }
}


class Student {
    private String name ;
    private  int age;

//    생성자를 받고
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
}