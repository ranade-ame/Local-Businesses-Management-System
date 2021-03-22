/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

/**
 *
 * @author ameya
 */
public class College {
    
    public DepartmentDirectory dd;
    public String name;
    public College(String name){
        this.name = name;
    }
    
    public DepartmentDirectory newdeptdir(){
        
        dd = new DepartmentDirectory();
        return dd;
    }
    
}
