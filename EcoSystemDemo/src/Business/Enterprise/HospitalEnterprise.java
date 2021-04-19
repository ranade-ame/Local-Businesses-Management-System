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
 * @author MyPC1
 */
public class HospitalEnterprise extends Enterprise {
    
<<<<<<< Updated upstream
    public HospitalEnterprise(String name){
        super(name,EnterpriseType.Hospital);
=======
    public HospitalEnterprise(String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        super(name,EnterpriseType.Hospital, streetaddress, city, country, zipcode, email, phone);
>>>>>>> Stashed changes
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
