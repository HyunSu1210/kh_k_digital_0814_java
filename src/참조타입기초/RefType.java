package 참조타입기초;
// 자바의 데이터 타입은 기본 타입과 참조 타입으로 나누어진다.
// 기본 타입은 정수, 실수, 문자, 논리값 등을 저장하는 타입입니다. (실제 값이 변수에 저장됨)
// 참조 타입은 객체의 주소를 저장합니다. (배열, 열거형, 인터페이스, 클래스, 문자열)
public class RefType {
    public static void main(String[] args) {
        int age = 25; // int 형으로 만들어진 age라는 변수에 25라는 값을 저장
        double price = 100.5; // double 형으로 만들어진 price 변수에 100.5라는 값을 저장
        // 참조 타입 예제
        String name = "곰돌이사육사"; // String 형으로 만들어진 name에는 실제 "곰돌이사육사"라는 문자열이 없고, 주소가 있음
       // int unbox = null; // int 형의 기본 타입이므로 값을 대입해야 함
//        Integer boxedValue = null; //int 형에 대한 참조 타입
//        int intValue = boxedValue;
//        System.out.println(intValue);

        String strVal1 = "나희도"; //리터럴 상수로 고정됨
        String strVal2 = "나희도";
        String strVal3 = new String("나희도"); //heap 영역에 메모리 공간을 확보함

        // 참조 변수에서 ==, != (주소가 같은지를 물어보게 됨)

        if(strVal1 == strVal2) {
            System.out.println("strVal1과 strVal2는 참조하는 주소가 같음");
        } else {
            System.out.println("strVal1과 strVal3는 참조하는 주소가 다름");
        }

        if(strVal1.equals(strVal3)) { // 내용(변수의 값)을 비교하려면 equals()를 사용해야 함
            System.out.println("strval1과 strVal3의 내용이 같음");
        }
    }
}
