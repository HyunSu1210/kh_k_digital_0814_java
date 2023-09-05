package 바이트스트림;

import java.io.*;
// OutputStream : 바이트 기반 출력 스트림의 최상위 추상 클래스

public class ByteStreamEx {
    public static void main(String[] args) throws IOException {

        // 패스 지정 안 해주면 프로젝트 밑에 생성됨(src 밖)
//        OutputStream os = new FileOutputStream("test.bin");
//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
//        os.write(a);
//        os.write(b);
//        os.write(c);

//        OutputStream os = new FileOutputStream("test2.bin");
//        byte[] array = {10, 20, 30, 40, 50};
//        os.write(array, 1, 3); // 배열의 1번 인덱스부터 3개 출력
//        os.flush(); // 버퍼 비우기
//        os.close(); // 자원 반납 후 스트림 닫기

        InputStream is = new FileInputStream("test.bin");
//        while(true) {
//            int data = is.read(); // 한 바이트씩 읽기
//            if(data == -1) break; // 파일의 끝은 -1 => 읽을 게 없으면 break;
//            System.out.println(data);
//        }
        byte[] buffer = new byte[100];
        while(true) {
            int readNum = is.read(buffer); // 배열의 길이만큼 읽기
            if(readNum == -1) break;
            for(int i = 0; i < readNum; i++) {
                System.out.println(buffer[i]);
            }
        }
        is.close();
    }
}
