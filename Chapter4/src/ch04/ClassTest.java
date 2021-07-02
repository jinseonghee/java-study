package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class c1 = Class.forName("ch04.Person"); //Class 클래스를 String으로 직접 넣어서 가져오는 방법, ch04 밑에 Person이라 패키지 같이 써줌.

        Person person = (Person)c1.newInstance(); //Class 클래스로 인스턴스 하는 방법, 반환값은 object라 Person으로 캐스팅

        person.setName("Lee");
        System.out.println(person);

        Class c2 = person.getClass(); //Class 클래스를 가져오는 다른 방법. 이 방법은 인스턴스(person)가 있는 상태해서 사용 가능.  object 메서드인 getClass()를 불러와 사용
        Person p = (Person)c2.newInstance();
        System.out.println(p);

        Class[] parameterTypes = {String.class}; //밑에 parametertype을 써주기 위해 여기에 명시, parametertype이 String 이었기 때문에 {}에 명시하고, 그럼 이 클래스에서 이러한 constructro을 찾음
        Constructor cons = c2.getConstructor(parameterTypes); //person 생성자의 parameterType이 뭔지 써줘야 함. Constroctor로 반환

        Object[] initargs = {"KIM"};  //밑에 argument type이 object여서 여기에 명시
        Person kimPerson = (Person)cons.newInstance(initargs); //cons를 new 인스턴스 하는데 ()안에 argument type을 명시
        System.out.println(kimPerson);

        Person kim2 = new Person("KiM"); //17~ 26줄 까지가 이 한줄을 의미
                                               //위의 경우는 로컬에 person이 없을때 사용하는 경우. person 의 타입을 모르고 사용해야 할때, 생성자 정보를 가지고 와서 사용해야 할 경우
    }
}


