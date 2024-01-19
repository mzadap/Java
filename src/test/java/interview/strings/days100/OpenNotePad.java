package interview.strings.days100;

import java.io.IOException;

public class OpenNotePad {

    /*
     * 100 Days challenge, Day 09
     * Date - 09/09/2023
     * 55. How to open notepad in java Program
     * */

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("notepad");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
