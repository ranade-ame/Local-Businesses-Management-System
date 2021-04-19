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
 * @author abhishek <your.name at your.org>
 */
public class RetailEnterprise extends Enterprise{
<<<<<<< Updated upstream
    public RetailEnterprise(String name) {
    super(name,EnterpriseType.Retail);
=======
    public RetailEnterprise(String name, String streetaddress, String city, String country, int zipcode, String email, String phone) {
    super(name,EnterpriseType.Retail, streetaddress, city, country, zipcode, email, phone);
>>>>>>> Stashed changes
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
