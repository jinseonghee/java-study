package ch09;

public class ComputerTest {

    public static void main(String[] args) {

        //Desktop desktop = new Desktop();
        Computer desktop = new Desktop(); //상속에선 업캐스팅도 묵시적으로 가능하기 때문에 상위클래스인 Computer를 타입으로 넣어도 가능,
        //하지만 이럴경우는 Computer에서 선언한 메서드나 변수만 사용가능하다.
        //Computer computer = new Computer(); 추상클래스로 선언이 되어 있기 때문에 new 를 해서 사용할 수 없음.
        //또, 클래스가 다 구현이 되었다 하더라도 클래스에 abstract로 선언이 되어있다고 해도 new 를 해서 사용할 수 없다.
    }
}
