package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("output2.txt");

        try(fos){ //java 9부터 지원

            byte[] bs = new byte[26];

            byte data = 65;
            for(int i = 0; i <bs.length; i++ ) {
                bs[i] = data++;
            }
            fos.write(bs);
        } catch (IOException e) { //write() Exception도 IOException
            System.out.println(e);
        }
        System.out.println("end");
    }
}
 