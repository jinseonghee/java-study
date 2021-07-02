package ch03;

public class StringBuilderTest {

    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java); //매개 변수로 String을 넣는게 가능
        System.out.println(System.identityHashCode(buffer));
        buffer.append(android);
        System.out.println(System.identityHashCode(buffer)); //buffer가 계속 가변하기 때문에 hashcode()값이 같다.

        String test = buffer.toString();
        System.out.println(test);
    }
}
