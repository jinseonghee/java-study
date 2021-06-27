package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다. ");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다. ");
    }

    public void washCar() {} //구현내용이 없는 메서드일 뿐, 추상 메서드가 아니다. 해서 하위클래스에서 필요한 경우 재정의 해서 사용한다.(=훅 메서드)

    final public void run() { //하위클래스에서 재정의 할 수 없게 final로 선언(시나리오의 흐름대로 실행 되어야 하기 때문에 final 선언)
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
}
