package Lab3;

import java.util.Date;

public class Employee {
    private int EmployeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private Date birthDate;
    private String SSN;
    private double salary;

    public Employee(int employeeId, String firstName, String SSN) {
        EmployeeId = employeeId;
        this.firstName = firstName;
        this.SSN = SSN;

    }


    public Employee(int employeeId, String firstName, String middleInitial, String lastName, Date birthDate, String SSN, double salary) {
        EmployeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void print(){
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", SSN='" + SSN + '\'' +
                ", salary=" + salary +
                '}';
    }

}
