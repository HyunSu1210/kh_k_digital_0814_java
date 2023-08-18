package 알람일찍울리기;

import java.util.Scanner;

public class AlarmEx1 {
    public static void main(String[] args) {
        // 시간과 분을 입력받기 위한 스캐너 생성
        // 시간과 분을 각각 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 (시) : ");
        int hour = sc.nextInt();
        System.out.print("시간을 입력하세요 (분) : ");
        int minute = sc.nextInt();
        int sum = hour * 60 + minute; // 총 합계 분에서 45분 빼기

        if (sum < 45) {
            sum = (24 * 60) + minute;
        }

        sum -= 45;

            System.out.println("알람이 울리는 시간 : " + (sum / 60) + "시 " + (minute % 60) + "분");


    }
}
