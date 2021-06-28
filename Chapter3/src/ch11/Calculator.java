package ch11;

public abstract class Calculator implements Calc { //구현하지 않은 메서드를 포함하고 있기 때문에 추상 클래스

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
