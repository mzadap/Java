package Test.CoreJava;

public class Person {
    String firstName, lastName;
    int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    public String setLastName(String secondName) {
        return this.lastName = secondName;
    }

    public int setAge(int age) {
        if (age < 0 || age >100){
            return age = 0;
        }else {
            return this.age = age;
        }
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty())
            // return " ";
            return ""; // no space ""
        else if(lastName.isEmpty())
            return firstName;
            // if(firstName.isEmpty())
        else if(firstName.isEmpty())
            return lastName;
        else // add this, why you were missing a return statement
            return firstName + " " + lastName; // add this
    }
    public boolean isTeen() {
        return (age > 12) && (age < 20);
    }

}
