package interview.strings.NotionInterviewQuestions;

import java.io.*;

public class ReadFileContent_NotionTests {
    /*
    * Program to read file content
    * Three ways to do:
    * 1. Using File input stream
    * 2. Using Buffered input stream
    * 3. Using File Reader class
    * */

    public static void main(String[] args) throws IOException {
        /*Using File input stream
        * */
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\nzadap\\Downloads\\Java\\Java\\src\\test\\java\\resource\\Hello.txt");
        BufferedInputStream inputStream = new BufferedInputStream(fileInputStream);
        int i = inputStream.read();
        while (i > 0) {
            System.out.print((char) i);
            i = inputStream.read();
        }
        System.out.println();
        inputStream.close();



    }
}
