/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Cleaning.getValue())){
            organization = new CleaningOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Mechanic.getValue())){
            organization = new MechanicOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Electrician.getValue())){
            organization = new ElectricianOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Wholesale.getValue())){
            organization = new WholesaleOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Plumbing.getValue())){
            organization = new PlumbingOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Suppliers.getValue())){
            organization = new SuppliersOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Vendors.getValue())){
            organization = new VendorsOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Factories.getValue())){
            organization = new FactoriesOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new TransportOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }

        return organization;
    }
    
    public void removeOrganization(Organization org){
        organizationList.remove(org);
    }
    
    public Organization getOrganization(String name){
        for(Organization o : organizationList){
            if(o.getName().equalsIgnoreCase(name)){
                return o;
            }
        }
        return null;
    }
}