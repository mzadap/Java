package Bootcamp.workbook.oopsworkbook;

import java.util.Arrays;

public class Person {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }


    // copy construtor
    public Person(Person person) {
        this.name = person.name;
        this.nationality = person.nationality;
        this.dateOfBirth = person.dateOfBirth;
        this.seatNumber = person.seatNumber;
        this.passport = Arrays.copyOf(person.passport, person.passport.length);
    }

    public boolean applyPassport() {
      /* int number = (int) (Math.random() * 2);
        if (number == 0) {
            return false;
        } else {
            return true;
        }*/

        return Math.random() < 0.5;
    }

    public void chooseSeat() {
        this.seatNumber = (int) (Math.random() * 12);
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(passport,passport.length);
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport() {
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String toString() {
        return "Name " + this.name + "\n" + "Nationality: " + "\n"
                + this.nationality + "\n" + "Date of birth: " + this.dateOfBirth +
                "\n" + "seat number " + this.seatNumber + "\n " + "passport field "
                + Arrays.toString(this.passport) + "\n";
    }
}
