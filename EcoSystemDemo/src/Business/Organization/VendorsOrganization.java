/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhishek <your.name at your.org>
 */
public class VendorsOrganization extends Organization {
    public VendorsOrganization(){
        super(Organization.Type.Vendors.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new VendorsRole());
        return roles;
    }
    
    
}
