package 스레드예제1;
// 하나의 프로그램내에서 여러가지 일을 동시에 수행하는 것

public class ThMainEx1 {
    public static void main(String[] args) {
        // Thread 클래스를 상속받아서 Thread 생성
        Thread testTh = new CustomThread();
        testTh.start(); // 운영체제에게 요청
        System.out.println("Main에서 출력");

        // 실제 작업 내용을 가지고 있지만 실제 스레드는 아님
        Runnable runTask = new InterThread();
        Thread runTh1 = new Thread(runTask);
        Thread runTh2 = new Thread(runTask);
        runTh1.start();
        runTh2.start();

        // 익명 객체로 스레드 만드는 방법
        // 인터페이스는 추상화 걸려 있어서 구현부를 만들어줘야 함
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i <= 10; i++) {
                    sum += i;
                    System.out.println("익명 객체 sum" + sum);
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);
            }
        };
        Thread anonyTh1 = new Thread(task);
        anonyTh1.start();

        // 람다식으로 구현하기
        Runnable task2 = () -> {
            int sum = 0;
            for(int i = 0; i <= 10; i++) {
                sum += i;
                System.out.println("익명 객체 sum" + sum);
            }
            System.out.println(Thread.currentThread() + "합 : " + sum);
        };
        Thread anonyTh2 = new Thread(task2);
        anonyTh2.start();
    }
}

// Thread 클래스 상속 받는 방법
class CustomThread extends Thread {
    @Override
    public void run() { // Thread 동작 구간
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속받은 스레드에 sum" + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}

// Runnable 인터페이스를 이용한 방법
class InterThread implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("인터페이스에 sum" + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);

    }
}
