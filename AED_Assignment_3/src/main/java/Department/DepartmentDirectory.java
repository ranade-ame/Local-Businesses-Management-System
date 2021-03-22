/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class DepartmentDirectory {
    public ArrayList<Department> departmentlist;
    
    public DepartmentDirectory(){
        departmentlist = new ArrayList();
    }
    
    public Department newDepartment(String name){
        Department dept = new Department(name);
        departmentlist.add(dept);
        return dept;
        
    }
    
}
