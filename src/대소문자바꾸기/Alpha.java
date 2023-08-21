package 대소문자바꾸기;

import java.util.Scanner;

//
public class Alpha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch < 'a') System.out.print((char) (ch + ('a' - 'A')));
            else System.out.print((char) (ch - ('a' - 'A')));
        }
    }
}
