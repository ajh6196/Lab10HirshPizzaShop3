package edu.psu.ist;

import java.util.ArrayList;

enum PaymentType {Cash, Credit, Debit}

public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;
    private Order order;
    private PaymentType paymentType;

    //Constructor Method
    public Transaction(int _transactionId, Order order, PaymentType paymentType){

        this.transactionId = _transactionId;
        this.order = order;
        this.paymentType = paymentType;
    }


    //Setters and Getters
    public int getTransactionId() {

        return transactionId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setTransactionId(int _transactionId) {
        this.transactionId = _transactionId;
    }
    public static void listTransactions(ArrayList<Transaction> tList){
        for (Transaction transaction: tList){
            System.out.println("Cash, Credit, or Debit");
            System.out.println(transaction.getTransactionId());
            System.out.println(transaction.getOrder());
            System.out.println(transaction.getPaymentType());
        }
    }

}
