/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class ServiceEnterprise extends Enterprise{

    public ServiceEnterprise(String name, String streetaddress, String city, String country, int zipcode) {
        super(EnterpriseType.Service, name, streetaddress, city, country, zipcode);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
