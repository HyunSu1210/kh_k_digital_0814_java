package 스레드예제2;

// 다른 스레드의 종료를 기다림(Join())

public class ThMainEx2 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(); // sumThread가 작업을 완료할 때까지 기다림
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;

    @Override
    public void run() {
        for(int i = 0; i <= 100; i++)
            sum += 1;
    }
    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}