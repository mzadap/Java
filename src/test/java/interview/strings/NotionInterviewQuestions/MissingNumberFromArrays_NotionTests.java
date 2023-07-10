package interview.strings.NotionInterviewQuestions;

public class MissingNumberFromArrays_NotionTests {

    public static void main(String[] args) {

        int[] a = {4,5,1,2};
        int n = a.length;
        int sum = (n+1) * (n+2) /2;
        for (int i=0;i<n;i++) {
            sum = sum - a[i];
        }
        System.out.println(sum);
    }

    /*public static int MissingNumber(int[] arr)
    {
        int n=arr.length;
        int sum1=((n)*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<n;i++)
            sum2+=arr[i];
        return sum1-sum2;
    }*/


}
