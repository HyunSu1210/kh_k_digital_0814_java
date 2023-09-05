package 문자스트림;
// Writer : 문자열 기반 출력 스트림의 최상위 클래스로 추상 클래스
// Reader : 문자열 기반 입력 스트림의 최상위 클래스로 추상 클래스
import java.io.*;

public class CharStreamEx {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
        char[] data = "곰돌이사육사".toCharArray();
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]);
//        }
        writer.write(data);
        writer.flush();
        writer.close();

        Reader reader = new FileReader("test.txt");
        while(true) {
            int readData = reader.read();
            if(readData == -1) break;
            System.out.print((char)readData); // 아스키 코드 값이 아닌 실제 문자가 찍히도록
        }
        reader.close();
    }
}
