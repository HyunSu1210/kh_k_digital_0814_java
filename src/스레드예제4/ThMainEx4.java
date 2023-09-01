package 스레드예제4;
// 스레드를 안전하게 종료하기, stop() 메소드는 사용 중지됨

import static java.lang.Thread.sleep;

public class ThMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            runThread.interrupt();
        }

    }
}

class RunThread extends Thread {
    //    private boolean stop = false;
//
//    public void setStop(boolean stop) {
//        this.stop = stop;
//    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread를 실행 중.......");
                sleep(1); // 잠을 자야 인터럽트 발생
            }
        } catch (InterruptedException e) {
            System.out.println("인터럽트 발생");
        }

        System.out.println("자원 정리 중........");
        System.out.println("실행 종료........");
    }
}
