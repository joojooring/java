package _05_java_class._09_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetEx {
//    HashSet 컬렉션 생성
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

//        객체 저장
        set1.add("apple");
        set1.add("banana");
        set1.add("kiwi");
        set1.add("banana"); // set은 중복된 객체 저장 안해줌!
        System.out.println(set1);//[banana, apple, kiwi] : 순서도 없어서 무작위임

//        저장된 객체 개수 출력
        int size1 =set1.size();
        System.out.printf("총 %d 종류의 과일이 있습니다. %n%n", size1);


//        ///////////////////////////////////////
//        Course 클래스 정의 후 !
        Set<Course> set2 = new HashSet<>();

//        객체 저장시
        Course java = new Course(101,"Java");
        Course js1 = new Course(102,"JavaScript");
        Course js2 = new Course(102,"JavaScript"); // 중복이 될까?

        System.out.println(java.hashCode()); //2301607
        System.out.println(js1.hashCode()); // 1266328083
        System.out.println(js2.hashCode()); //1266328083
        System.out.println(js1.equals(js2)); //true

        set2.add(java);
        set2.add(js1);
        set2.add(js2); //인스턴스인 객체 자체는 다르지만 동등 값이므로 객체 1개만 저장! : 요게 hashSet

//        저장된 객체 개수 출력
        int size2 = set2.size();
        System.out.printf("총 %d 종류의 과정이 있습니다. %n%n",size2 );

//         전체 요소 출력
//        case1. 반복문 사용
        System.out.println("===반복문으로 Set객체 출력===");
        for(Course c : set2){
            System.out.println(c);
        }
        System.out.println();

//        case2. iterator() 메소드로 반복자를 얻어 객체 하나씩 가져오기
//        반복자인 iterator가 제공하는 메서드
//        - boolean을 반환하는 hasNext() : 가져올 객체가 있으면 true, 가져올 객체가 없으면 false
//        - E next() : 요소반환 : 컬렉션에서 하나의 객체를 가져옴
//        - void remove() : next()로 가져온 객체를 Set 컬렉션에서 제거해줌
        System.out.println("===iterator() Set객체 출력===");
        Iterator<Course> iterator = set2.iterator();
        while (iterator.hasNext()){
            //가져올게 있으면 true가 됨
            Course c = iterator.next();
            System.out.println(c);
        }
    }

}
