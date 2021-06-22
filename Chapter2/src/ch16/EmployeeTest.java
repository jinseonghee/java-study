package ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(employeeLee.serialNum); //참조변수로 출력

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.serialNum++;

        System.out.println(employeeLee.serialNum);
        System.out.println(employeeKim.serialNum); //serialNum을 kim 만 적용시켰는데, 둘다 증가 된건 두개의 인스턴스가 하나의 메모리를 공유하기 때문이다.
        
    }
}
