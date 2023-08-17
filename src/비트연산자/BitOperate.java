package 비트연산자;
// 비트 연산자는 비트 단위의 연산을 수행합니다.
// AND : & 비교하는 두개의 비트가 모두 1이어야 1
// OR : | 비교하는 두개의 비트가 한쪽만 1이면 1
// XOR : ^ 비교하는 두개의 비트가 서로 다른 경우 1
// NOT : ~ 현재 비트의 값을 반전시킴
// 왼쪽 시프트 : << 비트를 왼쪽으로 이동
// 오른쪽 시프트 : >> 비트를 오른쪽으로 이동
//...
public class BitOperate {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 12;
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
        System.out.println(num1 << 1); // 값*2
        System.out.println(num1 >> 1); // 값/2
    }
}
