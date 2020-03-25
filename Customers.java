package arrays;

import java.util.ArrayList;

public class Customers {

    private String name;
    ArrayList<Double> transactionAmount;


    Customers(String name, double amount) {
        this.name = name;
        this.transactionAmount = new ArrayList<Double>();
        addAmount(amount);
    }

    public void addAmount(double value){
        transactionAmount.add(value);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionAmount() {    /////idk why this but lets see
        return transactionAmount;
    }

    public static Customers newCustomer(String name, double amount)   //for self ease
    {
        return new Customers(name,amount);
    }


}
