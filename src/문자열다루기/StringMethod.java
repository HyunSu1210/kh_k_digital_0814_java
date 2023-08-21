package 문자열다루기;
// 자바는 문자열을 나타내는 자료형은 String이며, 참조 타입 자료형임
// equals : 두개의 문자열이 동일한지 비교하여 결과값을 리턴함
// indexOf : 문자열에서 특정 문자가 시작되는 인덱스를 반환
// contains : 문자열에서 특정 문자열 포함되어 있는지 여부확인
// charAt() : 문자열에서 특정 위치의 문자를 반환
// replaceAll : 문자열에서 특정 문자열을 다른 문자열로 변경
// substring : 문자열 중 특정 부분을 뽑아 낼 때 사용
// toUpperCase / toLowerCase : 문자열 전부를 대문자 / 소문자 변경하는 메소드
// trim : 문자열 앞뒤의 공백을 없앰
// split : 문자열을 특정 구분자로 분리하는 메소드
// toCharArray() : 문자열을 문자 배열로 변환

public class StringMethod {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";
        String c = "hello";
        String d = new String("hello");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c)); //문자열을 비교할 때 대소문자 구분 안 함
        System.out.println(a.indexOf("l"));

        System.out.println(b.contains("java"));
        System.out.println(b.charAt(4));
        String e = "Hello Java";
        System.out.println(e.replaceAll("Java","Python"));
        System.out.println(e.substring(4,7));
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
        String oldStr = "        자바 프로그래밍   ";
        System.out.println(oldStr.trim());
        String time = "10:23:45";
        String[] modifyTime = time.split(":");
        for(String ee : modifyTime) System.out.print(ee + " ");
        System.out.println();

        // 문자열 포맷팅을 출력을 위해서 사용
        System.out.printf("I eat %d apples\n",3);

        System.out.println(String.format("I eat %d apples",3));

        String testName = "James";
        char[] chName = testName.toCharArray();
        for(char eee : chName) System.out.print(eee + " ");
    }
}
