package 학생성적정렬;
// 5명의 학생에 대해 이름과 성적을 입력. 성적이 높은 사람 순으로 정렬(내림차순)하고 같으면 이름 순으로 정렬(오름차순)

import java.util.Iterator;
import java.util.TreeSet;

public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student> stu = new TreeSet<>();
        stu.add(new Student("김땡땡", 85));
        stu.add(new Student("박땡땡", 85));
        stu.add(new Student("이땡땡", 85));
        stu.add(new Student("이땡땡", 75));
        stu.add(new Student("김땡땡", 90));

        Iterator<Student> iterator = stu.iterator();
        for(Student e : stu) System.out.println(e.name + " : " + e.grade);
    }
}
