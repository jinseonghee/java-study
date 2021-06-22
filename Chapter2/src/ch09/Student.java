package ch09;

public class Student {

    int studentId;
    String studentName;

    Subject korea; //subject 는 데이터 티입. 쓰려면 new 해서 생성자 안에 선언
    Subject math; // 멤버변수의 참조 자료형

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject(); //멤버변수를 참조자료형으로 사용할 경우 생성자에서 주로 선언을 한다.
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }
    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }
    public void showScoreInfo() {
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
