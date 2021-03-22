/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmploymentHistory;

import CourseSchedule.CourseOffer;
import Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class Employment {
    public ArrayList<CourseOffer> relevantcourseoffers;
    public int weight;
    public String quality;
    public String job;
    //public Employment nextemplyment;  //next job so they are in a sequence 
    
    public EmployerProfile employer;
    
    public Employment(){
        ArrayList relevantcourseoffers = new ArrayList<CourseOffer>();
    }

    public ArrayList<CourseOffer> getRelevantcourseoffers() {
        return relevantcourseoffers;
    }

    public void setRelevantcourseoffers(ArrayList<CourseOffer> relevantcourseoffers) {
        this.relevantcourseoffers = relevantcourseoffers;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public EmployerProfile getEmployer() {
        return employer;
    }

    public void setEmployer(EmployerProfile employer) {
        this.employer = employer;
    }
    
    

}
