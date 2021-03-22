package AED_Assignment_3;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
////package Main;
////
import com.github.javafaker.Faker;
import CourseCatalog.Course;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import CourseSchedule.Seat;
import CourseSchedule.SeatAssignment;
import Department.Calendar;
import Department.College;
import Department.Department;
import Department.DepartmentDirectory;
import Employer.EmployerDirectory;
import Employer.EmployerProfile;
import EmploymentHistory.Employment;
import EmploymentHistory.EmploymentHistroy;
import Faculty.FacultyAssignment;
import Faculty.FacultyDirectory;
import Faculty.FacultyProfile;
import Student.Person;
import Student.PersonDirectory;
import Student.StudentDirectory;
import Student.StudentProfile;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;
//
///**
// *
// * @author ameya
// */
public class Main {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public static void main(String[] args) {
        College coe = new College("College of Engineering");
        DepartmentDirectory dd = coe.newdeptdir();//new DepartmentDirectory();
        dd = generateDepts(dd);
        generateCourses(dd);
        
        for (Department d : dd.departmentlist){
            PersonDirectory pd1 = d.getPersonDirectory();
            StudentDirectory sd1 = d.getStudentDirectory();
            FacultyDirectory fd1 = d.getFacultydirectory();
            EmployerDirectory ed1 = d.getEmployerdirectory();
            
            generatePersons(pd1, sd1, fd1, ed1);
            generateCourseSchedule(d, sd1, fd1);
            assignStudents(d, sd1);
            generateEmployments(d);
            Calendar cal = new Calendar(d);
            cal.mastercatalog = d.mastercoursecatalog;
            
        }
        
