package 계산기만들기;

import java.util.Scanner;

public class CalcSwitch {
    public static void main(String[] args) {
        int x, y; // 좌변과 우변
        char op; //연산자
        System.out.println("계산식 입력 : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        op = sc.next().charAt(0);
        y = sc.nextInt();

        switch (op) {
            case '+' :
                System.out.println("덧셈 : " + (x+y));
                break;
            case '-' :
                System.out.println("뺄셈 : " + (x-y));
                break;
            case '*' :
                System.out.println("곱셈 : " + (x*y));
                break;
            case '/' :
                System.out.println("나눗셈 : " + (x/y));
                break;
            default:
                System.out.println("연산자를 잘못 입력했습니다.");
        }
    }
}
