package ch06;

public class ThreeDPrintTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder); //setMaterial 메서드에서 매개변수가 object로 바뀌기 때문에 powder도 Object 타입으로 변환이 되어서 문제가 안됨.

        Powder p = (Powder)printer.getMaterial(); //Object타입으로 반환되기 때문에 Powder 타입으로 형변환 해줘야 한다.
    }
}