        int runcount = 0;
        Scanner scuser = new Scanner(System.in);
        while (runcount == 0){
            System.out.println("___________________________________________");
            System.out.println("1. Person Information\n2. Department Information\n3. Calculate Revenue\n4. Employments\n5. Calendar\n0.Exit");
            int usrinp1 = scuser.nextInt();
            if (usrinp1 == 1) {
                System.out.println("1. List of students\n2. List of faculty\n3. List of Employers\n4. List of all Persons");
                int usrinp2 = scuser.nextInt();
                if (usrinp2 == 1){
                    printStudents(dd);
                }
                else if(usrinp2 == 2){
                    printFaculty(dd);
                }
                else if(usrinp2 == 3){
                    printEmployers(dd);
                }
                else if(usrinp2 == 4){
                    printAllPerson(dd);
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
            else if(usrinp1 == 2){
                System.out.println("\n__________________________________Department Info - START__________________________________\n");
                printDeptInfo(dd, scuser);
            }
            else if(usrinp1 == 3){
                System.out.println("1. Total Revenue\n2. Revenue per Semester\n3. Revenue per Department");
                int usrinp3 = scuser.nextInt();
                if (usrinp3 == 1){
                    calculateTotalRevenue(dd);
                }
                else if (usrinp3 == 2){
                    calculateRevenuebySem(dd);
                }
                else if (usrinp3 == 3){
                    calculateRevenuebyDept(dd);
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
            else if(usrinp1 == 4){
                printJobs(dd);
            }
            else if(usrinp1 == 5){
                printCalendar(dd);
            }
            else if(usrinp1 == 0){
                runcount = 1;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }

    public static void generatePersons(PersonDirectory pd, StudentDirectory sd, FacultyDirectory fd, EmployerDirectory ed){
        Faker faker = new Faker();
        String[] names = {};
        String[] idnumbers = {};
        String[] addresses = {};
        String[] phonenums = {};
        String[] empnames = {};
        int x = 0;
        
        while(x < 100){
            String name = faker.name().fullName();
            String idnum = faker.number().digits(9);
            String addr = faker.address().streetAddress();
            String phonenum = faker.number().digits(10);
            String emp = faker.company().name();
            names = ArrayUtils.add(names,name);
            idnumbers = ArrayUtils.add(idnumbers,idnum);
            addresses = ArrayUtils.add(addresses, addr);
            phonenums = ArrayUtils.add(phonenums, phonenum);
            empnames = ArrayUtils.add(empnames, emp);  
            x++;
        }
        
        int y =0;
        while (y < 50){
            Person p = pd.newPerson(idnumbers[y], names[y], addresses[y], phonenums[y], "Student"); 
            y++;
        }
        
        int z = 0;
        while (z < 10){
            Person p = pd.newPerson(idnumbers[z], names[z], addresses[z], phonenums[z], "Faculty");
            z++;
        }
        
        int a = 0;
        while(a < 20){
            Person p = pd.newPerson(idnumbers[a], empnames[a], addresses[a], phonenums[a], "Employer");
            a++;
        }
        
        for (Person p1 : pd.getPersonlist()){
            if (p1.getRole().equalsIgnoreCase("student")){
                StudentProfile sp = sd.newStudentProfile(p1);
            }
            else if (p1.getRole().equalsIgnoreCase("faculty")){
                FacultyProfile fp = fd.newFacultyProfile(p1);
            }
            else if ((p1.getRole().equalsIgnoreCase("employer"))){
                EmployerProfile ep = ed.newEmployerProfile(p1);
            }
        }
    }
    
    public static DepartmentDirectory generateDepts(DepartmentDirectory dd){
        String[] deptnames = {"Information Systems", "BioEngineering", "Chemical Engineering", "Civil and Environmental Engineering","Electrical and Computer Engineering", "Mechanical Engineering"};
        int x = 0;
        while (x < deptnames.length){
            Department dept = dd.newDepartment(deptnames[x]);
            x++;
        }
        return dd;
    }
    
    public static void generateCourses(DepartmentDirectory dd){
        Faker faker = new Faker();
        String[] infosyssubs = {"Application Engineering and Development", "Object Oriented Programming", "Program Structure and Algorithms", "Database Management and Design", "Data Sciene Engineering and Methods", "Advances in Data Science", "Data Warehousing and Business Intelligence", "Web Design", "Project Management for Engineers", "Neural Networks", "Advances in AI"};
        String[] bioengsubs = {"Bioinformatics","Bioinstrumentation", "Biomaterials", "Biomechanics", "Biosignal Processing", "Biotechnology", "Clinical Engineering", "Medical Imaging", "Microtechnology and Nanotechnology", "Neural Systems and Engineering", "Orthopedic Bioengineering", "Rehabilitation Engineering", "Robotics in Surgery", "Systems Physiology"};
        String[] chemeng = {"Fundamentals of Heat and Mass Transfer","Process Fluid Mechanics","Environmental Studies","Introduction to Numerical Analysis", "Environmental Engineering", "General Chemistry", "Organic Chemistry", "Reactor Design", "Reactor Kinetics", "Physical Chemistry", "Thermodynamics"};
        String[] civeng =  {"Construction Engineering","Geotechnical Engineering","Structural Engineering","Coastal and Ocean Engineering","Transportation engineering", "Water Resource Engineering", "Waste Management", "Structural Design", "Structural Analysis", "Hydraulics and Hydrology", "Mechanics of Materials"};
        String[] eleceng =  {"Electro-magnetism","Control systems","Electricity Technology and Machines","Circuit Analysis", "Electronics","Electrical Engineering ","Material Transmission & Distribution", "Electrical Machines", "Power Systems", "Control System", "Engineering Mathematics", "Microprocessors", "Engineering Mathematics"};
        String[] mecheng = {"Structural materials","Solid mechanics","Thermodynamics","Thermofluids"};
        
        Department d0 = dd.departmentlist.get(0);
        int y0 = 0;
        while(y0 < infosyssubs.length){
            Course c0 = d0.newCourse(infosyssubs[y0], "INFO" + faker.number().digits(4), 4);
            y0++;
        }
        
        Department d1 = dd.departmentlist.get(1);
        int y1 = 0;
        while(y1 < bioengsubs.length){
            Course c1 = d1.newCourse(bioengsubs[y1], "BIO" + faker.number().digits(4), 4);
            y1++;
        }
        
        Department d2 = dd.departmentlist.get(2);
        int y2 = 0;
        while(y2 < chemeng.length){
            Course c2 = d2.newCourse(chemeng[y2], "CHEM" + faker.number().digits(4), 4);
            y2++;
        }
        
        Department d3 = dd.departmentlist.get(3);
        int y3 = 0;
        while(y3 < civeng.length){
            Course c3 = d3.newCourse(civeng[y3], "CIV" + faker.number().digits(4), 4);
            y3++;
        }
        
        Department d4 = dd.departmentlist.get(4);
        int y4 = 0;
        while(y4 < eleceng.length){
            Course c4 = d4.newCourse(eleceng[y4], "ELE" + faker.number().digits(4), 4);
            y4++;
        }
        
        Department d5 = dd.departmentlist.get(5);
        int y5 = 0;
        while(y5 < mecheng.length){
            Course c5 = d5.newCourse(mecheng[y5], "MECH" + faker.number().digits(4), 4);
            y5++;
        }
        
    }
    
    public static void generateCourseSchedule(Department d, StudentDirectory sd, FacultyDirectory fd){
        Faker faker = new Faker();
        String[] sems = {"Fall 2020", "Spring 2021", "Fall 2021", "Spring 2022"};
        int x = 0;
        while(x < sems.length){
            CourseSchedule cs = d.newCourseSchedule(sems[x]);
            for(Course c : d.coursecatalog.courselist){
                int numofseats = faker.number().numberBetween(10, 50);
                CourseOffer co1 = cs.newCourseOffer(c.getCOurseNumber());
                co1.generatSeats(numofseats);
                co1.AssignAsTeacher(fd.teacherlist.get(faker.number().numberBetween(0, fd.teacherlist.size())));
            }
            x++;
        }
    }
    
    public static void assignStudents(Department d, StudentDirectory sd){
        Faker faker = new Faker();
        String[] sems = {"Fall 2020", "Spring 2021", "Fall 2021", "Spring 2022"};
        int x = 0;
        while(x < sems.length){
            CourseSchedule cs = d.getCourseSchedule(sems[x]);
            for(Course c : d.coursecatalog.courselist){
                CourseOffer co1 = cs.getCourseOfferByNumber(c.getCOurseNumber());
                int numofseats = co1.seatlist.size();
                int y = 0;
                while (y < numofseats){
                    StudentProfile sp1 = sd.studentlist.get(faker.number().numberBetween(0, sd.studentlist.size()));
                    sp1.employmenthistory = new EmploymentHistroy();
                    int r = 0;
                    while(r < faker.number().numberBetween(1, 5)){
                        Employment e = new Employment();
                        e.setJob(faker.job().title());
                        e.setEmployer(d.employerdirectory.employerlist.get(faker.number().numberBetween(0, d.employerdirectory.employerlist.size())));
                        e.setQuality(faker.job().field());
                        e.setWeight(faker.number().randomDigit());
                        sp1.employmenthistory.employments.add(e);
                        r++;
                    }
                    
                    if (sp1.getCourseLoadBySemester(sems[x]) == null){
                        CourseLoad cl1 = sp1.newCourseLoad(sems[x]);
                    }
                    else {
                        CourseLoad cl1 = sp1.getCurrentCourseLoad();
                    }
                    boolean studentalreadyincourse = false;
                    for (Seat s: co1.seatlist){
                        s.setGpa(faker.number().randomDouble(2, 3, 4));
                        if (s.person == null){
                            break;
                        }
                        else if (s.person.getId() == sp1.person.getId()){
                            studentalreadyincourse = true;
                        }
                    }
                    if (studentalreadyincourse == false){
                        CourseLoad cl2 = sp1.getCurrentCourseLoad();
                        cl2.newSeatAssignment(co1, sp1.person);//co1.assignEmptySeat(cl1, sp1.person);
                    }
                    y++;
                }
            }
            x++;
        }
    }
    
    public static void printStudents(DepartmentDirectory dd){
        System.out.println("\n__________________________________Students Info - START__________________________________\n");
        int x = 1;
        for (Department d: dd.departmentlist){
            System.out.println(x + ". " + d.name);
            x++;
        }
        Scanner scuser = new Scanner(System.in);
        System.out.println("\nSelect a department: \n0. Exit");
        String[] sems = {"Fall 2020", "Spring 2021", "Fall 2021", "Spring 2022"};
        int usrinp = scuser.nextInt();
        if (usrinp > 0){
            Department d1 = dd.departmentlist.get(usrinp - 1);
        //for (Department d1: dd.departmentlist){
            
            for (StudentProfile s1: d1.studentdirectory.studentlist){
                
                System.out.println("\n___________________________________________");
                System.out.println("Student Name: " + s1.person.getName());
                System.out.println("Student ID: " + s1.person.getId()); 
            }
            int y = 0;
            while (y == 0){
                Scanner scuser1 = new Scanner(System.in);
                System.out.println("\nSelect a student (Enter Student ID)\n0. Exit");
                String usrinp2 = scuser1.nextLine();
                StudentProfile s1 = d1.studentdirectory.findStudent(usrinp2);
                if(usrinp2.equalsIgnoreCase("0")){
                    y++;
                    break;
                }
                if (s1 == null){
                    System.out.println("Student Records not found");
                }
                else {
                    System.out.println("Student Name: " + s1.person.getName());
                    System.out.println("Student ID: " + s1.person.getId()); 
                    System.out.println("Student's Department: " + d1.name);
                    System.out.println("Student Contact Number: " + s1.person.getPhonenumber());
                    System.out.println("Student Address: " + s1.person.getAddress());
                    int b = 0;
                    double finalGPA = 0;
                    int semcount = 0;
                    while(b < sems.length){
                        CourseLoad cl1 = s1.getCourseLoadBySemester(sems[b]);
                        if (cl1 == null){
                            System.out.println("No CourseLoad in Semester: " + sems[b]);
                            break;
                        }
                        else{
                            semcount++;
                            System.out.println("_____________");
                            System.out.println("\nSemester :" + sems[b]);
                            double overallGPA = 0;
                            System.out.println("Student's Courses: \n");
                            int i = 1;
                            for (SeatAssignment sa: cl1.seatassignments){
                                System.out.println(i + ". " + sa.seat.courseoffer.course.getName());
                                System.out.println("- Score: " + sa.seat.getGpa());
                                overallGPA = overallGPA + sa.seat.getGpa();
                                i++;
                            }
                            overallGPA = overallGPA/cl1.seatassignments.size();
                            System.out.println("_____________");
                            System.out.println("\nStudent GPA in this semester = " + df2.format(overallGPA));
                            finalGPA = finalGPA + overallGPA;
                        }
                        b++;
                    }
                    finalGPA = finalGPA/semcount;
                    System.out.println("_____________");
                    System.out.println("\nStudent's final GPA = " + df2.format(finalGPA));
                    System.out.println("_____________\n");
                    System.out.println("Employment History: ");
                    int i = 1;
                    for (Employment e: s1.employmenthistory.employments){
                        System.out.println(i + ". Employer Name: " + e.employer.person.getName());
                        System.out.println("- Job : " + e.job);
                        i++;
                    }
                    System.out.println("___________________________________________");
                }
            }
        }
        System.out.println("__________________________________Students Info - END__________________________________");
    }
    
    public static void printFaculty(DepartmentDirectory dd){
        System.out.println("\n__________________________________Faculty Info - START__________________________________\n");
        String[] sems = {"Fall 2020", "Spring 2021", "Fall 2021", "Spring 2022"};
            for(Department d2: dd.departmentlist){
                int c = 0;
                while (c < sems.length){
                    CourseSchedule cs1 = d2.getCourseSchedule(sems[c]);
                    for (CourseOffer co1 : cs1.schedule){
                        System.out.println("\n___________________________________________");
                        System.out.println("\nFaculty Name: " + co1.facultyassignment.facultyprofile.person.getName());
                        System.out.println("Faculty ID: " + co1.facultyassignment.facultyprofile.person.getId());
                        System.out.println("Faculty's Department: " + d2.name);
                        System.out.println("Faculty's Course: "+ co1.course.getName() + " - " + co1.getCourseNumber());
                        System.out.println("Faculty Contact Number: " + co1.facultyassignment.facultyprofile.person.getPhonenumber());
                        System.out.println("Faculty Address: " + co1.facultyassignment.facultyprofile.person.getAddress());
                        System.out.println("\n___________________________________________");
                    }
                c++;
            }  
        }
        System.out.println("\n__________________________________Faculty Info - END__________________________________\n");
    }
    
    public static void printEmployers(DepartmentDirectory dd){
        System.out.println("\n__________________________________Employer Info - START__________________________________\n");
        for(Department d3 : dd.departmentlist){
            for(EmployerProfile ep1 : d3.employerdirectory.employerlist){
                System.out.println("\n___________________________________________");
                System.out.println("\nEmployer Name: " + ep1.person.getName());
                System.out.println("Emplyer ID: " + ep1.person.getId());
                System.out.println("Employer Contact Number: " + ep1.person.getPhonenumber());
                System.out.println("Employer Address: " + ep1.person.getAddress());
                System.out.println("\n___________________________________________");
            }
        }
        System.out.println("\n__________________________________Employer Info - END__________________________________\n"); 
    }
    
    public static void printAllPerson(DepartmentDirectory dd){
        System.out.println("__________________________________Person Info - START__________________________________");
        for (Department d4: dd.departmentlist){
            for(Person p1: d4.persondirectory.personlist){
                System.out.println("\n___________________________________________");
                System.out.println("\nName: " + p1.getName());
                System.out.println("Id: " + p1.getId());
                System.out.println("Role: " + p1.getRole());
                System.out.println("Contact Number: " + p1.getPhonenumber());
                System.out.println("Address: " + p1.getAddress());
                System.out.println("\n___________________________________________");
            }
        }
        System.out.println("__________________________________Person Info - END__________________________________");
    }
    
    public static void printDeptInfo(DepartmentDirectory dd, Scanner scuser){
        int e = 1;
        for (Department d: dd.departmentlist){

            System.out.println(e + ". Department Name: " + d.name);
            e++;
        }
        System.out.println("___________________________________________");
        System.out.println("\nSelect a department");
        int usrinp3 = scuser.nextInt();
        int c = 0;
        while (c == 0){
            Department d1 = dd.departmentlist.get(usrinp3 -1);
            String[] sems = {"Fall 2020", "Spring 2021", "Fall 2021", "Spring 2022"};

            int a1 = 0;
            while (a1 == 0){
                int f = 0;
                System.out.println("___________________________________________");
                System.out.println("\nSemesters:");
                while(f < sems.length){    
                    System.out.println((f + 1) + ". Semester: " + sems[f]);
                    f++;
                }
                System.out.println("\nSelect a semester\nEnter 0 to go back");
                int usrinp4 = scuser.nextInt();
                if (usrinp4 == 0){
                    a1++;
                    c++;
                }
                else {
                    String sem = sems[(usrinp4 - 1)];
                    System.out.println("\nSemester: " + sem);
                    CourseSchedule cs1 = d1.getCourseSchedule(sem);
                    for (CourseOffer co1 : cs1.schedule){
                        System.out.println("___________________________________________");
                        System.out.println("Course Name: " + co1.course.getName());
                        System.out.println("Course Number: " + co1.course.getCOurseNumber());
                        System.out.println("Course Credits " + co1.course.getCredits());
                        System.out.println("Course Faculty: " + co1.getFacultyProfile().person.getName());
                        System.out.println("No. of seats: " + co1.seatlist.size());
                        System.out.println("Currently enrolled students:\n");
                        int r = 1;
                        for(Seat s : co1.seatlist){
                            if(s.person == null){
                                break;
                            }
                            else {
                                System.out.println(r + ". Student Name: " + s.person.getName());
                                r++;
                            }
                        }
                        System.out.println("___________________________________________\n");
                    }
                }
            }


        }
    }

    private static void calculateTotalRevenue(DepartmentDirectory dd){
        System.out.println("___________________________________________");
        int totalrevenue = 0;
        for (Department d : dd.departmentlist){
            String[] sems = {"Fall 2020", "Spring 2021", "Fall 2021", "Spring 2022"};
            int x = 0;
            while(x < sems.length){
                int deptRevenue = d.calculateRevenuesBySemester(sems[x]);
                totalrevenue = totalrevenue + deptRevenue;
                x++;
            }
           
        }
        System.out.println("\nTotal Revenue of college = " + totalrevenue);
        System.out.println("___________________________________________");
        
    }

    private static void calculateRevenuebyDept(DepartmentDirectory dd){
        String[] sems = {"Fall 2020", "Spring 2021", "Fall 2021", "Spring 2022"};
        System.out.println("___________________________________________");
        for (Department d : dd.departmentlist){
            System.out.println("\nDepartment: " + d.name);
            int deptRevenue = 0;
            int x = 0;
            while (x < sems.length){
                int semRevenue = d.calculateRevenuesBySemester(sems[x]);
                deptRevenue = deptRevenue + semRevenue;
                x++;
            }
            System.out.println("Revenue = " + deptRevenue);
            System.out.println("\n___________________________________________");            
        }
        
    }

    private static void calculateRevenuebySem(DepartmentDirectory dd) {
        String[] sems = {"Fall 2020", "Spring 2021", "Fall 2021", "Spring 2022"};
        int x = 0;
        System.out.println("\n___________________________________________");
        while (x < sems.length){
            int semRevenue = 0;
            System.out.println("Semester: " + sems[x]);
            for (Department d : dd.departmentlist){
                int deptRevenue = d.calculateRevenuesBySemester(sems[x]);
                semRevenue = semRevenue + deptRevenue;
            }
            System.out.println("Revenue in sem " + sems[x] + " = " + semRevenue);
            System.out.println("\n___________________________________________");
            x++;
        }
    }

    private static void generateEmployments(Department d) {
        Faker faker = new Faker();
        EmploymentHistroy newEH = new EmploymentHistroy();
        for (EmployerProfile ep : d.employerdirectory.employerlist){
            Employment newJob = new Employment();//newEH.newEmployment(faker.job().title(), faker.number().numberBetween(0, 10), faker.job().field(), ep);
            newJob.setJob(faker.job().title());
            newJob.setEmployer(ep);
            newJob.setQuality(faker.job().field());
            newJob.setWeight(faker.number().randomDigit());
            ep.employments.add(newJob);
            newEH.employments.add(newJob);
            ArrayList<CourseOffer> relcourseoffers = new ArrayList<CourseOffer>();
            int x = 0;
            while(x < faker.number().numberBetween(3, 7)){
                CourseOffer co = d.getCourseSchedule("Fall 2020").schedule.get(faker.number().numberBetween(0, d.getCourseSchedule("Fall 2020").schedule.size()));
                relcourseoffers.add(co);
                x++;
            }
            newJob.setRelevantcourseoffers(relcourseoffers);
        }
        d.setEmploymenthistory(newEH);
    }

    private static void printJobs(DepartmentDirectory dd) {
        System.out.println("___________________________________________");
        int b = 0;
        while(b == 0){
            
            int a = 1;
            for (Department d1: dd.departmentlist){
                System.out.println(a + ". " + d1.name);
                a++;
            }
            System.out.println("\nSelect a Department\n0. Exit");
            Scanner scuser1 = new Scanner(System.in);
            int usrinp = scuser1.nextInt();
            if (usrinp == 0){
                b++;
                break;
            }
            Department d = dd.departmentlist.get(usrinp - 1);
            System.out.println("\nJob offer for students in " + d.name);
            int y = 1;
            for(Employment e : d.employmenthistory.employments){
                System.out.println("_____________\n");
                System.out.println("Employer Name: " + e.employer.person.getName());
                System.out.println("Job Offer: " + e.job);
                System.out.println("Relevant Courses: ");
                int x = 1;
                for (CourseOffer co : e.relevantcourseoffers){
                    System.out.println("\t" + x + ". Course Name: " + co.course.getName());
                    System.out.println("\t- Course Number: " + co.getCourseNumber());
                    System.out.println("\t- Faculty: " + co.facultyassignment.facultyprofile.person.getName());
                    x++;
                }
            }
            System.out.println("_____________\n");
        }
    }

    private static void printCalendar(DepartmentDirectory dd) {
        int x = 1;
        String[] sems = {"Fall 2020", "Spring 2021", "Fall 2021", "Spring 2022"};
        for (Department d: dd.departmentlist){
            System.out.println(x + ". " + d.name);
            x++;
        }
        System.out.println("\nSelect a Department: \n0. Exit");
        Scanner sc = new Scanner(System.in);
        int usrinp = sc.nextInt();
        if (usrinp > 0){
            Department d = dd.departmentlist.get(usrinp - 1);
            System.out.println("\nDepartment Name: " + d.name);
            int y = 0;
            while (y < sems.length){
                CourseSchedule cs = d.getCourseSchedule(sems[y]);
                System.out.println("_____________\n");
                System.out.println("\nSemester: " + sems[y]);
                for(CourseOffer co: cs.schedule){
                    System.out.println("_____________");
                    System.out.println("\nCourse Name: " + co.course.getName());
                    System.out.println("Course Number: " + co.course.getCOurseNumber());
                    System.out.println("Faculty: " + co.facultyassignment.facultyprofile.person.getName());
                    System.out.println("Number of seats: " + co.seatlist.size());
                }
                y++;
            }
        }
    }
    
    
    
}

