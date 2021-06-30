package ch15;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf; //상속을 받을 수 있으니까 protected 선언

    public Shelf() {
        shelf = new ArrayList<String>(); //생성자가 호출될때 멤버변수를 초기화 해주는게 좋다다
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
