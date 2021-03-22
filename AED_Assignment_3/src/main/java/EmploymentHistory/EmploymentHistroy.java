/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmploymentHistory;

import Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class EmploymentHistroy {
    public ArrayList<Employment> employments;
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    public Employment newEmployment(String job, int weight, String quality, EmployerProfile ep){
        Employment ne = new Employment();
        ne.setEmployer(ep);
        ne.setJob(job);
        ne.setQuality(quality);
        employments.add(ne);
        return ne;
    }
    
}
