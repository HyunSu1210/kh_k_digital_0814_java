package 소수의합구하기;

import java.util.Scanner;

// 입력 받은 정수보다 미만의 소수의 합을 구하는 함수를 만드세요.
// 예) 12이면 2+3+5+7+11 = 28
// 소수란 1과 자기 자신 이외의 자연수로 나누어지지 않는 수
public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 2; i < n; i++) {
            sum += prime(i);
        }
        System.out.println(sum);
//        Sum sum = new Sum();
//        sum.sum1(num);
    }
    static int prime(int n) { // 입력받은 값이 소수인지 아닌지 판단
        boolean isPrime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
    }
}
