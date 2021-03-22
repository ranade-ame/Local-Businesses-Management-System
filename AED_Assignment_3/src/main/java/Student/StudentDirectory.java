/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class StudentDirectory {

    Department department;
    public ArrayList<StudentProfile> studentlist;

    public StudentDirectory(Department d) {

        department = d;
        studentlist = new ArrayList();

    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public ArrayList<StudentProfile> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<StudentProfile> studentlist) {
        this.studentlist = studentlist;
    }
    

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
