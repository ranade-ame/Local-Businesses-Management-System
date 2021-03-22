/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class PersonDirectory {
    
      public ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList();

    }

    public Person newPerson(String id, String name, String address, String phonenum, String role) {

        Person p = new Person();
        p.setId(id);
        p.setAddress(address);
        p.setName(name);
        p.setPhonenumber(phonenum);
        p.setRole(role);
        personlist.add(p);
        return p;
    }

    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }

    
    
    
    
}
