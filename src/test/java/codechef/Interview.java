package codechef;

import java.util.Arrays;

public class Interview {

    public static void main(String[] args) {

        /*//creditcard

        WebDriver driver = new ChromeDriver();
        chromeDriver.setProperty("driver.exe", "C\\test\\chromedriver.exe");
        driver.navigate("www.google.com");
        //Implicatiy wait
        driver.manage().timeout(TIMEOUT, 10);
        //Explicity wait
        Wait wait = new Wait(driver);
        wait.(ExpectedConditions.visibilityOfElement(webElement)).click();
        //Fluent Wait
        WebElement dropDown = driver.find.element(By.xpath("//div[text()='dropDown']")).click();
        Select select = new Select(dropDown);
        select.ByvisibleText("creditcard");*/

           /* String s1 = "CARE";
            String s2 = "RACq";
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result = Arrays.equals(ch1, ch2);
            if (result) {
                System.out.println("It is a aragram");
            } else {
                System.out.println("It is not");
            }*/

            String s1 = "hello";
            String s2 = "";

            for (int i = s1.length()-1;i>=0;i--) {
                s2 += s1.charAt(i);
            }
            System.out.println(s2);

           /* if (s1.equals(s2)) {
                System.out.println("Palidrome string");
            } else {
                System.out.println("Not");
            }*/

        String s3 = "This is new year";
        int count = 1;
        for (int i = 0; i<s3.length();i++) {
            if (s3.charAt(i) == ' ' && s3.charAt(i+1)!=' ') {
                count++;
            }
        }
        String[] words = s3.split(" ");
        for (int i = words.length-1; i>=0; i--) {
            System.out.print(words[i] + " ");
        }
        /*for (int i = s3.length()-1; i>=0; i--) {
            System.out.print(s3.charAt(i) + "");
        }*/
        //System.out.println(count);


    }
}
