package ch03;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

//  public VIPCustomer() {
//        super(); //상위클래스의 constructor를 자동으로 호출하게 하는 키워드
//
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIPCustomer() call");
//    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName); //상위클래스 생성자에 매개값이 있으면 하위 클래스를 사용할때도 super에 똑같이 넣어주야 한다(명시적으로 작성)

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer(int, String) call");
    }
    public String getAgentID() {
        return agentID;
    }
}
