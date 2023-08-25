package 인터페이스기본;

public interface NetworkAdaptor {
    void connect(); // 자동으로 public abstract 포함됨
}
// 유선 인터넷
class LAN implements NetworkAdaptor {
    String company;
    LAN(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " LAN에 연결 되었습니다.");
    }
}

class WiFi implements NetworkAdaptor {
    String company;
    WiFi(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결 되었습니다.");

    }
}

class FiveG implements NetworkAdaptor {
    String company;
    FiveG(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " FiveG에 연결 되었습니다.");

    }
}
