import java.time.*;
import java.util.*;

/**
* This program tests the Employee class.
* @version 1.01 2021-03-18
* @author Weder Sousa
*/
class Employee {    
    private String name;
    private double salary;
    private LocalDate hireDay;

    private static int id;
    private static int idRandon;
    private static int nextId;

    // static initialization block
    static {
        Random generator = new Random(); // set nextId to a random number between 0 and 9999
        idRandon = generator.nextInt(10000);
        System.out.println(idRandon);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
        System.out.println(nextId);
    }
 
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
    
    public String getName() {
        return name;
    }

    public double getSalary(){
        return salary;
    }
    
    public LocalDate getHireDay(){
        return hireDay;
    }
 
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}