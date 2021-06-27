package ch09;

public abstract class Computer { //구현부가 없는 abstract 메서드가 있으면, 클래스도 선언할 때 abstract로 선언해야 한다.

    public abstract void display(); // 컴퓨터 클래스에서 구현하지 않고 다른 하위 클래스에서 구현하기 위해 abstract로 써줌.
    public abstract void typing();

    public void turnOn() { //구현부가 있는 메서드
        System.out.println("전원을 켭니다. ");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다. ");
    }
}
