package Bootcamp.workbook;

import java.sql.Statement;
import java.util.Arrays;

public class WorkBook6_12 {

    public static void main(String[] args) {
        int[] ticket = {34, 43, 54, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;
        printTicketNumber(ticket);
        printTicketNumber(ticket2);
    }

    public static void printTicketNumber(int[] ticket) {
        System.out.print("Ticket 1 Number:");
        for (int i = 0; i<ticket.length; i++) {
            System.out.print(" " + ticket[i]);
        }
        System.out.println(" ");
    }
}
