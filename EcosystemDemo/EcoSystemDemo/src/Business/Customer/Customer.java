/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Orders.Orders;
import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class Customer {
    private String name;
    private String phone;
    private int age;
    private String streetaddress;
    private String country;
    private String city;
    private int zipcode;
    private String email;
    private String username;
    private String password;
    private int id;
    private static int count = 1000;
    private ArrayList<Orders> orderslist;

    public Customer(String name, String phone, int age, String streetaddress, String email, String username, String password, String country, String city, int zipcode) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.streetaddress = streetaddress;
        this.email = email;
        this.username = username;
        this.password = password;
        this.country = country;
        this.city = city;
        this.zipcode = zipcode;
        this.orderslist = new ArrayList<Orders>();
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Orders> getOrderslist() {
        return orderslist;
    }

    public void setOrderslist(ArrayList<Orders> orderslist) {
        this.orderslist = orderslist;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStreetAddress() {
        return streetaddress;
    }

    public void setStreetAddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    @Override
    public String toString() {
        return username;
    }
    
}
