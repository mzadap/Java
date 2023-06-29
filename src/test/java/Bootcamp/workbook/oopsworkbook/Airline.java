package Bootcamp.workbook.oopsworkbook;

public class Airline {

    private Person[] people;

    public Airline() {
        this.people = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(this.people[index]);
    }

    public void setPerson(Person person) {
        this.people[person.getSeatNumber() -1] = new Person(person);
    }

    public void createReservation(Person person) {

       /* while (seats[person.getSeatNumber() - 1] != null) {
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
        }*/

        int index = person.getSeatNumber() - 1;
        people[index] = new Person(person);
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.people.length; i++) {
            if (people[i] != null) {
                temp += people[i].toString();
                temp += "\n\n";
            }
            else {
                temp += "Seat " + (i+1) + " is empty.";
                temp += "\n\n";
            }
        }
        return temp;
    }
}
