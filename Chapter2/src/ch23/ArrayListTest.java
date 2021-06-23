package ch23;

import ch21.Book;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();//<> 제너릭: 어떤 객체를 넣을 지 지정

        library.add(new Book("태백산맥1" , "조정래"));//element를 넣을때 객체 생성해서 넣어야 한다.
        library.add(new Book("태백산맥2" , "조정래"));
        library.add(new Book("태백산맥3" , "조정래"));
        library.add(new Book("태백산맥4" , "조정래"));
        library.add(new Book("태백산맥5" , "조정래"));

        for(int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }
   }
}
