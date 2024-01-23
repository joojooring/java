package _05_java_class._04_inheritance.Prac;

import org.w3c.dom.ls.LSOutput;

public class Animal {

    public String specific;
    public String name;
    public int age;

    public Animal(String specific, String name ,int age){
        this.specific=specific;
        this.name=name;
        this.age=age;
    }


    public void makeSound(){
        System.out.println("동물은 소리를 낸다.");
    }
}
