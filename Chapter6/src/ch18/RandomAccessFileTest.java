package ch18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");//RandomAccessFile는 유일하게 read, write를 제공하는 클래스

        rf.writeInt(100); //int 는 4byte
        System.out.println("pos: " + rf.getFilePointer());//파일 포인터의 위치
        rf.writeDouble(3.14); //double은 8byte, 4 + 8 = 12
        System.out.println("pos: " + rf.getFilePointer());
        rf.writeUTF("안녕하세요"); // 한글은 3byte, String은 맨 나중에 null character 2byte가 있음. 15 + 2 + 12 = 29
        System.out.println("pos: " + rf.getFilePointer());

        rf.seek(0);//파일 포인터가 도는데, 그 자리에서 부터 읽으면 error. seek 메서드를 통해 맨 처음으로 이동시켜 줌.
                        // ()괄호 안에 position을 아무데나 지정할 수 있어서, 그 자리에서 부터 파일포인터가 움직임.

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

    }
}
