package ch04;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010,"이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price);

        Customer vc = new VIPCustomer(12345, "noname"); //형변환(업캐스팅)
        System.out.println(vc.calcPrice(1000)); //인스턴스가 VIPCustomer이고 타입이 Customer인데, method가 실행 된건 VIPCustomer의 재정의된 메서드
                                                //즉 실제 인스턴스의 메서드가 호출이 된다 = 가상함수.
    }
}
