/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;

import Business.Employee.EmployeeDirectory;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Orders.Orders;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.ServiceWorkRequest;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private String phone;
    private String type;
    private String streetaddress;
    private String country;
    private String city;
    private int zipcode;
    private String email;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private CustomerDirectory customerdirectory;
    private UserAccountDirectory userAccountDirectory;
    private ItemsDirectory itemsDirectory;
    private ArrayList<Orders> ordersList;
    private ArrayList<Orders> deliveryOrderList;
    private ArrayList<Orders> inventoryOrderList;
    private ArrayList<ServiceWorkRequest> requestList;
    private int organizationID;
    
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Wholesale("Wholesale"), Vendors("Vendors"), Delivery("Delivery"), Factories("Factories"), Transport("Transport"), Cleaning("Cleaning"), Mechanic("Mechanic"), Electrician("Electrician"), Plumbing("Plumbing"), Suppliers("Suppliers");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String type, String name, String streetaddress, String city, String country, int zipcode, String email, String phone) {
        this.name = name;
        this.type = type;
        this.streetaddress = streetaddress;
        this.email = email;
        this.country = country;
        this.city = city;
        this.zipcode = zipcode;
        this.phone = phone;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        customerdirectory = new CustomerDirectory();
        itemsDirectory = new ItemsDirectory();
        ordersList = new ArrayList<Orders>();
        deliveryOrderList = new ArrayList<Orders>();
        inventoryOrderList = new ArrayList<Orders>();
        requestList = new ArrayList<ServiceWorkRequest>();
        organizationID = gen();
        
    }

    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public ArrayList<ServiceWorkRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<ServiceWorkRequest> requestList) {
        this.requestList = requestList;
    }
    
    public void newRequestList(){
        this.requestList = new ArrayList<ServiceWorkRequest>();
    }
    public String getType() {
        return type;
    }

    public ArrayList<Orders> getDeliveryOrderList() {
        return deliveryOrderList;
    }

    public void setDeliveryOrderList(ArrayList<Orders> deliveryOrderList) {
        this.deliveryOrderList = deliveryOrderList;
    }
    
    public void newDeliveryOrdersList(){
        this.deliveryOrderList = new ArrayList<Orders>();
    }
    
    public void newInvetoryOrdersList(){
        this.inventoryOrderList = new ArrayList<Orders>();
    }

    public ArrayList<Orders> getInventoryOrderList() {
        return inventoryOrderList;
    }

    public void setInventoryOrderList(ArrayList<Orders> inventoryOrderList) {
        this.inventoryOrderList = inventoryOrderList;
    }
    
    
    
    public void newordersList(){
        this.ordersList = new ArrayList<Orders>();
    }
    
    public ArrayList<Orders> getOrders() {
        return ordersList;
    }

    public void setOrders(ArrayList<Orders> ordersList) {
        this.ordersList = ordersList;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public ItemsDirectory getItemsDirectory() {
        return itemsDirectory;
    }

    public void setItemsDirectory(ItemsDirectory itemsDirectory) {
        this.itemsDirectory = itemsDirectory;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public CustomerDirectory getCustomerdirectory() {
        if(customerdirectory == null){
            customerdirectory = new CustomerDirectory();
        }
        return customerdirectory;
    }

    public void setCustomerdirectory(CustomerDirectory customerdirectory) {
        this.customerdirectory = customerdirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
