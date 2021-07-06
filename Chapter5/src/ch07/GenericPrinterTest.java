package ch07;


public class GenericPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();

        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());

        //GenericPrinter<Water> printer = new GenericPrinter<Water>();
        //extends를 하지 않으면 무작위 클래스가 와도 상관없지만, extends를 선언했기 때문에 Water클래스는 선언이 안된다.
    }
}
