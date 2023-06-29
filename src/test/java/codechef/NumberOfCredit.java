package codechef;


/*

Number of credit score
1. RTP course point = 4
2. Audit course point = 2
3. No RTP course point = 0
 */
public class NumberOfCredit {

    public static void main(String[] args) {
        int rtpCourse = 6;
        int auditCourse = 6;
        int noRtpCourse = 2;

        System.out.println((rtpCourse * 4) + (auditCourse * 2) + (noRtpCourse * 0));
    }

}
