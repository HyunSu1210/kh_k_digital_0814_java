package 파일복사;

import java.io.*;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/파일복사/곰돌이.jpg";
        String targetFileName = "d:/temp/bear.jpg";

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);
//        int readByteNo;
//        byte[] readBytes = new byte[100];
//        while (true) {
//            if ((readByteNo = fis.read(readBytes)) != -1) {
//                fos.write(readBytes, 0, readByteNo);
//            }
//            fos.flush();
//            fos.close();
//            fis.close();
        int readByteNo;
        byte[] readBytes = new byte[100];
        while( (readByteNo = fis.read(readBytes)) != -1 ) {
            fos.write(readBytes, 0, readByteNo);
        }

        fos.flush();
        fos.close();
        fis.close();
        }
    }


