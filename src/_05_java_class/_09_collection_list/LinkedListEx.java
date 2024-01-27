package _05_java_class._09_collection_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
//        ArrayList 컬렉션 객체 생성 비교위해!
        List<String> list1 = new ArrayList<>();

//        LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<>();

//        시작, 끝 변수 선언
        long startTime;
        long endTime;


//        ArrayList의 0번 인덱스에 데이터 추가(10000회 반복)
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0,String.valueOf(i));
            // String.valueOf(i)로 변환된 i 값을 추가합니다. 즉, 0부터 9999까지의 숫자를 문자열로 변환하여 list1의 맨 앞에 추가하는 작업을 10000번 반복
            // valueOf() : 기본 데이터 타입을 객체로 변환 (래퍼 클래스의 객체로 변환하는거)
            //ex)  String.valueOf(10)은 정수 10을 문자열 "10"으로 변환하여 반환
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 소요시간 : "+(endTime - startTime));


//        LinkedList 0번 인덱스에 데이터 추가(10000회 반복)
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요시간 : "+(endTime - startTime));
    }

//    ArrayList 소요 시간 : 5865100
//    LinkedList 소요시간 : 794600  => 더 빠름!

//    결과 해석
//    -LinkedList가 요소 추가에 대해 더 빠른 성능을 냄
//    -Arraylist는 0번 인덱스에 새로운 요소를 추가하면서, 기존 요소 인덱스를 한 칸씩 뒤로 미는 작업을 하기 때문

}
