/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private String type;
    private String streetaddress;
    private String country;
    private String city;
    private int zipcode;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private CustomerDirectory customerdirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private int counter = 1;
    
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

    public Organization(String type, String name, String streetaddress, String city, String country, int zipcode) {
        
        this.type = type;
        this.name = name;
        this.streetaddress = streetaddress;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        customerdirectory = new CustomerDirectory();
        organizationID = counter;
        counter++;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
