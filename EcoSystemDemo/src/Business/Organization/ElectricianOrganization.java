/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ElectricianRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class ElectricianOrganization extends Organization{

    public ElectricianOrganization() {
        super(Organization.Type.Electrician.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ElectricianRole());
        return roles;
    }
    
}
