package 상근날드;

import java.util.Scanner;

public class Macnal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] price = new int[5]; //5개 입력받음
        System.out.print("메뉴 입력 : ");
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }
        int burgerMin = price[0];
        int colaMin = price[3];
        for (int j = 1; j < 3; j++) {
            if (burgerMin > price[j]) {
                burgerMin = price[j];
            }
        }
        if (colaMin > price[4]) colaMin = price[4];

        System.out.println(burgerMin + colaMin - 50);

    }
}
