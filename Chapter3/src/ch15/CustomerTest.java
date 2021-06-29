package ch15;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer;//Buy라는 타입을 Customer를 업캐스팅 : 상위 클래스의 타입으로 묵시적으로 형변환
        buyer.buy(); //Buy타입으로 선언해 주었기 때문에 buy에 선언된 메서드만 사용 가능. 한데, customer에서 재정의 해주었기 때문에 재정의된 값이 나옴
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
