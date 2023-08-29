package 다중인터페이스;

public class Car {
    protected int speed; // 같은 패키지 내의 클래스와 다른 패키지에 속하는 자식 클래스만 접근 가능
    protected String color;
    protected String year;
    public Car() {
        speed = 150;
        color = "white";
        year = "1999";
    }
}
