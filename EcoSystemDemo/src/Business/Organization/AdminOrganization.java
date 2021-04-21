<<<<<<< Updated upstream
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AdminOrganization extends Organization{

    public AdminOrganization(String name, String streetaddress, String city, String country, int zipcode, String email, String phone) {
        super(Type.Admin.getValue(), name, streetaddress, city, country, zipcode, email, phone);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
     
}
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AdminOrganization extends Organization{

    public AdminOrganization(String name, String streetaddress, String city, String country, int zipcode, String email, String phone) {
        super(Type.Admin.getValue(), name, streetaddress, city, country, zipcode, email, phone);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
     
}
>>>>>>> Stashed changes
