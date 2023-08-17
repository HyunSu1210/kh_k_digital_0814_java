package 행사안내메일;

import java.util.Scanner;

public class letter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("제목 : ");
        String title = sc.next();
        System.out.print("일시 (예시 : 20230817) : ");
        String date = sc.next();
        System.out.print("시간 : ");
        int time = sc.nextInt();

        String year = date.substring(0,4);
        String month = date.substring(4,6);
        String day = date.substring(6,8);
        String season = "";

        switch (month) {
            case "12" :
            case "01" :
            case "02" : season = "한파의 연속입니다.";break;
            case "03" : season = "봄의 기운이 느껴지는 3월 입니다.";break;
            case "04" : season = "새싹이 피어나는 4월 입니다.";break;
            case "05" : season = "계절의 여왕 5월 입니다.";break;
            case "06" : season = "활동하기 좋은 6월 입니다.";break;
            case "07" : season = "휴가가 기다려지는 7월 입니다.";break;
            case "08" : season = "무더운 8월 입니다.";break;
            case "09" : season = "선선한 9월 입니다.";break;
            case "10" : season = "천고마비의 계절 10월 입니다.";break;
            case "11" : season = "쓸쓸한 늦가을 11월 입니다.";break;
            default: season = "잘못된 정보입니다.";

        }
        System.out.println(name + "님.\n" + season + "\n아래와 일정으로 " + title + "를 진행하고자 하오니 오셔서 자리를 빛내주시기 바랍니다.");
        System.out.println("\n===== 행사 안내 =====");
        System.out.println("행사 안내 : " + title);
        System.out.println("일시 : " + year + "년" + month + "월" + day + "일");
        System.out.println("시간 : " + time + "시");
    }
}
