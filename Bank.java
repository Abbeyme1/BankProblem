package arrays;
import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branches> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branches>();
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String name) {
        if (checkBranch(name) == null) {
            this.branches.add(new Branches(name));
            return true;
        }
        return false;
    }

    public Branches checkBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(name)) {
                return branches.get(i);
            }
        }
        return null;
    }


    public boolean addCustomer(String branchName, String cusotmerName, double amount)
    {
        Branches branch = checkBranch(branchName);
        if(branch != null)
        {
            return branch.newCustomer(cusotmerName,amount);
        }
        return false;
    }

    public boolean addTransaction(String branchName,String customerName, double amount)
    {
        Branches branch = checkBranch(branchName);
        if(branch != null)
        {
          return branch.addTransactionToExistingCustomer(customerName,amount);
        }
        return false;
    }

    private Branches findBranch(String branchName)
    {
        for (int i = 0; i < this.branches.size(); i++) {
            Branches value = this.branches.get(i);
            if (value.getBranchName().equals(branchName)) {
                return value;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName,boolean showTransactions)
    {
        Branches branch = findBranch(branchName);
        if(branch != null)
        {
            System.out.println("Customer details for branch "+ branchName);

            ArrayList<Customers> branchCustomers = branch.getCustomers();
            for(int i=0;i<branchCustomers.size();i++)
            {
                Customers branchCustomer = branchCustomers.get(i);
                System.out.println(" Customer : "+branchCustomer.getName()+"["+i+"]");
                if(showTransactions)
                {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactionAmount();
                    for(int j=0;j<transactions.size();j++)
                    {
                        System.out.println("["+(j+1)+"]  Amount"+ transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
