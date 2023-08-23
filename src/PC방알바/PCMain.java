package PC방알바;

import java.util.Scanner;

// 1~100 컴퓨터
// 입력한 자리에 사람이 있으면 거절당함, 없으면 앉을 수 있음
// 거절당하는 수 출력
// 첫째 줄 : 손님 수 N(N<=100) 입력
// 둘째 줄 : 손님 수만큼 자리 입력
public class PCMain {
    public static void main(String[] args) {
        int cnt = 0, seatNum; // 자리 번호
        int[] seat = new int[100]; // 자리 수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 손님 수 첫줄에 입력
        for (int i = 0; i < n; i++) {
            seatNum = sc.nextInt(); // 손님 수만큼 자리 번호 입력받음
            if (seat[seatNum - 1] == 1) cnt++;
            else seat[seatNum - 1] = 1;
        }
        System.out.println(cnt);
    }

}
