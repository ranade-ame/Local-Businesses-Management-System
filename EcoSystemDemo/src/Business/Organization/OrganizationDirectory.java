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
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Cleaning.getValue())){
            organization = new CleaningOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Mechanic.getValue())){
            organization = new MechanicOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Electrician.getValue())){
            organization = new ElectricianOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Wholesale.getValue())){
            organization = new WholesaleOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Plumbing.getValue())){
            organization = new PlumbingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Suppliers.getValue())){
            organization = new SuppliersOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Vendors.getValue())){
            organization = new VendorsOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        
       
        
        
        return organization;
    }
}