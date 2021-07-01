package ch02;

public class EqualsTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");

        System.out.println(std1 == std2); //주소가 다르기 때문에 false
        System.out.println(std1.equals(std2)); //student 클래스에서 물리적으로 같다는걸 재정의 해주었기 때문에 true

        System.out.println(std1.hashCode()); //두개의 메몰가 다르기 때문에 hashCode가 전혀 다르게 나온다.
        System.out.println(std2.hashCode()); //즉, 실제 주소는 다르지만, 논리적으로 같고, 그렇게 때문에 같은 Hash 값이 반환되었다.

        System.out.println(System.identityHashCode(std1)); //실제 jvm이 가지고 있는 5hashcode값 출력
        System.out.println(System.identityHashCode(std2));

        std1.setStudentName("KIM");
        Student copyStudent = (Student)std1.clone(); //clone의 return타입은 object인데 Student로 하기 위해 형변환
        System.out.println(copyStudent); //clone 함수는 생성이 아니라 인스턴스의 함수를 그대로 복제해서 사용하는 것이다. 하위클래스들을 그대로 복제할때 사용

    }
}
