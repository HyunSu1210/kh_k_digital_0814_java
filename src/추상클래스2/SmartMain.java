package 추상클래스2;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 14");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        Phone phone = new Phone("목업") {

            void test() {
                System.out.println("목업폰이라 테스트도 안 돼요ㅠ,.ㅠ");
            }
            @Override
            void call() {
                System.out.println("목업폰이라 통화가 안 돼요ㅜㅡㅜ");
            }
        };
        phone.call();
    }
}
