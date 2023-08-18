package 문자열반전;
// 문자열을 입력 받음 : abcd -> dcba
//마지막 문자를
import java.util.Scanner;

public class CharaterReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine(); // 문자열 입력받음
        int pos = str.length()-1;

        while (pos > -1) {
            System.out.print(str.charAt(pos));
            pos--;
        }

//        for(int i = str.length()-1; i>=0; i--) {
//            System.out.print(str.charAt(i));
//        }
//        System.out.println();
    }
}
