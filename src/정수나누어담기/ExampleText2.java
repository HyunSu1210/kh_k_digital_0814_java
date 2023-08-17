package 정수나누어담기;

import java.util.Scanner;

// 100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입하기
public class ExampleText2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100 자리 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100; // 100으로 나눈 몫을 구함(백의 자리)
        int b = (num % 100) / 10; // 100으로 나눈 나머지에서 다시 10으로 나눈 몫을 구함(십의 자리)
        int c = num % 10; // 나머지 구하기(일의 자리)
        System.out.println("100의 자리 : " + a + ", 10의 자리 : " + b + ", 1의 자리 : " + c);
    }
}
