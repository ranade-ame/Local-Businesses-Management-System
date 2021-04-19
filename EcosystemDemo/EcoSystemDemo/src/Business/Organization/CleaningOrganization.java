/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CleaningRole;
import Business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class CleaningOrganization extends Organization{

    public CleaningOrganization(String name, String streetaddress, String city, String country, int zipcode, String email, String phone) {
        super(Organization.Type.Cleaning.getValue(), name, streetaddress, city, country, zipcode, email, phone);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CleaningRole());
        return roles;
    }
    
}
