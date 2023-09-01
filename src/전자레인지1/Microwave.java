package 전자레인지1;

import java.util.Scanner;

public class Microwave {
    final static int BUTTON_A = 300; // 5분 = 300초
    final static int BUTTON_B = 60; // 1분 = 60초
    final static int BUTTON_C = 10; // 10초

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요리 시간 (초) : ");
        int cookTime = sc.nextInt();
        int t = cookTime;
        int a = 0, b = 0, c = 0; // 각 버튼 조작 횟수
        if (cookTime > 0 && cookTime < 10000) {
            if (t / BUTTON_A > 0) { // 300으로 나눈 몫이 있으면
                a = t / BUTTON_A; // 버튼 조작 횟수
                t = t % BUTTON_A; // 남은 시간
            }
            if (t / BUTTON_B > 0) { // 60으로 나눈 몫이 있으면
                b = t / BUTTON_B; // 버튼 조작 횟수
                t = t % BUTTON_B; // 남은 시간
            }
            if (t / BUTTON_C > 0) { // 10으로 나눈 몫이 있으면
                c = t / BUTTON_C; // 버튼 조작 횟수
                t = t % BUTTON_C; // 남은 시간
            }
        } else System.out.println("범위를 벗어났습니다.");
        System.out.println("A B C");
        if(t != 0) { // 나누어 떨어지지 않으면 false
            System.out.println("-1");
        }
        System.out.println(a + " " + b + " " + c);
    }
}
