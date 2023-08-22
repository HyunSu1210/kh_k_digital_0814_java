package 핸드폰요금;
// 영식 요금제 : 30초당 10원 (30초 미만
// 민식 요금제 : 60초당 15원 (50초 미만
// 첫번째 줄에 통화의 횟수, 두번째 줄에 통화당 통화 시간(초)
// 출력은 싼 요금제를 출력 영식 요금제는 Y, 민식 요금제는 M
// 총 통화 요금이 같은 경우는 YM 총 통화요금 표시

import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yPay = 0, mPay = 0;
        int call = sc.nextInt(); // 첫번째 줄 : 통화 횟수
        int[] callTime = new int[20]; // 두번째 줄 : 통화당 통화 시간
        for (int i = 0; i < call; i++) { // 통화 횟수 당 통화 시간을 입력 받음
            callTime[i] = sc.nextInt();
        }

        for (int j = 0; j < call; j++) {
            yPay += (callTime[j] / 30) * 10 + 10;
            mPay += (callTime[j] / 60) * 15 + 15;
        }

        if (yPay > mPay) {
            System.out.println("M " + mPay);
        } else if (yPay < mPay) {
            System.out.println("Y " + yPay);
        } else System.out.println("YM " + (yPay + mPay));
    }

}
