package 다중인터페이스;
// 자바는 다중 상속을 지원하지 않음, 대신 인터페이스를 이용해서 다중 상속의 효과를 낼 수 있음

public class MultiInterface {
    public static void main(String[] args) {
        SportsCar ferrari = new SportsCar(false,18,false,250,"red","2023",false);
        ferrari.viewInfo();
    }
}
