public class Person {

    protected String firstname;
    protected String lastName;
    protected int age;
    protected String email;
    protected String nationality;

    public void printFullname(){
        System.out.println(firstname+" "+lastName);
    }

}

class Professor extends Person{

    private String specialization;
    private double salary;

}

class Student extends Person{

    private int id;
    private String university;
    private int yearOfStudy;

}

class Janitor extends Person{

    private double salary;
    private String lastJob;


}

class SecurityGuard extends Person{

    private double salary;
    private int experience;
    private String company;


}