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
public class EssentialsEnterprise extends Enterprise{
<<<<<<< Updated upstream
    public EssentialsEnterprise(String name){
        super(name,EnterpriseType.Essentials);
=======
    public EssentialsEnterprise(String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        super(name,EnterpriseType.Essentials, streetaddress, city, country, zipcode, email, phone);
>>>>>>> Stashed changes
        
    }
        

    @Override
    public ArrayList<Role> getSupportedRole() {
       return null;
    }
    
    
}
