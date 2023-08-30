package Vector클래스;
// ArrayList 구조와 메소드가 동일, 동기화가 지원되어서 멀티스레드 환경에 안전함.
// 하지만 ArrayList 대비 성능이 떨어짐

import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우","yyy@gmail.com","01011111111","변호사"));
        list.add(new NameCard("동그라미","ddd@gmail.com","01011111111","무직"));
        list.add(new NameCard("이준호","ljh@gmail.com","01011111111","회사원"));

        for(NameCard e : list) {
            System.out.println("이름 : " +e.name);
            System.out.println("메일 : " +e.mail);
            System.out.println("전화 : " +e.phone);
            System.out.println("직업 : " +e.jobs);
        }
    }
}

class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}
