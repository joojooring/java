package _04_exception;

public class Prac1correct {

    public static void main(String[] args) {
        int[] arr = new int[4];
        try{
            for (int i = 0; i < 5 ; i++) {
//                배열 크기를 벗어나는 인덱스에 접근
                arr[i] = i;
                System.out.println("인덱스"+i+"=" + arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
//            예외처리
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }

    }
}
