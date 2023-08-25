package 저항값구하기;

import java.util.Scanner;

// 색 3개를 이용, 처음 2개는 저항의 값, 마지막 1개는 곱해야 하는 값.
// 값은 배열 인덱스 번호, 곲은 10의 인덱스 번호 제곱
// 배열에서 입력받은 값에 해당하는 인덱스 번호를 알아내야 함.

public class OhmMainEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int fInt = 0, sInt = 0, tInt = 0;
        String first = sc.next(); // 첫번째 저항값
        String second = sc.next(); // 두번째 저항값
        String third = sc.next(); // 세번째 저항값
        for (int i = 0; i < 10; i++) {
            if (first.equals(color[i])) fInt = i;
            if (second.equals(color[i])) sInt = i;
            if (third.equals(color[i])) tInt = i;
        }
        //((fInt*10)+sInt)*(Math.pow(10,tInt))
        System.out.println((long) ((fInt * 10) + sInt) * (long) (Math.pow(10, tInt)));
    }
}
