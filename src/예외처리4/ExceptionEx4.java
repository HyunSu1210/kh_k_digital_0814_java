package 예외처리4;

import 학생성적정렬.StudentSortEx;
// ArithmeticException : 0으로 나누면 발생
import java.util.Scanner;

public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                continue;
            } finally { // 예외에 상관없이 무조건 실행되는 구문
                System.out.println("결과 : " + rst);
                break;
            }
        }
    }
}
