package 상수와리터럴;
import java.util.Scanner; // 스캐너를 사용하기 위해 import 해야 함

// 상수 : 변수와 마찬가지로 메모리에 저장할 공간을 확보하는 것, 단 한번만 값을 지정할 수 있음
// 값을 한번 쓰고 나면 read only 상태가 됨
// final 키워드를 사용
// 상수는 관례상 대문자 사용, 자바는 선언과 별도로 단 한번 값의 대입이 가능
// static 정적 변수라서 컴파일 할 때 단 한번만 만들어진다는 의미
// final은 한번만 만들고 중복되면 안 됨, 그래서 static과 같이 씀

public class ConstClass {
    final static String KH_DOMAIN = "http://192.167.12.13";
    final static String PORT_NUM = "8111";
    public static void main(String[] args) {
        final double TAX_RATE = 0.10; // 세율 값을 고정함
//        Scanner sc = new Scanner(System.in); // 표준 입력을 받기 위해 사용
//        System.out.print("수입을 입력하세요 : ");
//        int income = sc.nextInt();
//        System.out.println("당신이 내야 할 세금은 " + (income * TAX_RATE) + "입니다.");

        System.out.println(KH_DOMAIN);
        System.out.println(PORT_NUM);

    }
}
