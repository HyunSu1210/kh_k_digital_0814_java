package 중복없는로또번호;
// 1 ~ 45 사이의 임의의 수 6개를 생성해야 함 (입력은 받지 않음, Math.random() => 0.1 ~ 0.999
// int val = (int) ((Math.random() * 45) + 1);
// 단 중복 제거
// 생성된 val 값을 배열에 담을 때 배열 내에 해당하는 값이 있는지 확인 필요
// 배열은 6개
// 반복 횟수 정할 수 없음 (while(true) ==> 탈출 조건이 있어야 함 (중복되지 않는 번호 6개가 저장될 때))

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RandomLotto {
    public static void main(String[] args) {
        int[] lotto = new int[6]; // 6자리 배열
//        boolean isExist = false;
//        int tmp, index = 0; // 임시 로또 번호
//        while(true) {
//            tmp = (int) ((Math.random() * 45) + 1);
//            for(int i = 0; i < lotto.length; i++) {
//                if(lotto[i] == tmp) {
//                    isExist = true;
//                }
//            }
//            if(!isExist) lotto[index++] = tmp;
//            if(index == 6) break;
//            isExist = false;
//        }
//        for(int e : lotto) System.out.print(e + " ");

        // ArrayList
//        List<Integer> list = new ArrayList<>();
//        int tmp = 0;
//        while(true) {
//            tmp = (int) ((Math.random() * 45) + 1);
//            if(!list.contains(tmp)) {
//                list.add(tmp);
//            }
//            if(list.size() == 6) break;
//        }
//        System.out.println(list);

        // Set : 자바에서 사용 집합 개념
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int tmp = (int) ((Math.random() * 45) + 1);
            set.add(tmp);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }
}
