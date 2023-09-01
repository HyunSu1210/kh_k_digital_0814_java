package 전자레인지2;
// 5분 버튼, 1분 버튼, 10초 버튼
// 최소 횟수를 눌러서 요리 시간을 설정하는 문제
// 시간을 맞출 수 없으면 -1 반환

import java.util.Scanner;

public class MicroWave {
    public static void main(String[] args) {
        int t, a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("요리시간(초) : ");
        t = sc.nextInt();
        if(t % 10 != 0) System.out.println("-1");
        else {
            a = t / 300;
            b = t % 300 / 60;
            c = t % 300 % 60 / 10;
            System.out.printf("%d %d %d \n", a, b, c);
        }
    }
}
