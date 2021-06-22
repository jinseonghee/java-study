package ch04;

public class Student {

    public int studentID; //멤버변수 선언
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentID + " 학번 학생의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
    }
    public String getStudentName() { //이름을 가져가는 메소드
        return studentName;  //이름을 반환
    }
    public void setStudentName(String name) { //이름을 지정할 경우 (어떤이름으로 바꿀건지 매개변수 선언)
        studentName = name; //student 이름에 들어온 매개변수 name을 넣어준다.
    }
}
