package interview.strings.days100.codingbat.stringss;

public class DuplicateWords {

    public static void main(String[] args) {
        String s = "hello my name is nachiket zadap working is qa. nachiket is good person. qa is good person";
        String[] s1 = s.split(" ");
        int count, i, j;
        for ( i = 0; i<s1.length; i++) {
            count = 1;
            for ( j = i+1; j<s1.length; j++) {
                if (s1[i].equals(s1[j]))  {
                    count++;
                    s1[j] = "0";
                }
            }
            if (count> 1 && s1[i] != "0") {
                System.out.println("number of duplicate words " + s1[i] + " count is " + count);
            }
        }

    }
}
