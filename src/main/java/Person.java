import org.joda.time.DateTime;

public class Person {

    protected String firstname;
    protected String lastName;
    protected int birthYear;
    protected String email;
    protected String nationality;
    protected double baseSalary;

    public void printFullname(){
        System.out.println(firstname+" "+lastName);
    }

    public int printAge(){
        DateTime dateTime = new DateTime();
        int age = dateTime.getYear()-birthYear;
        return age;
    }

    public double printSalary(){
        return baseSalary;
    }


}

class Professor extends Person{

    private String specialization;
    private double bonusSalaryPercent;

    @Override
    public double printSalary() {
        return baseSalary + baseSalary*bonusSalaryPercent;
    }
}

class Student extends Person{

    private int id;
    private String university;
    private int yearOfStudy;

    @Override
    public double printSalary() {
        return 0;
    }
}

class Janitor extends Person{

    private double salary;
    private String lastJob;
    private double bonusSalaryPercent;

    @Override
    public double printSalary() {
        return baseSalary + baseSalary*bonusSalaryPercent;
    }
}

class SecurityGuard extends Person{

    private double salary;
    private int experience;
    private String company;
    private double bonusSalaryPercent;

    @Override
    public double printSalary() {
        return baseSalary + baseSalary*bonusSalaryPercent;
    }
}