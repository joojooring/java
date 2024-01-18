package _02_controllStatement;

import java.util.Scanner;

public class Prac5correct {
    public void calc(double x, double y){
        System.out.printf("덧셈결과 : %.1f", x+y).println();
        System.out.printf("뺄셈결과 : %.1f", x-y).println();
        System.out.printf("나눗셈결과 : %f", x/y).println();
        System.out.printf("곱셈결과 : %.1f", x*y).println();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Prac5correct pr = new Prac5correct();

        System.out.println("숫자 두 개를 입력하세요.");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        pr.calc(n1,n2);
        sc.close();
    }
}
