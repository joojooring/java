package _05_java_class._08_generic;

import java.util.ArrayList;

// 제네릭 클래스
class CustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();
//    메소드에서 제네릭을 쓸 때
    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

//    void 대신 반환형으로써 T를 적을 수도 있음
//    자료형이 T임 그래서 반환형도 T임
    public T get(int i){
        return list.get(i);
    }

    @Override
    public String toString(){
        return "CustomListGeneric = "+ list;

    }
}
public class GenericEx {
    public static void main(String[] args) {
        CustomListGeneric<Integer> genericLi = new CustomListGeneric<>();
        genericLi.addElement(1);
        genericLi.addElement(3);
        genericLi.addElement(6);
        genericLi.addElement(8);
        System.out.println(genericLi.toString());

        Integer el = genericLi.get(1);

        CustomListGeneric<Character> genericLi2 = new CustomListGeneric<>();
        genericLi2.addElement('A');
        genericLi2.addElement('B');
        genericLi2.addElement('C');
        System.out.println(genericLi2.toString());
    }
}
