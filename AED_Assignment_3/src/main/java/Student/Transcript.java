/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import CourseSchedule.CourseLoad;
import java.util.HashMap;

/**
 *
 * @author ameya
 */
public class Transcript {
    
    
    public HashMap<String, CourseLoad> courseloadlist;
    
    public  CourseLoad currentcourseload;
    
    public Transcript(){
        
        courseloadlist = new HashMap<String, CourseLoad>();
        
    }
    
    public CourseLoad newCourseLoad(String sem){
        
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad(){
        
        return currentcourseload;
        
    }
    
    public CourseLoad getCourseLoadBySemester(String semester){
        
        return courseloadlist.get(semester);
        
    }
}
