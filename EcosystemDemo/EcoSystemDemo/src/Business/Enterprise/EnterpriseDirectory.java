<<<<<<< Updated upstream
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, String streetaddress, String city, String country, int zipcode, String email, Enterprise.EnterpriseType type, String phone){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Eateries){
            enterprise = new EateriesEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Service){
            enterprise = new ServiceEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Essentials){
            enterprise = new EssentialsEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Retail){
            enterprise = new RetailEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
    
    public Enterprise getEnterprise(String name){
        for(Enterprise e : enterpriseList){
            if(e.getName().equalsIgnoreCase(name)){
                return e;
            }
        }
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

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, String streetaddress, String city, String country, int zipcode, String email, Enterprise.EnterpriseType type, String phone){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Eateries){
            enterprise = new EateriesEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Service){
            enterprise = new ServiceEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Essentials){
            enterprise = new EssentialsEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Retail){
            enterprise = new RetailEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
    
    public Enterprise getEnterprise(String name){
        for(Enterprise e : enterpriseList){
            if(e.getName().equalsIgnoreCase(name)){
                return e;
            }
        }
        return null;
    }
}
>>>>>>> Stashed changes
