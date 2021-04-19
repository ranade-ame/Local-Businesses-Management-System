 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"), Service("Service"), Retail("Retail"), Eateries("Eateries"), Essentials("Essentials");
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
<<<<<<< Updated upstream
    public Enterprise(String name,EnterpriseType type){
        super(name);
=======
    public Enterprise(String name,EnterpriseType type, String streetaddress, String city, String country, int zipcode, String email, String phone){
        super(type.toString(), name, streetaddress, city, country, zipcode, email, phone);
>>>>>>> Stashed changes
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
}
