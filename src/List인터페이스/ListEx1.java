package List인터페이스;
// 리스트 인터페이스는 ArrayList, Linked List, Vector의 부모로 인터페이스로 구성되어 있음
// 리스트 구조는 배열과 유사하고 동적으로 크기가 변한다는 차이점이 있음

// ArrayList, Linked List, Vector 거의 동일한 메소드를 가지고 있어 코드 변환이 자유로움
// ArrayList : 리스트 타입의 대표적인 자료 구조 (특별한 경우가 아니면 ArrayList 사용)
// - 검색이 빈번한 경우 효율적이며, 맨 뒤에 입력이 일어나는 경우에는 효과적임

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListEx1 {
    public static void main(String[] args) {
        String[] arr = {"1000", "2000", "3000", "10", "999"};
        // 배열을 리스트에 넣기 : Arrays.asList()
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
//        list.add("100");// add(10) : List에 값을 추가
//        list.add("200");
//        list.add("300");
        list.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(list);
        list.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(list);
        System.out.println(list.get(0));
        // 특정 위치에 값을 가져올 때 : get(index)
        System.out.println(list.get(2));
        // List의 크기를 가져 올 때 : size()
        System.out.println(list.size());
        // List 내에 해당하는 항목이 있는지 판별 : contains()
        System.out.println(list.contains("100"));
        // List에서 객체에 해당하는 항목을 삭제하고 결과를 반환 : remove()
        // remove() : 객체, 인덱스 둘다 가능
        System.out.println(list.remove("100"));
        System.out.println(list.remove(1));


        System.out.println(list);
    }
}
