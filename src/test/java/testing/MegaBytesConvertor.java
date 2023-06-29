package testing;

public class MegaBytesConvertor {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes <= 0){
            System.out.println("Invalid Value");
        }else {
                long megabyte = Math.round( kiloBytes / 1024);
                long remainingKiloBytes = Math.round(kiloBytes % 1024);
                System.out.println(kiloBytes + " KB = " + megabyte + " MB and " + remainingKiloBytes + " KB");
        }
    }

}
