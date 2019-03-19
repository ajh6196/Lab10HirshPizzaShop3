package edu.psu.ist;

import java.util.ArrayList;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private String itemsInOrder;
    private double orderTotal;
    private Menu menuItem;
    private Customer customer;

    //Constructor Method
    public Order(int _orderId, String itemsInOrder, double orderTotal, Menu menuItem, Customer customer){

        this.orderId = _orderId;
        //this.itemsInOrder = itemsInOrder;
        this.orderTotal = orderTotal;
        this.menuItem = menuItem;
        this.customer = customer;
    }


    //Setters and Getters
    public int getorderId() {

        return orderId;
    }
    public void setorderId(int _orderId) {

        this.orderId = _orderId;
    }
    public String getItemsInOrder(){
        return itemsInOrder;
    }
    public void setItemsInOrder(String itemsInOrder){
        this.itemsInOrder = itemsInOrder;
    }

    public double getOrderTotal() {
        return orderTotal;
    }
    public void setOrderTotal(double orderTotal){
        this.orderTotal = orderTotal;
    }

    public Menu getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(Menu menuItem){
        this.menuItem = menuItem;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public static void addOrders(ArrayList<Order> oList) {
        for (Order order: oList){
            System.out.println(order.getorderId());
            System.out.println(order.getItemsInOrder());
            System.out.println(order.getOrderTotal());
            System.out.println(order.getMenuItem());
            System.out.println(order.getCustomer());
        }

    }
}
    

