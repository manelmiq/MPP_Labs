package Lab5;

import java.util.Calendar;
import java.util.List;

public abstract class Employee {
    private int employeeId;
    private List<Paycheck> paycheckList;

    public abstract double calcGrossPay(DateRange dateRange);

    public Paycheck calcCompensation(int month, int year) {
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();
        startDate.set(year, month, 1);
        endDate.set(year, month, startDate.get(Calendar.DAY_OF_WEEK));
        DateRange dateRange = new DateRange(startDate, endDate);
        double grossSalary = this.calcGrossPay(dateRange);
        double fica = 0.23;
        double state = 0.05;
        double local = 0.01;
        double medicare = 0.03;
        double ssn = 0.075;
        Paycheck paycheck = new Paycheck(fica, grossSalary, state, local, medicare, ssn, dateRange);
        return paycheck;
    }

    public abstract void print();
}
