/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;



/**
 *
 * @author RicaChristineDebuayan-PN25
 */
public class Customer {
    
    //declaring first,middle and last name
    private String Fname;
    private String Mname;
    private String Lname;

    //default constructor
    public Customer() {
    }

    //constructor with 3 parameters
    public Customer(String Fname, String Mname, String Lname) {
        this.Fname = Fname;
        this.Mname = Mname;
        this.Lname = Lname;
    }
    
    //getters&setters
    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }
    

    public String getMname() {
        return Mname;
    }

    public void setMname(String Mname) {
        this.Mname = Mname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    @Override
    public String toString() {
        return Fname+" "+Mname+" "+Lname;
    }
    
    
    
}
