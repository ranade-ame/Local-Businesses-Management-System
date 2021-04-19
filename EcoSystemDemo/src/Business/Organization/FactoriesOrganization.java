/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FactoriesRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhishek <your.name at your.org>
 */
public class FactoriesOrganization extends Organization {
<<<<<<< Updated upstream
    public FactoriesOrganization(){
        super(Organization.Type.Factories.getValue());
=======
    public FactoriesOrganization(String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        super(Organization.Type.Factories.getValue(), name, streetaddress, city, country, zipcode, email, phone);
>>>>>>> Stashed changes
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new FactoriesRole());
        return roles;
    }
    
}
