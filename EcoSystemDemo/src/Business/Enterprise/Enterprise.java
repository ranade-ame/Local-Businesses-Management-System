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
    private String name;
    private String streetaddress;
    private String country;
    private String city;
    private int zipcode;
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
    
    public Enterprise(EnterpriseType type, String name, String streetaddress, String city, String country, int zipcode){
        super(type.toString(), name, streetaddress, city, country, zipcode);
        this.enterpriseType=type;
        this.name = name;
        this.streetaddress = streetaddress;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
        organizationDirectory=new OrganizationDirectory();
    }
}
