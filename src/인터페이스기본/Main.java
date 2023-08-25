package 인터페이스기본;

import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

public class Main {
    public static void main(String[] args) {
        NetworkAdaptor adaptor; // 추상화가 되어있는 인터페이스
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크 [1]LAN [2]WiFi [3]FiveG : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1:
                adaptor = new LAN("KT Megapass");
                adaptor.connect();
                break;
            case 2:
                adaptor = new WiFi("SK Telecom");
                adaptor.connect();
                break;
            case 3:
                adaptor = new FiveG("LG U+");
                adaptor.connect();
                break;
            default:
                System.out.println("선택한 네트워크가 없습니다.");
        }
    }
}
