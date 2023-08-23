package 영화표예매;

import java.util.Scanner;

// 간단한 영화표 예매 시스템
// 사용자가 극장의 좌석 선택, 판매는 좌석의 갯수만큼 판매 금액을 계산
// 1. 예매하기와 종료하기 메뉴 만들기 (종료하기 선택 시 총 판매 금액을 계산함)
// 2. 극장의 좌석은 10개
// 3. 각 좌석당 금액은 12000원
public class MovieMain {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(12000); // 기본 생성자 자동 호출
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            int selMenu = sc.nextInt();
            if(selMenu == 1 ) movieTicket.selectSeat();
            else {
                System.out.println(movieTicket.totalAmount());
                break;
            }
        }
    }
}
