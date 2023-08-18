package 두개의주사위;

public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0; //몇번만에 탈출했는지
        while(true) {
            cnt++;
            rand1 = (int) ((Math.random() * 6) + 1); //랜덤값은 실수
            rand2 = (int) ((Math.random() * 6) + 1); //0.1~5.99 + 1 결국 1~6 정수가 대입
            if((rand1 + rand2) == 12) {
                System.out.printf("무인도를 %d번 만에 탈출했습니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }

        }
    }
}
