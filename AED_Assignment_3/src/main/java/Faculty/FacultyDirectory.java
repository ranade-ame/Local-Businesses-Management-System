/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import Student.*;
import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class FacultyDirectory {

    Department department;
    public ArrayList<FacultyProfile> teacherlist;

    public FacultyDirectory(Department d) {

        department = d;
        teacherlist = new ArrayList();

    }

    public FacultyProfile newFacultyProfile(Person p) {

        FacultyProfile sp = new FacultyProfile(p);
        teacherlist.add(sp);
        return sp;
    }

    public ArrayList<FacultyProfile> getTeacherlist() {
        return teacherlist;
    }
    
    

    public FacultyProfile findTeachingFaculty(String id) {

        for (FacultyProfile sp : teacherlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
