package ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    public Student() { //default 생성자는 생성자가 하나도 없을때 만들어지는데, 생성자가 밑에 있듯 만들어 지면 직접 생성해줘야 한다.
    }

    public Student(int studentNumber, String studentName, int grade) { //생성자 (변수를 넘겨줌)

        this.studentNumber = studentNumber; // 위에서 생성자 안에 넣어준 파라미터 값을 위에 선언한 멤버변수 안에 넣어주기 위해선 멤버변수 앞에 this를 써주어 그냥 변수와 구분
        this.studentName = studentName;
        this.grade = grade;
    }
    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고 " + grade + "학년 입니다.";
    }
}
