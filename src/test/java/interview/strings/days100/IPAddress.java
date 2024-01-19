package interview.strings.days100;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

    /*
     * 100 Days challenge, Day 09
     * Date - 09/09/2023
     * 54. How to print date and time in java Program
     * */

    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost());
    }

}
