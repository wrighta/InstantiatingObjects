// NOTE The Programmer Class is in the same package as the class that contains the main method.
package com.company;

//Class Declaration - this line is saying this block of code is a class named Programmer
public class Programmer {

    // Instance variables - every programmer object that is created from this class will have
    // values for these variables.
    // they are private so only directly accessible within this class, if you need to get/set these values outside this class
    // you will have the call the appropriate get/set method.
    private String name;
    private String email;
    private int staffNumber;
    private double salary;

    // Constructor - special method called using the new keyword to instantiate objects - (create Programmer objects)
    // note: no return type not even void, and constructor must have the same name as the class
    public Programmer(String n, String e, int sn, double sl) {
        this.name = n;
        this.email = e;
        this.staffNumber = sn;
        this.salary = sl;
    }

    // Get methods - accepts no parameter, return datatype is that of the variable requested
    public String getName() {
        return name;
    }

    // set methods - new parameter to set the instance variable is passed in, no return type.
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
} // End of the Programmer Class.

