package 배열의복사;

import java.util.Arrays;

// 자바의 배열은 한번 선언하면 크기를 변경할 수 없음
// 배열의 크기를 변경하기 위해서는 더 큰 배열을 만들고 기존 배열의 데이터를 옮겨 담아야 함
// arraycopy() :
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
//        int newLen = 10;
//        int[] arr2 = new int[newLen];
//        System.arraycopy(arr1, 0, arr2, 4, arr1.length);
//        for(int e : arr2) System.out.print(e + " ");
        int[] arr3 = Arrays.copyOf(arr1, 10);
        for(int e : arr3) System.out.print(e + " ");
    }
}
