package 스레드예제3;
// 스레드 간의 협업 : wait(), nothfy(), notifyAll()
// notify() : 일시 정지 상태에 있는 스레드를 실행 대기 상태로 변경

public class ThMainEx3 {
    public static void main(String[] args) {
        WorkObject shareObject = new WorkObject(); // 객체 생성
        Thread threadA = new ThreadA(shareObject);
        Thread threadB = new ThreadB(shareObject);
        threadA.start();
        threadB.start();
    }
}

class WorkObject {
    // synchronized : 멀티스레드 환경에서 임계영역에 접근을 방지하는 역할(Lock, Unlock)
    public synchronized void methodA() {
        System.out.println("Thread의 methodA()  작업 실행");
        notify(); // 일시 정지 상태에 있는 스레드 깨움
        try {
            wait();
        } catch (InterruptedException e) {
        }
    }

    public synchronized void methodB() {
        System.out.println("Thread의 methodB()  작업 실행");
        notify(); // 일시 정지 상태에 있는 스레드 깨움
        try {
            wait();
        } catch (InterruptedException e) {
        }
    }
}

class ThreadA extends Thread {
    final private WorkObject workObject; // 참조 변수, 선언만 하고 객체 생성은 안 함?

    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}

class ThreadB extends Thread {
    final private WorkObject workObject2; // 참조 변수, 선언만 하고 객체 생성은 안 함?

    public ThreadB(WorkObject workObject) {
        this.workObject2 = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject2.methodB();
        }
    }
}