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
    public SuppliersOrganization(String name, String streetaddress, String city, String country, int zipcode){
        super(Organization.Type.Suppliers.getValue(), name, streetaddress, city, country, zipcode);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SuppliersRole());
        return roles;
    }
  
    
}
