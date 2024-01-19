package interview.strings.days100;

public class Substring {

    /*
     * 100 Days challenge, Day 02
     * Date - 02/09/2023
     * 29. Find All substring of string in java Program
     * */

    public static void main(String[] args) {
        String s1 = "nachiket";
        for (int i =0; i<s1.length(); i++) {
            for (int j = i; j<s1.length(); j++) {
                System.out.println(s1.substring(i, j+1));
            }

        }
        /*int n = s1.length();
        int temp =0;
        String[] str = new String[n*(n+1)/2];
        for (int i = 0; i<n;i++) {
            for (int j = i; j<n;j++) {
                str[temp] = s1.substring(i, j+1);
                temp++;
            }
        }
        for (int i =0;i< str.length; i++) {
            System.out.println(str[i]);
        }*/
    }
}
