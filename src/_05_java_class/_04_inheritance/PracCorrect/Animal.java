package _05_java_class._04_inheritance.PracCorrect;

public class Animal {
//    1.필드 (종. 이름. 나이)
    private String species;
    private String name;
    private int age;


//    초기화는 생성자에서 해서 setter는 안만들어도 되고
//    출력될 때 필요한 getter만 만든거임
    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //    2.생성자 추가 : 객체를 만들때 자동으로 실행이 되는 메소드
//    생성자에서 초기화하려면 매개변수에 받으면 됨
    public Animal(String species, String name, int age){
        this.species = species;
        this.name = name;
        this.age = age;
    }

//    3.메소드 추가
    public void makeSound(){
        System.out.println("동물은 소리를 낸다.");
    }
}
