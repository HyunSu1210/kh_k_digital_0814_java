package 예외처리5;

import java.io.IOException;

public class ExceptionEx5 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
        try {
            test.input();
        } catch (IOException e) {
            System.out.println("입력 에러 발생....");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}

class IOSample {
    private int num;
    public void input() throws IOException {
        num = System.in.read(); // 저수준 입력
    }
    public void output() {
        System.out.println(num);
    }
}
