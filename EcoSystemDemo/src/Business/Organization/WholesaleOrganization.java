/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CleaningRole;
import Business.Role.Role;
import Business.Role.WholesaleRole;
import java.util.ArrayList;

/**
 *
 * @author abhishek <your.name at your.org>
 */
public class WholesaleOrganization extends Organization {
    
    public WholesaleOrganization(String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        super(Organization.Type.Wholesale.getValue(), name, streetaddress, city, country, zipcode, email, phone);
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WholesaleRole());
        return roles;
    }
}
