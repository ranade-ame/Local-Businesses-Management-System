<<<<<<< Updated upstream
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
public class EateriesEnterprise extends Enterprise {
    public EateriesEnterprise(String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        super(name,EnterpriseType.Eateries, streetaddress, city, country, zipcode, email, phone);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
=======
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
public class EateriesEnterprise extends Enterprise {
    public EateriesEnterprise(String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        super(name,EnterpriseType.Eateries, streetaddress, city, country, zipcode, email, phone);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
>>>>>>> Stashed changes
