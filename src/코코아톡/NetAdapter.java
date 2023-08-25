package 코코아톡;

public interface NetAdapter { // 인터페이스라 메소드 구현 안 함
    void connect();
    void send(String msg);
}

class WiFi implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("WiFi에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}

class FiveG implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("FiveG에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}