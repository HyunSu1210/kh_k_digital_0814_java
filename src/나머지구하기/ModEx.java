package 나머지구하기;
// 10개의 수를 입력받은 뒤, 이를 42로 나눈 나머지를 구함
// 나머지를 구한 다음 서로 다른 값이 몇개인지 구하는 문제

import java.util.Scanner;

public class ModEx {
    public static void main(String[] args) {
        int[] arr = new int[42];
        int c = 0; // 서로 다른 값 카운트
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("10개의 수 입력 : ");
        for(int i = 0; i < 10; i++) { // 수 입력 받기
            input = sc.nextInt(); // 수 입력 받기 10개
            arr[input % 42] = 1; // 입력받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
        }
        for(int val : arr) c+= val;
        System.out.println(c);
    }
}
