package testing;

public class leapYear {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(isLeapYear(9000));
    }
    public static boolean isLeapYear(int year){
        boolean LY = false;
        if(year >=1 && year <=9999){
            if(year%400 ==0){
                LY = true;
            } else if (year%4 ==0 && year%100 == 0){
                LY = true;
            }
        }
        return LY;
    }
    public static int getDaysInMonth(int month, int year){

      if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }

        switch (month){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
              return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }




}
