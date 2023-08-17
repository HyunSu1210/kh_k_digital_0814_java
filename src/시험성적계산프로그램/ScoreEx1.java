package 시험성적계산프로그램;

import java.util.Scanner;

public class ScoreEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시험 성적을 입력하세요 : ");
        int score = sc.nextInt(); //성적 받기

        if (score >= 90 && score <= 100) {
            System.out.println("시험 성적은 A입니다.");
        } else if (score >= 80 && score <= 89) {
            System.out.println("시험 성적은 B입니다.");
        } else if (score >= 70 && score <= 79) {
            System.out.println("시험 성적은 C입니다.");
        } else if (score >= 60 && score <= 69) {
            System.out.println("시험 성적은 D입니다.");
        } else if (score >= 0 && score <= 59) {
            System.out.println("시험 성적은 F입니다.");
        } else
            System.out.println("성적이 잘못입력되었습니다.");
    }
}
