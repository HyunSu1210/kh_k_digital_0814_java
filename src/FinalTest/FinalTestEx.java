package FinalTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

// 파일 읽어 총점 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기
public class FinalTestEx {
    public static void main(String[] args) {
        FileInputStream fis = null;
        TreeSet<Student> treeSet = new TreeSet<>();
        try {
            fis = new FileInputStream("d:/final/text.txt"); // 파일 읽기
        } catch (FileNotFoundException e) {
            System.out.println("파일 x");
        }

        Scanner sc = new Scanner(fis);
        while (sc.hasNext()) { // 다음 내용이 있으면 true
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1]),
                    Integer.parseInt(lineSplit[2]),
                    Integer.parseInt(lineSplit[3])));
        }
        for (Student e : treeSet) {
            System.out.println("이름 : " + e.name + " 총점 : " + e.sum());
        }
    }
}
