package ch16;

public class Employee {

    private static int serialNum = 1000; //static 변수는 인스터스가 공유

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        serialNum ++;// 객체가 생성될때 초기화 작업은 생성자에서 해준다.
        employeeId = serialNum; //serialNum에 그냥 ++ 를 해버리면 serialNum 이 static 변수이기 때문에 인스턴스를 공유해서 사용하므로
                                // 모든 사원이 같은 사번을 가지게 된다. 그래서 employeeId 에 증가된 serialNum 을 넣어줘야 한다.
    }

    public static int getSerialNum() { //static method(위에 static 변수를 private 으로 선언해 주었기 때문에 set method는 지움.)
        int i = 0; //지역변수 : static 메서드 내에 지역변수를 선언해서 사용하는건 문제가 되지 않는다.
        //employeeName = "Lee";  그런데 인스턴스 변수(멤버변수)를 static 변수 내에 사용 하는건 안된다. 왜냐하면 인스턴스 생성 전에 호출될 수 있으므로
        return serialNum; //해서 static 변수, 메서드는 인스턴스 생성과 무관하게 class 이름으로 호출
    }

    public int getEmployeeId() {
        //serialNum = 1000; 다른 메서드에서 static 변수를 사용하는건 문제가 되지 않음. 이미 메모리에 올라가 있는 상태이기 때문에.
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
