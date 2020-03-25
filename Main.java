////class Car {
////    boolean engine;
////    int cylinders;
////    int wheels;
////    String name;
////
////    Car(int cylinders, String name)
////    {
////        this.cylinders = cylinders;
////        this.name = name;
////        this.wheels = 4;
////        this.engine = true;
////    }
////
////
////    void startEngine() {
////        System.out.println("engine started");
////    }
////
////    void accelerate() {
////        System.out.println("car is accelerating");
////    }
////
////    void breaks() {
////        System.out.println("breakes are applied");
////    }
////
////    public int getCylinders() {
////        return cylinders;
////    }
////
////    public String getName() {
////        return name;
////    }
////}
////
////class Rolls extends Car {
////    public Rolls(int cylinders,String name)
////    {
////        super(cylinders,name);
////    }
////
////    void startEngine() {
////        System.out.println("engine started : of rolls");
////    }
////
////    void accelerate() {
////        System.out.println("car is accelerating : of rolls ");
////    }
////
////    void breaks() {
////        System.out.println("breakes are applied : of rolls ");
////    }
////
////}
////class GWagon extends Car {
////    public GWagon(int cylinders,String name)
////    {
////        super(cylinders,name);
////
////    }
////
////    void startEngine() {
////        System.out.println("engine started of gwagon");
////    }
////
////    void accelerate() {
////        System.out.println("car is accelerating of gwagon");
////    }
////
////    void breaks() {
////        System.out.println("breakes are applied of gwagon");
////    }
////}
//
//=
//public class Main {
//    public static void main(String[] args) {
//
////    public static Car selectCar() {
////        int n = (int) (Math.random() * 2) + 1;
////        System.out.println("selected number");
////        switch (n) {
////            case 1:
////                return Rolls(2,4)
////            case 2
////                ;
////                return Gwagon
////        }
////    }
//}
//


import arrays.Bank;
import arrays.Contact;
import arrays.MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

 public class Main {
//    public static Scanner sc = new Scanner(System.in);
//    private static MobilePhone mobilePhone = new MobilePhone("05 252 522 2");
//    public static void main(String[] args) {
//        boolean quit = false;
//        startPhone();
//        printActions();
//        while (!quit)
//        {
//            System.out.println("\n-------ENTER CHOICE------");
//            int n = sc.nextInt();
//            switch (n)
//            {
//                case 0:
//                    System.out.println("\nShutting down");
//                    quit=true;
//                    break;
//
//                case 1:
//                    mobilePhone.printContacts();
//                    break;
//
//                case 2:
//                    addNewContact();
//                    break;
//
//                case 3:
//                    updateContact();
//                    break;
//
//                case 4:
//                    removeContact();
//                    break;
//
//                case 5:
//                    queryContact();
//                    break;
//
//                case 6:
//                    printActions();
//                    break;
//
//            }
//        }
//
//    }
//    public static void startPhone(){
//        System.out.println("Starting phone..........");
//    }
//
//    private static void addNewContact() {
//        System.out.println("Enter name ");
//        String name = sc.next();
//        System.out.println("Enter phoneNumber ");
//        String number = sc.next();
//        Contact newContact = Contact.createNewContact(name,number);
//        if(mobilePhone.addNewContact(newContact))
//        {
//            System.out.println("Contact :  name:"+ name+", phone: "+ number +" added successfully");
//        }
//        else {
//            System.out.println("Contact name "+name+" alerady exists");
//        }
//    }
//
//    public static void updateContact() {
//        System.out.println("Enter existing contact name that u wish to change");
//        String name = sc.next();
//        Contact existingContact = mobilePhone.queryContact(name);
//        if(existingContact == null)
//        {
//            System.out.println(existingContact.getName() + " named contact does not exists");
//            return;
//        }
//        System.out.println("Enter new Name");
//        String newName = sc.next();
//        System.out.println("Enter number");
//        String number = sc.next();
//
//        Contact newContact = Contact.createNewContact(newName,number);
//        if(mobilePhone.updateContact(existingContact,newContact))
//        {
//            System.out.println("Successfully updated record");
//        }
//        else {
//            System.out.println("Error updating contact");
//        }
//    }
//
//    public static void removeContact(){
//        System.out.println("Enter name to remove Contact");
//        String name = sc.next();
//        Contact existingContact = mobilePhone.queryContact(name);
//        if(existingContact == null)
//        {
//            System.out.println("Sorry! Contact doesn't exists");
//            return;
//        }
//        if(mobilePhone.removeContact(existingContact))
//        {
//            System.out.println("successfull deleted contact");
//            return;
//        }
//        System.out.println("Error deleting contact");
//    }
//
//    private static void queryContact() {
//        System.out.println("Enter existing contact number");
//        String name = sc.next();
//        Contact existingContact = mobilePhone.queryContact(name);
//        if(existingContact == null)
//        {
//            System.out.println("contact not found");
//            return;
//        }
//
//        System.out.println("Name :" + existingContact.getName() + "phone number is " + existingContact.getPhoneNumber());
//    }
//
//    public static void printActions(){
//        System.out.println("Press");
//        System.out.println("0  -  to shutdown");
//        System.out.println("1  -  to print contacts");
//        System.out.println("2  -  to add new contacts");
//        System.out.println("3  -  to update existing contact.");
//        System.out.println("4  -  to remove existing contacts");
//        System.out.println("5  -  query to existing contact exits");
//        System.out.println("6  -  to print the list of available actions.");
//
//    }
     public static void main(String[] args) {

//         ArrayList<Integer> intValues = new ArrayList<>();
//         for(int i=0;i<10;i++)
//         {
//             intValues.add(new Integer(i));
//         }
//         for(int i=0;i<10;i++)
//         {
//             System.out.println(intValues.get(i).intValue());
//         }
//
//
//         Integer myint = Integer.valueOf(54);
//
//         int val = myint.intValue();
//         System.out.println(val);


//         ArrayList<Double> doubles = new ArrayList<Double>();
//
//         for(double i = 0.0;i<10.0;i+=0.5)
//         {
//             doubles.add(i);
//         }
//         for(int i = 0;i<10.0;i++)
//         {
//             double value = doubles.get(i);
//             System.out.println(value);
//         }

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
