package interview.strings.NotionJavaConcept.Inheritance.single;

public class Accountant extends Employee {

    public static void main(String[] args) {

        Accountant accountant = new Accountant();
        System.out.println(accountant.salary);
        accountant.employeeName();
    }
}
