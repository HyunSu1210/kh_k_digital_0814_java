package 별찍기;

import java.util.Scanner;

// 삼각형 별찍기
// 입력받은 수만큼 별찍기
// 5를 입력하면
public class StarEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별의 갯수 입력 : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
