/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MechanicRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class MechanicOrganization extends Organization{

<<<<<<< Updated upstream
    public MechanicOrganization() {
        super(Organization.Type.Mechanic.getValue());
=======
    public MechanicOrganization(String name, String streetaddress, String city, String country, int zipcode, String email, String phone) {
        super(Organization.Type.Mechanic.getValue(), name, streetaddress, city, country, zipcode, email, phone);
>>>>>>> Stashed changes
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MechanicRole());
        return roles;
    }
    
}
