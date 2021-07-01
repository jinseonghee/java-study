package ch03;

public class StringTest {

    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));//그냥 system.out 해서 출력하면 재정의된 값이 나옴
        java = java.concat(android);

        System.out.println(System.identityHashCode(java));//java에 android라는 문자를 연결해서 다시 java에 넣었지만, java와 javaandorid는 주소값이 다름
    }
}
