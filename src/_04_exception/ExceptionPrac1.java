package _04_exception;

public class ExceptionPrac1 {

    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        for (int i = 0; i < 5 ; i++) {
            try{
                System.out.println(numbers[i]);
            }catch (ArrayIndexOutOfBoundsException  e){
                System.out.println("인덱스가 범위를 벗어났습니다.");
            }

        }
    }

}
