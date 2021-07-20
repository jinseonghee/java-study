package ch19;

public class Latte extends Decorator { //Coffee 클래스를 포함한 상속

    public Latte(Coffee coffee) { //상위 클래스에서 default Constructor가 없기 떄문에 하위 클래스에서는 매개변수가 있는 Constructor가 매개변수가 있는 super를 명시적으로 호출해야 함.
        super(coffee);
    }

    public void brewing() {//재정의
        super.brewing(); //상위인 super의 brewing을 부름
        System.out.print(" Adding Milk ");
    }
}
