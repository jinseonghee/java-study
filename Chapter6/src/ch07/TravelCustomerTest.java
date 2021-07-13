package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);//Constructor의 매개변수 값.
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("고객 명단 출력");
        //System.out.println(customerList.toString());
        //customerList.stream().forEach(s-> System.out.println(s));
        customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));//중간연산을 해서 이름만 꺼내옴

        System.out.println("여행비용");
        System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());

        System.out.println("20세 이상 고객이름 정렬");
        customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s -> System.out.println(s)); //중간연산은 여러개, 최종 연산은 하나만 사용 가능
        //filter에 쓴 매개변수c 와 map에 쓴 c는 다른 변수이다.
    }
}
