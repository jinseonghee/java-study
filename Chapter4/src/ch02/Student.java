package ch02;

public class Student implements Cloneable {

    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String toString() {
        return studentNum + "," + studentName;
    }

    @Override
    public int hashCode() {
        return studentNum; //반환값은 equasl 메서드에서 썻던 멤버변수를 반환해 주면 된다.
    }

    @Override
    public boolean equals(Object obj) { //매개변수가 object로 넘어옴.

        if(obj instanceof Student) { //매개변수 obj가 Student 인스턴스가 맞는지 확인
            Student std = (Student)obj; // 맞다면 obj를 Student로 다운캐스팅
            if(this.studentNum == std.studentNum)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
