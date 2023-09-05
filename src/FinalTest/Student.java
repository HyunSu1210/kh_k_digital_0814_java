package FinalTest;

public class Student implements Comparable <Student> {
    public String name; // 이름
    public int kor; // 국어
    public int mat; // 수학
    public int eng; // 영어

    public Student(String name, int kor, int mat, int eng) {
        this.name = name;
        this.kor = kor;
        this.mat = mat;
        this.eng = eng;
    }
    public int sum() { // 총점 구하기
        return  kor + mat + eng;
    }

    public int compareTo(Student o) { // 비교해서 정렬하기
        if(this.sum() < o.sum()) return 1;
        else if(this.sum() == o.sum()) return this.name.compareTo(o.name);
        else return -1;

    }
}
