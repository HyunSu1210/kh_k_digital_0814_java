package 파일스트림읽기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStreamRead {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/파일스트림읽기/아무말.txt");
        } catch (FileNotFoundException e) {
            System.out.println("읽을 파일을 찾지 못했습니다.");
        }
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

    }
}
