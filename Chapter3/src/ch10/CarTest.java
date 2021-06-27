package ch10;

public class CarTest {

    public static void main(String[] args) {

        Car aiCar = new AICar();
        aiCar.run(); // run의 시나리오 대로 출력이 된다.

        System.out.println("===========================");

        Car mCar = new ManualCar();
        mCar.run();
    }
}
