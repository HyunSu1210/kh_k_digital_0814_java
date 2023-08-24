package 상속TV;

public class PrototypeTV {
    boolean isPower;
    int channel;
    int volume;
    public PrototypeTV() {
        this.isPower = false; // this는 클래스의 변수가 아닌 객체의 참조 변수
        this.channel = 10;
        this.volume = 10;
    }
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 1000) {
            channel = cnl;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
