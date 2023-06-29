package Test.CoreJava;

public class Main {
    public static void main(String[] args) {
    /*    Car tata = new Car();
        tata.setModel("Harrier");
        tata.setModel("abc");
        System.out.println("Tata with new model name is " + tata.getModel());

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);
        System.out.println("Add = " + simpleCalculator.getAdditionResult());
        System.out.println("Subtraction= " + simpleCalculator.getSubtractionResult());*/

        /*Person person = new Person();
        person.setFirstName("Nachiket");
        person.setLastName("Zadap");
        person.setAge(25);
        System.out.println("FirstName " + person.getFirstName());
        System.out.println("LastName " + person.getLastName());
        System.out.println("Full Name" + person.getFullName());
        System.out.println("Age" + person.getAge());
        person.setLastName("Test");
        System.out.println("Full Name" + person.getFullName());*/

/*        BackAccount backAccount = new BackAccount();//("nachiket" , "mzadap@gmail.com", 123, 100,9158);
        System.out.println(backAccount.getAccountNumber());
        System.out.println(backAccount.getBalance());
        System.out.println(backAccount.getCustomerName());
        System.out.println(backAccount.getPhoneNumber());
        System.out.println(backAccount.getEmail());
        backAccount.depositFunds(50);
        backAccount.withdrawFunds(30);

        BackAccount test = new BackAccount(9158, "Nacii", "abc@gmail.com");
        System.out.println(test.getBalance());
        System.out.println(test.getAccountNumber());
        System.out.println(test.getEmail());*/

        /*VipCustomer vipCustomer = new VipCustomer("xyz", "20", "xyz@gmail.com");
        System.out.println(vipCustomer.getEmailAddress());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getName());

        VipCustomer vi = new VipCustomer();
        System.out.println(vi.getName());
        System.out.println(vi.getEmailAddress());
        System.out.println(vi.getCreditLimit());

        VipCustomer vipCustomer1 = new VipCustomer("pp", "8");
        System.out.println(vipCustomer1.getEmailAddress());*/

        WallArea wallArea = new WallArea(10,5);
        System.out.println("Area of a wall " + wallArea.getArea());

        wallArea.setHeight(-10);
        wallArea.setWidth(0);
        System.out.println("Width of wall " + wallArea.getWidth());
        System.out.println("height of wall " + wallArea.getHeight());
        System.out.println("Area of wall " + wallArea.getArea());

    }
}
