package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

    public static void main(String[] args) throws ClassNotFoundException { //"java.lang.String"이 없으면 Exception이 떨어진다는 뜻

        Class c = Class.forName("java.lang.String"); //String class 이름은 풀네임으로 쓴다. 문자가 틀리면 에러가 나지만, 동적로딩을 할 수 있는 장점

        //reflection 프로그래밍 : 로컬에 이 object가 없을때, remote에 있는 걸 Invoke 할때만 사용하지, 잘 사용하지 않는다.
        Constructor[] cons = c.getConstructors(); //Class 클래스가 가지고 있는 멤버 메서드, 반환은 Constructor[] 배열로 반환.

        for(Constructor co : cons) { //Class 클래스 안에 생성자가 어떤게 있는지 출력
            System.out.println(co);
        }

        Method[] m = c.getMethods(); // Class 클래스 안에 어떤 메서드가 있는지 출력
        for(Method mth : m) {
            System.out.println(mth);
        }
    }
}

