package ch12;

public class Person {

    String name;
    int age;

    public Person() {
        //name = "111";
        this("no name", 1); //다른생성자(밑에 person) 생성자를 불러서 사용
        name = "111"; // 위에 name 은 생성자가 다 생성되지 않은 상태이기 때문에 사용하지 못하는데, 이 줄에 name 은 위에 this 를 써줌으로써
        // 다른 생성자를 한번 불러서 사용해서 생성자가 인스턴스 된 상태이기 때문에 사용 가능하다.
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    public Person getPerson() { //반환타입이 Person이고 반환값에 Person 자기 자신을 return 시켜 this 를 사용
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();

        System.out.println(person);//위에 밑에 불러오는 참조변수 주소값이 같음.
        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}