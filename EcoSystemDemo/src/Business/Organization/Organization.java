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
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private CustomerDirectory customerdirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private int counter = 1;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Service("Service Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        customerdirectory = new CustomerDirectory();
        organizationID = counter;
        counter++;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
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
