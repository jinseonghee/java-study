package ch18;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("boogie\\newFile.txt");
        file.createNewFile(); //FileOutputStream은 파일이 없으면 자동 생성 되지만, File 클래스는 createNewFile()이라는 메서드를 통해 생성

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.delete();
    }
}
