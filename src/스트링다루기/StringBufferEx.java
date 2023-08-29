package 스트링다루기;
// StringBuffer(동기화지원o), StringBuilder(동기화지원x) 둘 다 문자열을 추가하거나 변경할 때 사용
// String 자료형과 어떤 차이가 있는지만 이해하면 됨

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("java");
        System.out.println(sb);

        String st = "";
        st += "hello";
        st += " ";
        st += "java";
        System.out.println(st);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("jump to java");
        // insert : 해당 offset에 문자열을 추가
      //  sb2.insert(1, "hello");
        System.out.println(sb2);
        sb2.delete(7, 10);
        System.out.println(sb2.substring(0,4));
    }
}

