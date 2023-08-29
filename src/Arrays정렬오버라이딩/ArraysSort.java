package Arrays정렬오버라이딩;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
    public static void main(String[] args) {
        // 길이 순으로 정렬, 길이가 같으면 사전 순으로 정렬.
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                else {
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 비교 대상의 객체가 작으면 음수 반환, 크면 양수 반환, 같으면 0 반환
                    }
                    return -1; // 현재 상태 유지
                }
            }
        });
        System.out.println(Arrays.toString(fruit));
    }
}
