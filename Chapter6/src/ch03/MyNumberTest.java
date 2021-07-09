package ch03;

public class  MyNumberTest {

    public static void main(String[] args) {

        MyNumber myNumber = (x, y) -> x > y ? x : y; //타입이 MyNumber이고, return 과 반환문이 하나여서 {} 생략
        System.out.println(myNumber.getMax(10, 20));
    }
}

