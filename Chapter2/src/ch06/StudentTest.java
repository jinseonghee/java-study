package ch06;

public class StudentTest {

    public static void main(String[] args) {

       Student studentLee = new Student();
       studentLee.grade = 1; //밑에 방법과 동일한 방법임. 생성자를 사용하지 못한다면 이렇게 하나씩 넣어줘도 됨.
       System.out.println(studentLee.showStudentInfo()); //string 으로 반환값 지정 해 줘서 sout 으로 묶어줌.

       Student studentKim = new Student(12345 , "KIM" , 3);
       System.out.println(studentKim.showStudentInfo());
    }
}
