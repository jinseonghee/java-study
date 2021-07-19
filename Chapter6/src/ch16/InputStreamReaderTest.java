package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {

        //try(FileInputStream fis = new FileInputStream("reader.txt")) { 글자를 읽을 수 없음.
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {//InputStreamReader은 보조 스트림이기 떄문에 매개변수로 inputStream을 받는다.

            int i;
            while((i = isr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) { //보조 스트림이 닫히면 기반 스트림은 닫히기 때문에 close()를 하지 않아도 된다.

        }
    }
}
