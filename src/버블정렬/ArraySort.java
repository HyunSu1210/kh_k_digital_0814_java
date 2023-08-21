package 버블정렬;
// 1차원 배열을 이용한 기본 정렬 (버블정렬 / 삽입정렬)
// 사용 예시의 버블정렬은 일반적인 방법과 약간 차이가 있음

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9,4,3,10,5,8,7,6,2,1};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int i : arr) System.out.print(i + " ");
    }
}
