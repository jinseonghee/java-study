package ch09;

public class MyNoteBook extends NoteBook { //notebook 을 상속 받아서 notebook에서 구현하지 않았던 메서드 하나를 구현하면 abstract가 아닌 클래스

    @Override
    public void typing() {
        System.out.println("MyNoteBook typing");
    }
}
