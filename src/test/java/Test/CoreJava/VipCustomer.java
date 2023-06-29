package Test.CoreJava;


public class VipCustomer {

    private String name, creditLimit, emailAddress;

    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("This is a constructor with three parameter");
    }

    public VipCustomer(String name, String creditLimit) {
        this(name, creditLimit, "Test@gmail.com");
        this.name = name;
        this.creditLimit = creditLimit;
        System.out.println("THis is a constructor with two parameter");
    }

    public VipCustomer() {
        this("Abc", "10", "abc@gmail.com");
        System.out.println("This is a empty constructor with default values");
    }

    public String getName() {
        return name;
    }


    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }



}
