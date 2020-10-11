package com.company;

public class Main {

    public static void main(String[] args)
    {
        // instantiate a com.company.Programmer object - call the com.company.Programmer constructor and pass the values for the programmer.
        Programmer p1 = new Programmer("Joe", "Joe@iadt.ie", 11221, 70000.00);

        // call the getName() method in com.company.Programmer and output the returned value to the screen.
        System.out.println("Name of com.company.Programmer is " + p1.getName());

        // change the name for p1 - you must call the setName() method, you cannot access name directly because it is private.
        p1.setName("Jim Bob");

        // prove it has changed by calling getName() again.
        System.out.println("Name of com.company.Programmer is now " + p1.getName());

        // Now try calling all at get and set methods similar to the example above.
    }
}
