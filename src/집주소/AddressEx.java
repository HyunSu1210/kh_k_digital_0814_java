package 집주소;
// 해당 숫자가 몇칸을 차지하는 지 출력하는 문제
// 앞뒤 공백 총 2칸
// 숫자 사이 공백 1칸씩
// 1은 2칸 0은 4칸 나머지는 3칸
// 0이면 종료

import java.util.Scanner;

public class AddressEx {
    public static void main(String[] args) {
        // 각 숫자가 차지하는 자리수를 배열로 만듦
        int[] numSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        int sum = 0; // 입력 받은 수가 차지하는 총 자리수
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.next();
            if (number.equals("0")) break;
            for (int i = 0; i < number.length(); i++) {
                sum += numSize[number.charAt(i) - '0'] + 1;
            }
            System.out.println(sum + 1);
            sum = 0;
        }

    }
}
