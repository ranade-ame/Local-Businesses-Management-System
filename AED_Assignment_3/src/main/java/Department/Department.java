/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import Employer.EmployerDirectory;
import EmploymentHistory.EmploymentHistroy;
import Faculty.FacultyDirectory;
import Student.PersonDirectory;
import Student.StudentDirectory;
import Student.StudentProfile;
import java.util.HashMap;

/**
 *
 * @author ameya
 */
public class Department {

    public String name;
    public CourseCatalog coursecatalog;
    public PersonDirectory persondirectory;
    public StudentDirectory studentdirectory;
    public FacultyDirectory facultydirectory;
    public EmployerDirectory employerdirectory;
    public EmploymentHistroy employmenthistory;

    public HashMap<String, CourseSchedule> mastercoursecatalog;

    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<String, CourseSchedule>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
        facultydirectory = new FacultyDirectory(this);
        employerdirectory = new EmployerDirectory(this);
    }

    public EmploymentHistroy getEmploymenthistory() {
        return employmenthistory;
    }

    public void setEmploymenthistory(EmploymentHistroy employmenthistory) {
        this.employmenthistory = employmenthistory;
    }
    
    public EmployerDirectory getEmployerdirectory() {
        return employerdirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {
        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {
        return mastercoursecatalog.get(semester);
    }

    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }

    public Course newCourse(String n, String nm, int cr) {
        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {
        CourseSchedule css = mastercoursecatalog.get(semester);
        return css.calculateTotalRevenues();
    }

    public void RegisterForAClass(StudentProfile sp, String cn, String semester) {

        //StudentProfile sp = studentdirectory.findStudent(studentid);
        CourseLoad cl = sp.getCurrentCourseLoad();
        if (cl == null){
            cl = sp.newCourseLoad(semester);
        }
        CourseSchedule cs = mastercoursecatalog.get(semester);
        if (cs == null){
            cs = newCourseSchedule(semester);
        }
        CourseOffer co = cs.getCourseOfferByNumber(cn);
        if (co == null){
            co = cs.newCourseOffer(cn);
        }
        co.assignEmptySeat(cl, sp.person);

    }
    
    //        Department department = dd.newDepartment("Information Systems");
//
//        Course course = department.newCourse("Application Engineering and Development", "INFO5100", 4);
//
//        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");
//
//        CourseOffer courseoffer = courseschedule.newCourseOffer("Info5100");
//        
//        courseoffer.generatSeats(10);
//        
//        PersonDirectory pd = department.getPersonDirectory();
//        Person person = pd.newPerson("67112303", "John Wayne", "360 Huntington Ave", "6785691089", "Student");
//        StudentDirectory sd = department.getStudentDirectory();
//        StudentProfile student = sd.newStudentProfile(person);
//        CourseLoad courseload = student.newCourseLoad("Fall2020"); 
//        FacultyDirectory fd = department.getFacultydirectory();
//        EmployerDirectory ed = department.getEmployerdirectory();
//        
//        courseload.newSeatAssignment(courseoffer, person); //register student in class

}
