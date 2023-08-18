package 스퀘어출력;
// input : 3;
// Output

import java.util.Scanner;

public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n*n; i++) {
            System.out.printf("%3d", i);
            if (i % n == 0) System.out.println();
        }
    }
}
