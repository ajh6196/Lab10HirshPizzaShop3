package edu.psu.ist;

import java.util.ArrayList;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;

    //Constructor Method
    public Customer(int _customerId, String customerName){
        this.customerId = _customerId;
        this.customerName = customerName;
    }

    public static void addCustomer(ArrayList<Customer> cList) {
        for (Customer customer: cList){
            System.out.println(customer.getcustomerId());
            System.out.println(customer.getCustomerName());
        }
    }

    //Setters and Getters
    public int getcustomerId() {
        return customerId;
    }
    public void setcustomerId(int _customerId) {
        this.customerId = _customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName() {
        this.customerName = customerName;
    }
}
