package 스택기본;

import java.util.Stack;

// 스택 :
public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 맨 위의 값
        System.out.println(stack.pop()); // 맨 위의 값을 꺼내면서 출력
        System.out.println(stack.empty()); // 스택이 비어있는지 확인
        System.out.println(stack.size()); // 스택의 크기
        System.out.println(stack.contains(1)); // 해당 값이 포함되어 있는지 확인

    }
}
