package ch23;

import java.util.ArrayList;

class FastLibrary {

    public ArrayList<String> shelf = new ArrayList<>();

    public FastLibrary() {
        shelf.add("태백산맥1");
        shelf.add("태백산맥2");
        shelf.add("태백산맥3");
        //shelf.add("태백산맥4"); 이렇게 되면 자원이 없는데, 밑에 lendBook메서드에서 빌리려고 해서 errror가 남
        //shelf.add("태백산맥5");
        //shelf.add("태백산맥6");
    }

    public synchronized String lendBook() throws InterruptedException { //자원이 없기 떄문에 synchronized를 건다고 해서 해결될게 아님

        Thread t = Thread.currentThread(); //이 메서드를 수행하고 있는 정보를 부름

        while (shelf.size() == 0) { //책이 없으면 wait() 상태로 빠짐
            System.out.println(t.getName() + " waiting start");
            wait();  //wait()은 Object 메서드이기 떄문에 아무 class에서나 사용 가능
            System.out.println(t.getName() + " waiting end");
        }


        if (shelf.size() > 0) {
            String book = shelf.remove(0); //맨 앞에 있는 책 빌려감
            System.out.println(t.getName() + " : " + book + " lend");
            return book;
        } else return null;
    }

    public synchronized void returnBook(String book) {

        Thread t = Thread.currentThread(); //어떤 Thread가 반납을 했는지 보기위해

        shelf.add(book);
        notifyAll(); //notifyAll()가 되면 책을 빌림
        System.out.println(t.getName() + " : " + book + " return");
    }
}

class Student extends Thread{ //책을 빌리는 학생이 Thread

    public Student(String name) {
        super(name); //super는 Thread
    }

    public void run() {

        try {
            String title = LibraryMain.library.lendBook();
            if (title == null) {
                System.out.println(getName() + "빌리지 못했음");
                return; //잘 못 빌리면 return
            }
            sleep(5000); //읽는데 시간
            LibraryMain.library.returnBook(title); //반납
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class LibraryMain {

    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {

        Student std1 = new Student("std1");
        Student std2 = new Student("std2");
        Student std3 = new Student("std3");
        Student std4 = new Student("std4");
        Student std5 = new Student("std5");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
    }
}
