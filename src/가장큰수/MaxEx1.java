package 가장큰수;

import java.util.Scanner;

public class MaxEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a, b, c;
        a = num / 100;
        b = (num % 100) / 10;
        c = num % 10;

        if (a > b) {
            System.out.println(Math.max(a, c));
        } else {
            System.out.println(Math.max(b, c));
        }
    }
}
