package ch15;

public class Customer implements Buy, Sell { //implements는 몇개가 와도 상관 없다
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        //Buy.super.order(); //buy의 order를 사용하겠다는 뜻
        System.out.println("customer order");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void hello() {
        System.out.println("hello");
    }
}
