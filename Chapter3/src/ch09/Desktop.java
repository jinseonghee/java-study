package ch09;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("Desktop display");
    }
    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }
    @Override
    public void turnOff() { //상위클래스인 Cumputer의 메서드 이지만 하위클래스에서 재정의 해서 사용가능(overriding)
        System.out.println("Desktop turnOff");
    }
}
