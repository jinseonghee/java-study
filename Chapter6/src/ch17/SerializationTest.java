package ch17;

import java.io.*;

class Person implements Externalizable {

    String name;
    String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
    public String toString() {
        return name + "," + job;
    }

    @Override
    public void writeExternal(ObjectOutput obj) throws IOException {

        obj.writeUTF(name);
        obj.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {

        name = obj.readUTF(); //String을 반환
        job = obj.readUTF();
    }
}



/*
class Person implements Serializable { //직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 Serialization 하다는 걸 명시를 해주어야 한다.(마크 인터페이스)

    String name;
    transient String job; //직렬화가 되지 않은 멤버 변수(Socket 등)가 있는데 클래스를 직렬화 시켜야 될 떄 사용(이 멤버는 무시한 채 직렬화, 대신 복원할 떄 넣어주는 값은 default 값을 넣어준다.)

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
    public String toString() {
        return name + "," + job;
    }
}
*/
public class SerializationTest {

    public static void main(String[] args) {

        Person personLee = new Person("이순신", "대표이사");
        Person personKim = new Person("김유신", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");//파일에 씀
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personLee);
            oos.writeObject(personKim);

        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fos = new FileInputStream("serial.txt");// 파일을 읽음
             ObjectInputStream ois = new ObjectInputStream(fos)) {

            Person pLee = (Person)ois.readObject(); //반환은 person, readObject는 반환값이 Object이기 때문에 Person으로 다운캐스팅
            Person pKim = (Person)ois.readObject(); //읽었을때 Exception 처리(읽을 떄 class로 처리가 되는데 class가 없을 경우의 예외 처리)

            System.out.println(pLee);
            System.out.println(pKim);

        } catch (IOException e) {
            System.out.println(e);

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

