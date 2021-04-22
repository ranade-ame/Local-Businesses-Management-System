/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TransportRole;
import java.util.ArrayList;

/**
 *
 * @author abhishek <your.name at your.org>
 */
public class TransportOrganization extends Organization{
    public TransportOrganization(String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        super(Organization.Type.Transport.getValue(), name, streetaddress, city, country, zipcode, email, phone);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportRole());
        return roles;
    }
    
}
