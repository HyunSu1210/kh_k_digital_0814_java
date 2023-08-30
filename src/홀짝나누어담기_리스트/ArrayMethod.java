package 홀짝나누어담기_리스트;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayMethod {
    public static void main(String[] args) {
//        OddEvenFunc oe = new OddEvenFunc();
//        oe.Input();
//        oe.oddEven();
//        oe.Output();
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("정수 입력 : ");
        for(int i = 0; i< 7; i++) list.add(sc.nextInt());
        System.out.print("홀수 : ");
        list.stream().filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream().filter(n->n % 2 == 0).forEach(e->System.out.print(e + " "));

    }
}

class OddEvenFunc {
    List<Integer> input = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    public void Input() { // 정수 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("7개의 정수를 입력 : ");
        for (int i = 0; i < 7; i++) {
            input.add(sc.nextInt());
        }
    }

    public void oddEven() { // 홀짝 나누기
        for(Integer e : input) {
            if (e % 2 == 0) even.add(e);
            else odd.add(e);
        }
    }

    public void Output() {
        System.out.print("홀수 : ");
        for (Integer e : odd) System.out.print(e + " ");
        System.out.print("짝수 : ");
        for (Integer e : even) System.out.print(e + " ");
    }

}