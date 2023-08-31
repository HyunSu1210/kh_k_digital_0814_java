package 해시셋객체비교;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001, "유나");
        Member member2 = new Member(1002, "채원");
        Member member3 = new Member(1003, "지수");
        Member member4 = (new Member(1003, "카리나"));
        // 인스턴스 주소가 달라서 hashcode가 다름
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);
        // 객체 보고 판단하기 때문에 값이 1003으로 같아도 괜찮음
       // hashSet.add(new Member(1003, "카리나"));
        for(Member e : hashSet) e.showMember();
    }
}

class Member {
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) { // 다운캐스팅 성립하는지 확인하기 위한 조건
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}
