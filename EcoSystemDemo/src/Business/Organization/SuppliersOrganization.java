/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SuppliersRole;
import java.util.ArrayList;

/**
 *
 * @author abhishek <your.name at your.org>
 */
public class SuppliersOrganization extends Organization{
<<<<<<< Updated upstream
    public SuppliersOrganization(){
        super(Organization.Type.Suppliers.getValue());
=======
    public SuppliersOrganization(String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        super(Organization.Type.Suppliers.getValue(), name, streetaddress, city, country, zipcode, email, phone);
>>>>>>> Stashed changes
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SuppliersRole());
        return roles;
    }
  
    
}
