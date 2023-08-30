package System클래스;

import static java.lang.Thread.sleep;

public class SystemClass {
    public static void main(String[] args) throws InterruptedException {

//        // UTC 1970년 1월 1일 00:00:00.000을 기준으로 현재 시간의 차이를 반환(1/1000초 단위)
//        long time = System.currentTimeMillis();
//
//        // 10억분의 1초를 의미 함(1/100,000,000)
//        long nanoTime = System.nanoTime();
//
//        System.out.println(time);
//        System.out.println(nanoTime);
        int [] data = new int[1000];
        int cnt = 0, i;
        int randVal = (int)(Math.random() * 1000) + 1;
        for(i = 0; i < data.length; i++) {
            data[i] = i+1;
        }
        long startTime = System.currentTimeMillis(); // 시작 시간
        for(i = 0; i < data.length; i++) {
            cnt++; // 몇번에 찾았는지 횟수 구하기
            sleep(1); // 1000분의 1초 동안 잠재우기
            if(randVal == data[i]) {
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간 : " + (endTime - startTime) + " 밀리초 입니다.");
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.home"));
    }

}
