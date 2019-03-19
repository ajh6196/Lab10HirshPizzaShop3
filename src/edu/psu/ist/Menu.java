package edu.psu.ist;

import java.util.ArrayList;

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private double itemPrice;

    //Constructor Method
    public Menu(int _menuId, String menuItem, double itemPrice){
        this.menuId = _menuId;
        this.menuItem = menuItem;
        this.itemPrice = itemPrice;
    }



    //Setters and Getters
    public int getmenuId() {

        return menuId;
    }
    public void setmenuId(int _menuId) {

        this.menuId = _menuId;
    }
    public String getMenuItem() {

        return menuItem;
    }
    public void setMenuItem(String menuItem){

        this.menuItem = menuItem;
    }
    public double getItemPrice() {

        return itemPrice;
    }
    public void setItemPrice(double itemPrice){

        this.itemPrice = itemPrice;
    }
    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println(menu.getmenuId());
            System.out.println(menu.getMenuItem());
            System.out.println(menu.getItemPrice());
        }
    }
}
