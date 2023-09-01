package 스택연습문제;


import java.util.Scanner;
import java.util.Stack;

// 스택을 이용해서 열림 괄호 닫힘 괄호 체크하기
public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        // 입력 받은 문자열 길이만큼 반복 순회
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') { // 열림 괄호일 때 push
                st.push(ch); // 오토박싱
            } else if (ch == ')') { // 닫힘 괄호일 때 pop
                if(!st.empty()) st.pop();
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;
                }
            }
        }
        if(st.empty()) {
            System.out.println("괄호가 일치합니다.");
        } else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
