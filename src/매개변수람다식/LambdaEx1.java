package 매개변수람다식;

@FunctionalInterface // 함수형 프로그램을 만들기 위한 어노테이션, 내부에 함수가 하나만 존재해야 함
interface MyFuncInterface {
//    void method(int x);
    int min(int x, int y);
}

@FunctionalInterface
interface  MyFuncInterface2 {
    int min(int x, int y);
}

public class LambdaEx1 {
    public static void main(String[] args) {
//        MyFuncInterface fi = x -> { // 매개변수가 한개인 경우에는 () 생략
//            int result = x * 5;
//            System.out.println(result);
//        };
//        fi.method(10);
        MyFuncInterface2 fi2 = (x, y) -> x < y ? x : y; // 구현부가 한줄인 경우 {} 생략 가능
        System.out.println(fi2.min(3,4));
    }
}
