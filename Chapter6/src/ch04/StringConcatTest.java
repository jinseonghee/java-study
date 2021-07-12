package ch04;

public class StringConcatTest {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString(s1,s2);

        StringConcat concat = (s,v)-> System.out.println(s + "," + v);
        concat.makeString(s1,s2); //람다식을 사용하면 클래스를 만들어서 Implements한 후 인스턴스 생성해서 사용하는 부분 생략

        //람다식을 사용하면 내부에서 자동으로 익명클래스를 생성해서 우리 눈에 보이지 않지만 밑에처럼 익명클래스가 생성 가능
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "...." + s2);
            }
        };
        concat2.makeString(s1,s2);
    }
}
