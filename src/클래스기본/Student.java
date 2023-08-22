package 클래스기본;

public class Student {
    // 각각 인스턴스 필드라고 부름
    // private 외부에서 해당 필드에 접근할 수 없음
    private int id; // 학번
    private String name; // 이름
    private int grade; // 학년
    private String addr; // 주소

    public void showInfo() {
        System.out.println(name + ", " + addr);
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
