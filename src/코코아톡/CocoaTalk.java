package 코코아톡;

public class CocoaTalk {
    private String to;
    private String msg;
    public CocoaTalk(String name) {
        to = name;
    }
    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send(NetAdapter na) {
        na.send(msg);
    }
}
