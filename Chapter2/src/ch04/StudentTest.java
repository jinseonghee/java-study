package ch04;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();       //앞이 데이터 타입, 뒤가 변수 이름(인스턴스) = new 생성자 -> student 하나를 생상하라는 뜻(class) 즉, student class 하나에 여러개의 인스턴스 생성 가능

        studentLee.studentID = 12345;// studentLee. student 안에 만든 인스턴스 studentLee 가 쓸수 있는 멤버변수와 메서드가 나온다.
        studentLee.setStudentName("Lee"); //set 해서 값을 직접 지정해 줄 경우, () 매개변수를 괄호 안에 넣어준다.
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();
        System.out.println(studentKim);
        System.out.println(studentLee);
    }
}
