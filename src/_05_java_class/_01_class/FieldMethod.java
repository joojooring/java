package _05_java_class._01_class;

public class FieldMethod {

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    //    getter : 우클릭 generate getter/ setter로 자동 생성 가능
    public int getAge(){ return age; }

    public void setName(String name) {
        this.name = name;
    }

    //    setter
    public void setAge(int age){
        this.age =age;
    }

    public static void main(String[] args) {
        FieldMethod joojoo = new FieldMethod();
        joojoo.age = 10; // 같은 클래스라 들어는 가지만 권장xx
        joojoo.setName("joojooring"); //권장o

//        출력시에도 getter와 setter을 이용하는걸 권장함
        System.out.println(joojoo.age);//권장x , 다른 클래스에선 접근이 안되므로
        System.out.println(joojoo.getAge()); //권장o, 다른 클래스에서도 접근이 가능
    }
}
