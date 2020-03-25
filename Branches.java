package arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class Branches {

    private String branchName;
    private ArrayList<Customers> customers;

    public Branches(String branchName) {
        this.branchName = branchName;
        this.customers  = new ArrayList<Customers>();
//        this.customers.add(customer);
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public Scanner sc = new Scanner(System.in);

    public boolean newCustomer(String name,double amount) {
        if(checkCustomer(name) == null)
        {
            this.customers.add(Customers.newCustomer(name,amount));
            System.out.println("Customer :"+name + " added successfully");
            return true;
        }
        System.out.println("Name already exists!");
        return false;
    }


    private Customers checkCustomer(String name)
    {
        for (int i = 0; i < this.customers.size(); i++) {
            Customers value = this.customers.get(i);
            if (value.getName().equals(name)) {
                return value;
            }
        }
        return null;
    }

    public boolean addTransactionToExistingCustomer(String name,double amount)
    {
        Customers existingCustomer = checkCustomer(name);
        if(checkCustomer(name) != null)
        {
            existingCustomer.addAmount(amount);
            return true;
        }
        System.out.println("Customer doesnt exists");
        return false;
    }

//    public void showListCustomers(Customers customer)
//    {
//        for(int i=0;i<this.customers.size();i++)
//        {
//            for(int j=0;j<this.  customers.get(i).transactionAmount.size();j++)
//            {
//                System.out.println("Customer:  "+ this.customers.get(i).getName() + " --> "+ this.customers.get(i).transactionAmount.get(j));
//            }
//        }
//    }

}
