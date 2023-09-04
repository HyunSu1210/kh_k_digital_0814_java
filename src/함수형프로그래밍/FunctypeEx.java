package 함수형프로그래밍;
// 함수형 프로그래밍 : 자바 8에서 도입
// 자료 처리를 수학적 함수의 계산으로 취급하고 상태와 가변 데이터를 멀리하는 프로그래밍 패러다임

public class FunctypeEx {
    public static void main(String[] args) {
        System.out.println(add(100, 200));
    }

    static int add(int x, int y) {
        return x + y;
    }
}
