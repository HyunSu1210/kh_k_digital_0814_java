package 다운캐스팅;

import java.util.ArrayList;
import java.util.List;

public class DownCasting {
    List<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
    }
    public void addAnimal() {
        aniList.add(new Animal());
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        aniList.add(new Human());
        for(Animal ani : aniList) {
            ani.move();
        }
    }
    public void testCasting() {
        for(int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i); // 업캐스팅
            if(ani instanceof Human) { // Human 형으로 다운캐스팅 가능한 지 확인
                Human h = (Human) ani;
                h.readBook(); // 원래 자신의 클래스에 대한 참조 변수이기 때문에 접근 가능함
            }
        }
    }
}
