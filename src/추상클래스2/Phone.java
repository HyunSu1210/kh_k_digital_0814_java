package 추상클래스2;
// Phone은 객체화 될 수 없음

public abstract class Phone { // 추상 클래스
    public String name;
    public boolean isPower;

    public Phone(String name) {
        this.name = name;
    }

    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if (isPower) System.out.println("Phone Power ON");
        else System.out.println("Phone Power OFF");
    }

    abstract void call(); // 추상 메소드. 상속받은 클래스가 구현해야 함
}

