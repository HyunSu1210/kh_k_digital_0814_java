package 디폴트메소드;

public class Audio implements RemoteControl {
    private int volume;
    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int vol) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
    void getInfo() {
        System.out.println("오디오입니다.");
        System.out.println("현재 Audio 볼륨은" + volume + "입니다.");
    }
    @Override
    public void setMute(boolean mute) { // 접근제한자 메소드명 반환타입 모두 같아야 오버라이딩 가능
        if(mute) System.out.println("오디오를 무음 처리합니다.");
        else System.out.println("오디오를 무음 처리를 해제합니다.");
    }
}
