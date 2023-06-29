package interview.strings.NotionInterviewQuestions;

public class SumOfArrayOfElementsInArray_NotionTests {

    public static void main(String[] args) {
        int[] no = {10,20,30,40,50};
        int sum = 0;
        for (int nos : no) {
            sum += nos;
        }
        System.out.println(sum);
    }
}