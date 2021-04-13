/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDir;

    public CustomerDirectory() {
        customerDir = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(ArrayList<Customer> customerDir) {
        this.customerDir = customerDir;
    }
    
    public Customer newCustomer(String name, String phone, int age, String address, String email, String username, String password){
        Customer customer = new Customer(name, phone, age, address, email, username, password);
        customerDir.add(customer);
        return customer;
    }
    
    public void deleteCustomer(Customer customer){
        customerDir.remove(customer);
    }
    
    public Customer findCustomer(String username){
        for(Customer c: customerDir){
            if(c.getUsername().equals(username)){
                return c;
            }
                
        }
        return null;
    }
    
    
    
}
