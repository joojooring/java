package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPracAlone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> txt = new ArrayList<>();

        while(true){
            System.out.println("문자를 입력해주세요. : ");
            String msg = scanner.next();

            if (msg.equals("exit")) break;

            txt.add(msg);
        }

        for( String array : txt){
            System.out.println(array);
        }

    }
}
