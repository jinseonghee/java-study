package ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(Employee.getSerialNum()); //클래스 이름으로 참조(static method 사용법도 static 변수와 마찬가지로 class 이름으로 접근)

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId()); //serialNum을 kim 만 적용시켰는데, 둘다 증가 된건 두개의 인스턴스가 하나의 메모리를 공유하기 때문이다.

    }
}
