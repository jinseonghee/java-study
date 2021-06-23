package ch24;

import java.util.ArrayList;

public class Student {

    int studentId;
    String studentName;
    ArrayList<Subject> subjectList; //수강하는 과목을 배열로 만듬

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point) {

        Subject subject = new Subject(); //subject 클래스를 사용하기 위해 인스턴스 객체를 선언해서 불러옴

        subject.setName(name);
        subject.setScorePoint(point);

        subjectList.add(subject); //위에 subject를 배열로 선언해주어 subjectList 변수를 만들고, 과목을 subjectList에 add해 주어,
        //addSubject method 만 언제든 불러서 학생간에 과목을 다르게 담을 수 있다.
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject subject : subjectList) {
            total += subject.getScorePoint();
            System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScorePoint() + "입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
