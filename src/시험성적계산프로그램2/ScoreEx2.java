package 시험성적계산프로그램2;

import java.util.Scanner;

public class ScoreEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("성적을 입력 하세요 : ");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                if (score >= 90) {
                    System.out.println("A");
                    break;
                } else if (score >= 80) {
                    System.out.println("B");
                    break;
                } else if (score >= 70) {
                    System.out.println("C");
                    break;
                } else if (score >= 60) {
                    System.out.println("D");
                    break;
                } else {
                    System.out.println("F");
                    break;
                }
            } else {
                System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }
}
