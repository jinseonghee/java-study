package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void main(String[] args) {

        //FileInputStream fis = null;

        try (FileInputStream fis = new FileInputStream("a.txt")) { //java 7에서 부턴 try 문 안에 파일 선언 한 후 자동으로 close() 시켜줌
            System.out.println("read");
        } catch (FileNotFoundException e) { //파일을 찾지 못할때 생기는 exception
            e.printStackTrace();
        } catch (IOException e) { //close()되어 있지 않을때 생기는 exceptoon
            e.printStackTrace();
        }
        System.out.println("end");
    }
}


        /*
        try {
            fis = new FileInputStream("a.txt"); //파일을 찾을 땐, 가장먼저 해당 프로젝트 밑에서 찾는다.
            System.out.println("read");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();  Trace는 어디서 error가 생겼는지 알려줌
            System.out.println(e); //error 메시지 찍어줌
            return;
        } finally { // finally는 try문을 호출할 때 반드시 수행되므로, fis가 열려있을때만 닫아준다는 조건 식을 넣어서 close를 한번만 시켜주면 됨.
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally");


    }
        System.out.println("end");

    }
}
*/