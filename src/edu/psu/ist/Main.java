package edu.psu.ist;

/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Alex Hirsh
Date Developed: 3/13/19
Last Date Changed: 3/17/19
Rev: 3
 */


import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            final char EXIT_CODE = 'E';
            final char CUST_CODE = 'C';
            final char MENU_CODE = 'M';
            final char ORDE_CODE = 'O';
            final char TRAN_CODE = 'T';
            final char HELP_CODE = '?';
            char userAction;
            final String PROMPT_ACTION = "Add 'C'ustomer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
            ArrayList<Customer> cList = new ArrayList<>();
            ArrayList<Menu> mList = new ArrayList<>();
            ArrayList<Order> oList = new ArrayList<>();
            ArrayList<Transaction> tList = new ArrayList<>();

            Customer cust1 = new Customer(1,"Bill");
            Customer cust2 = new Customer(2,"Alex");
            Customer cust3 = new Customer(3,"Jim");
            Customer cust4 = new Customer(4,"Dwight");

            Menu menu1 = new Menu(1, "Plain",9.75);
            Menu menu2 = new Menu(2, "Meat",10.75);
            Menu menu3 = new Menu(3, "Extra",10.00);
            Menu menu4 = new Menu(4, "Veggie",10.25);

            Order order1 = new Order(1,"Plain Pizza", 0.00,menu1,cust1);
            Order order2 = new Order(2,"Meat Pizza",0.00,menu2,cust2);
            Order order3 = new Order(3,"Extra Cheese Pizza",0.00,menu3,cust3);
            Order order4 = new Order(4,"Veggie Pizza",0.00,menu4,cust4);

            Transaction trans1 = new Transaction(1, order1, PaymentType.Cash);
            Transaction trans2 = new Transaction(2, order2, PaymentType.Credit);
            Transaction trans3 = new Transaction(3, order3, PaymentType.Debit);
            Transaction trans4 = new Transaction(4, order4, PaymentType.Credit);



            mList.add(menu1);
            mList.add(menu2);
            mList.add(menu3);
            mList.add(menu4);

            cList.add(cust1);
            cList.add(cust2);
            cList.add(cust3);
            cList.add(cust4);

            oList.add(order1);
            oList.add(order2);
            oList.add(order3);
            oList.add(order4);

            tList.add(trans1);
            tList.add(trans2);
            tList.add(trans3);
            tList.add(trans4);

            userAction = getAction(PROMPT_ACTION);

            while (userAction != EXIT_CODE) {
                switch(userAction) {
                    case CUST_CODE : Customer.addCustomer(cList);//addCustomer();
                        break;
                    case MENU_CODE : Menu.listMenu(mList);
                        break;
                    case ORDE_CODE : Order.addOrders(oList);//addOrders();
                        break;
                    case TRAN_CODE : Transaction.listTransactions(tList);//listTransactions();
                        break;
                }

                userAction = getAction(PROMPT_ACTION);
            }
        }
        public static char getAction(String prompt) {
            Scanner scnr = new Scanner(System.in);
            String answer = "";
            System.out.println(prompt);
            answer = scnr.nextLine().toUpperCase() + " ";
            char firstChar = answer.charAt(0);
            return firstChar;


    }
}
