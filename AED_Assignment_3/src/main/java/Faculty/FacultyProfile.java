/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import Student.*;
import CourseSchedule.CourseOffer;
import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class FacultyProfile {

    public Person person;
    public ArrayList <FacultyAssignment> facultyassignments; 

    public FacultyProfile(Person p) {

        person = p;
        facultyassignments = new ArrayList();
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public boolean isMatch(String id) {
        if (person.getId().equals(id)) {
            return true;
        }
        return false;
    }

    
    
}
