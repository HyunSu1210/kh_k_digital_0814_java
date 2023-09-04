package 스트림예제3;
// Files의 정적 메소드인 lines()와 BufferedReader
// Line() 메소드를 이용하여 문자 파일의 내용을 스트림을 통해 행 단위로 읽고 콘솔에 출력

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// + 오류남,,

public class StreamEx3 {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("src/스트림예제3/test.txt");
//        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
////        stream.forEach(System.out::println);
////        System.out.println();
//
//        File file = path.toFile();
//        FileReader fileReader = new FileReader(file);
//        BufferedReader br = new BufferedReader(fileReader);
//        stream = br.lines();
//        stream.forEach(System.out::println);
    }
}
