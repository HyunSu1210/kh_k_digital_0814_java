package 단어정렬;
// 알파벳 소문자로 이루어진 N개의 단어 입력. 정렬하기
// 1. 길이가 짧은 것부터
// 2. 길이가 같으면 사전 순으로
// 3. 중복 제거

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class WordSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N의 개수 입력 받기
        String[] word = new String[n];
        for(int i = 0; i < word.length; i++) {
            word[i] = sc.next();
        }
        // 입력받은 문자열 배열의 중복 제거를 위해 set 컬렉션에 넣음
        HashSet<String> set = new HashSet<>(Arrays.asList(word));
        // 다시 배열로 되돌림, 원래 생성된 크기만큼 되돌림
        word = set.toArray(new String[0]);
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 사전 순 정렬
                } else {
                    return o1.length() - o2.length(); // 만약 앞이 길면 양수
                }
            }
        });
        System.out.println(Arrays.toString(word));
    }
}
