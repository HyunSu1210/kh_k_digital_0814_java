package KMP;
// Knuth-Morris-Pratt => KMP
// Mirko-Slavko => MS
// split("-")를 이용해서 문자열을 자르고 자른 문자열의 0번째 인덱스를 선택하는 방법
// 첫번째 문자 선택, "-" 다음의 문자를 선택하는 방법
// 대문자만 골라냄 (charAt(인덱스),toCharArray())

import java.util.Scanner;

public class KMPEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // 1. charAt(인덱스)
//        for(int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') System.out.print(name.charAt(i));
//        }
        // 2. 첫번째 문자 선택, '-' 다음의 문자 선택
//        for(int i = 0; i < name.length(); i++) {
//            if(i == 0) System.out.print(name.charAt(i));
//            else {
////                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }
        // 3. split() 메소드를 이용
//        String[] splitName = name.split("-");
//        for(String e : splitName) {
//            System.out.print(e.charAt(0));
//        }
        // 4. toCharArray() : 문자열을 문자 배열로 변경
        char[] chName = name.toCharArray(); // 문자열 -> 문자 배열
        for(char ch : chName) {
            if(ch >= 'A' && ch <= 'Z') System.out.print(ch);
        }
    }
}
