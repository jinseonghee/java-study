package ch14;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0)
            return ERROR;
        return num1/num2;
    }

    public void showInfo() {
        System.out.println("모두 구현했습니다. ");
    }

    @Override
    public void description() { //인터페이스에 선언된 default 메서드를 재정의해서 사용 가능
        System.out.println("CompleteCalc overriding");
    }
}
