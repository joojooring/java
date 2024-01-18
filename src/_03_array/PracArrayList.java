package _03_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracArrayList {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("문자를 입력해주세요.");
            String texting = scanner.nextLine();
            if(texting.equals("exit")){
                for(String t : text){
                    System.out.println(t);
                }
                break;
            }
            text.add(texting);
        }
    }
}
