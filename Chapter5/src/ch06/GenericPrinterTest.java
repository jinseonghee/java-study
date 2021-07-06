package ch06;

public class GenericPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // 아까 GenericPrinter에 T를 넣어준걸 여기선, 어떤 타입을 쓸 건지 구체적으로 명시
                                                                       // 다이아몬드 연산자
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial(); //Object로 가져왔을땐 형변환을 시켜줬는데, 여기선 형변환을 안해줘도 되는 이유가, 8번째 줄에 GenericPrinter<Powder>
                                                //라고 선언을 해주어서 프로그램이 컴파일러가, GenericPrinter의 'T'라고 명시되어 있는 부분을 powder로 모두 replace 시켜준다.

        System.out.println(powderPrinter.toString());
    }
}
