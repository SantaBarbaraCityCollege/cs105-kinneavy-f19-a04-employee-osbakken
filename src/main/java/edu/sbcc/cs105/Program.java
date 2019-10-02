/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Alysha Osbakken
 */
package edu.sbcc.cs105;

/**
 * This class provides first level testing the Employee object.
 *
 */
public class Program {

    /**
     * Create an employee and test that the proper name has been created. Test
     * the initial salary amount and then give the employee a raise. Then check
     * to make sure the salary matches the raised salary.
     * 
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {

    Employee testMan = new Employee("Testing McTesterson", 50000);
        
        System.out.println("Employee's name is " + testMan.getName() + " (name should be Testing McTesterson)");
        System.out.println("Salary is " + testMan.getSalary() + " (salary should be 50000)");
        testMan.raiseSalary(10);
        System.out.println("Employee's new salary is " + testMan.getSalary() + " (new salary should be 55000)");
        
}
}