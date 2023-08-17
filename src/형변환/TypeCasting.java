package 형변환;
// 형 변환이란 : 하나의 데이터 타입을 다른 타입으로 변환하는 것
// 명시적 형변환 : 개발자가 의도를 가지고 형 변환을 하는 것
// 묵시적 형변환 : 컴파일러가 자동으로 해주는 것 (유리한 방향으로 변경)

public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double result1 = num1 / num2;
        double result2 = (double) num1 / num2; //명시적 , 묵시적 형변환이 일어남
        String kor = "90";
        int intKor = Integer.parseInt(kor); //문자열을 숫자로 변환하는 메소드
        int mat = 88;
        int eng = 55;
        int total = intKor + mat + eng; //총점
        double avg = (double)total / 3;

        System.out.println(avg);
    }
}
