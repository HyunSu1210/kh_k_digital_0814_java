package 추상클래스1;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
        cat.sleep();

        Dog dog = new Dog();
        dog.cry();
        dog.sleep();

        // 추상클래스의 참조 변수로 상속 객체를 접근. 자주 쓰이는 문법
        AnimalClass animal = new Cat();
        animal.sleep();
    }
}

