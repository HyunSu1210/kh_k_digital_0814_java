package 학생성적정렬;

import java.util.Comparator;

public class Student implements Comparable <Student> {
    public String name;
    public int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        if(this.grade < o.grade) return 1; // 바꿈
        else if(this.grade == o.grade) return this.name.compareTo(o.name);
        else return -1;
    }
}
