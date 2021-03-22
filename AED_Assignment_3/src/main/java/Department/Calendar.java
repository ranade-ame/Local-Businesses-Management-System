/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

import CourseSchedule.CourseSchedule;
import java.lang.*;
import java.util.HashMap;
/**
 *
 * @author kal bugrara
 */
public class Calendar {
    
    public HashMap<String, CourseSchedule> mastercatalog; 
    //Set departmet mastercatalogue to this one and create a new print method to print
    //courses sem wise for each department
    public Calendar(Department d){
    mastercatalog = new HashMap<String, CourseSchedule>();    
    }
    
    public void addCourseSchedule(String semester, CourseSchedule cs){
        
        mastercatalog.put(semester, cs);
        
    }
    
    
    
}
