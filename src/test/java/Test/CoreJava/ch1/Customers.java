package Test.CoreJava.ch1;

import java.util.ArrayList;

public class Customers {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customers(String customerName, ArrayList<Double> transactions) {
        this.customerName = customerName;
        this.transactions = transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}
