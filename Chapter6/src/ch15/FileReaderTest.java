package ch15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

        try(FileReader fis = new FileReader("reader.txt")) { //FileReader는 문자를 읽어드리는 스트림(FileInputStream을 사용하면 문자가 출력 X.)

            int i;
            while((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e){
        }
    }
}
