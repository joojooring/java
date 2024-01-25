package _05_java_class._05_abstract.Prac;

  class Kim extends Student{

    public Kim(String name, String school, int age, int studentnumber){
        super(name,school,age,studentnumber );
    }

    @Override
    void todo() {
          System.out.println("점심은 김가네 김밥");
      }
  }

