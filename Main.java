import Bank
     public static void main(String[] args) {
         Bank bank = new Bank("SBI");

         bank.addBranch("abc");

         bank.addCustomer("abc","Abhay",50.0);
         bank.addCustomer("abc","John",30.0);
         bank.addCustomer("abc","Ronny",10.0);


         bank.addBranch("sydney");
         bank.addCustomer("sydney","Bob",34.0);

         bank.addTransaction("abc","Abhay",500.0);
         bank.addTransaction("abc","John",300.0);
         bank.addTransaction("abc","Ronny",100.0);


         bank.listCustomers("abc",false);
     }

}
