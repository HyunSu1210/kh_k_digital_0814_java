package 정적멤버와메소드;
// 메소드영역 정적할당 / 힙영역 동적할당
public class Bank {
    private static int count = 0; // 정적 필드, 객체로 생성 안 됨, 컴파일 될 때 생성
    private int account; // 계좌
    private String bank; // 은행이름

    Bank(String name, int account) {
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(bank + " 은행에 계좌를 개설합니다. 잔액은 " + this.account + "입니다.");
    }

    public static int getCount() { // 정적 메소드, 객체화x,
        return count;
    }

    public void setDeposit(final int dep) {
        this.account += dep;
        System.out.println(dep + "을 예금했습니다.");
    }

    public void setWithDraw(final int with) {
        if(with > account) {
            System.out.println("잔액이 부족합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 " + account + "입니다.");
    }
}
