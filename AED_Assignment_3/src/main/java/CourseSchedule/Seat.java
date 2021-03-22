/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import Student.Person;

/**
 *
 * @author ameya
 */
public class Seat {
    
    public Person person;
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment;
    public CourseOffer courseoffer;
    double gpa;
    double overallGPA;
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = false;
        
    }

    public double getOverallGPA() {
        return overallGPA;
    }

    public void setOverallGPA(double overallGPA) {
        this.overallGPA = overallGPA;
    }
    
    
    
    public Boolean isOccupied(){
        return occupied;

    }
    public SeatAssignment newSeatAssignment(Person p){
        
        this.person = p;
        seatassignment = new SeatAssignment(); //links seatassignment to seat
        occupied = true;   
        return seatassignment;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
    
}
