package 디폴트메소드;

public interface RemoteControl {
    int MAX_VOLUME = 100; // 자동으로 final static 추가됨
    int MIN_VOLUME = 0;
    void turnON(); // 추상메소드. 자동으로 public abstract 추가됨
    void turnOFF();
    void setVolume(int v);
    // 디폴트 메소드는 JDK 8 이후에 추가됨
    default void setMute(boolean mute) { // 무조건 구현x, 선택적으로 바뀜.
        if(mute) System.out.println("무음 처리합니다.");
        else System.out.println("무음 해제합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지 교환합니다.");
    }

}

