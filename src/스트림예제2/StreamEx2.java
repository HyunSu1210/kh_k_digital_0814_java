package 스트림예제2;
// 반복자 스트림 forEach() : 내부 반복자, 스트림 요소에 대한 순차 접근을 제공하며, 최종 연산에 해당합니다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("고유림",67),
                new Student("나희도", 55),
                new Student("우영우", 99),
                new Student("최수연", 96),
                new Student("권민우", 92)
        );
        double average = list.stream() // 스트림 생성
                .mapToInt(Student::getScore) //메소드 참조, 중간 연산
                .average() // 중간 연산
                .getAsDouble(); // 최종 연산

        System.out.println("평균 점수 : " + average);

//        IntStream stream = IntStream.rangeClosed(1, 100);
//        int sum = 0;
//        stream.forEach(e -> sum += e);
//        System.out.println("합계 : " + sum);

        //        list.forEach(s-> { // 순차 처리
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
//        for (Student s : list) {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        }
//        list.parallelStream().forEach(s -> {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + " : " + score);
//        });
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}
