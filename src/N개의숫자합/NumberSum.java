package N개의숫자합;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        String number = sc.next();
        int sum = 0;
        for(int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
