package ch09;

public abstract class NoteBook extends Computer { //상위클래스인 Computer의 typing 메서드를 하나 구현 안했기 떄문에 abstract 클래스가 된다.

    @Override
    public void display() {
        System.out.println("NoteBook display");
    }
}
