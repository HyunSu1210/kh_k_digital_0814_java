package 다중인터페이스;

public interface AirCon { // 자동으로 상수와 추상 메소드 만듦
    int MAX_TEMP = 30; // public static final - 상수
    int MIN_TEMP = 0;
    void airConON(); // public abstract - 추상 메소드
    void airConOFF();
    void setAirConTemp(int tmp);

}
