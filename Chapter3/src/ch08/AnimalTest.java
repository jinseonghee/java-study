package ch08;


//import com.sun.xml.internal.ws.resources.UtilMessages;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() { //공통으로 사용될 메서드는 상위클래스에 넣어두고 하위클래스에서 사용할 수 있다.

    }
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 네 발로 뜁니다.");
    }

    public void flying() {
        System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);//moveAnimal이 Animal 타입이기 때문에 animal로 형변환이 되어 다 사용 가능
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal animal : animalList) { //다형성
            animal.move();
        }
        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list) { //ArrayList를 매개변수로 주면서 다운 캐스팅

        for (int i = 0; i < list.size(); i++) {

            Animal animal = list.get(i);

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                System.out.println("unsupported type");
            }
        }
    }

    public void moveAnimal(Animal animal) { //매개변수를 animal로 선언
        animal.move();
    }
}
