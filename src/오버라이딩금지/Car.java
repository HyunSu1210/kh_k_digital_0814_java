package 오버라이딩금지;

// @Override 문법적으로 오버라이딩 하는지 검사. 아니면 오류남
public class Car {
    int speed;
    String color;
    String name;

    final void accelerator() { // 오버라이딩 금지
        System.out.println("차의 속도를 증가시킵니다.");
    }

    final void breakPanel() { // 오버라이딩 금지
        System.out.println("차의 속도를 감소시킵니다.");
    }
}

class SportCar extends Car {
    boolean isTurbo;

    SportCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";
    }

    int getSpeed() {
        if (isTurbo) return speed *= 1.2;
        return speed;
    }

    public boolean isTurbo() {
        return isTurbo;
    }

    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("컬러 : " + color);
        System.out.println("터보모드 : " + isTurbo);

    }
}

class ElectricCar extends Car {
    boolean isAutoDrv;

    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }

    public boolean isAutoDrv() {
        return isAutoDrv;
    }

    public void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }

    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);

    }

}
