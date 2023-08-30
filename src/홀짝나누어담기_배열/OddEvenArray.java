package 홀짝나누어담기_배열;

import java.util.Scanner;

// 7개 정수 입력받음
// 홀짝 배열로 나누어 담는 함수 만들기
// 홀짝 출력하는 함수 만들기
// 입력 : 1234567
// 홀수odd : 1357
// 짝수even : 246

public class OddEvenArray {
    public static void main(String[] args) {
        OddEven oe = new OddEven();
        oe.Input();
        oe.oddEven();
        oe.Output();
    }
}

class OddEven {
    int[] num = new int[7]; // 7개 정수 입력 받기
    int[] odd = new int[7]; // 홀수
    int[] even = new int[7]; // 짝수
    int a = 0, b = 0;

    public void Input() { // 정수 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("7개의 정수를 입력 : ");
        for (int i = 0; i < 7; i++) {
            num[i] = sc.nextInt();
        }
    }

    public void oddEven() { // 홀짝 나누기
        for (int i = 0; i < 7; i++) {
            if (num[i] % 2 == 0) { // 짝수인 경우
                even[a++] = num[i];
            } else { // 홀수인 경우
                odd[b++] = num[i];
            }
        }
    }

    public void Output() {
        System.out.print("홀수 : ");
        for (int e : odd) System.out.print(e + " ");
        System.out.print("짝수 : ");
        for (int e : even) System.out.print(e + " ");
    }
}
