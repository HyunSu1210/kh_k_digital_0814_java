package 배열기본;
// 자바의 배열은 동일한 데이터 요소들을 연속적으로 저장하는 자료 구조
// 인덱스를 사용해서 각 요소를 접근할 수 있습니다. (인덱스 0부터 시작합니다.)
// 배열은 크기를 먼저 지정해야 합니다.
// 타입[] 배열이름 = new 타입[배열길이];

public class ArrayBasic {
    public static void main(String[] args) {
        int[] grade1 = new int[3]; // 힙 영역에서 정수 3개를 저장할 메모리 할당
        grade1[0] = 85;
        grade1[1] = 99;
        grade1[2] = 77;

////        for (int i = 0; i < grade1.length; i++) {
//            System.out.println(grade1[i] + " ");
//        }
//
//        // 주어진 배열 등의 크기를 자동 순회함
//        for(int e : grade1) {
//            System.out.println(e + " ");
//        }
//        int[] odd = {1,3,5,7,9}; // 이미 정해진 값을 배열 대입하는 경우는 크기
//        String[] weeks = {"월" , "화", "수", "목", "금", "토", "일"};

        int[] grade2 = {88, 99, 56};
        int[] grade3 = new int[]{99, 88, 88};
        int[] grade4; // 객체 타입의 참조 변수이므로 실제 객체의 주소를 받아야 함
        grade4 = new int[4];
        grade4[0] = 100;
        grade4[1] = 88;
        grade4[2] = 77;
        grade4[3] = 55;

//        for (int e : grade4) {
//            System.out.println(e + " ");
//        }
        int sum = 0; // 총점을 구하기 위한 변수
        for (int e : grade4) sum += e; // 총점 구하기
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double)sum/grade4.length);
    }
}

