package practice;

public class Star {
    public static void main(String[] args) {
        System.out.println("별찍기");
        for(int i=1; i<6; i++){
                    for(int j=0; j<i; j++){
                        System.out.print("*");
                    }
            System.out.println();
        }

        System.out.println("=======트리========");
        for(int i=1; i<10; i +=2){
            for(int j=9; j>i; j -=2){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
