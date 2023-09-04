package 스트림예제1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        // 스트림을 생성(일회용), 중간연산, 최종연산
        //list.stream().filter(s-> s >= 5).forEach(e->System.out.println(e));
        int sunVal = list.stream().mapToInt(e->e).sum();
        System.out.println("합계 : " + sunVal);
    }
}
