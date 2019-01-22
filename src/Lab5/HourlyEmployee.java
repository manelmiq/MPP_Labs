package Lab5;

import java.util.Calendar;

public class HourlyEmployee extends Employee {

    private double hourlyWage;
    private double hoursPerWeek;

    @Override
    public double calcGrossPay(DateRange dateRange) {
        Calendar currentDate = Calendar.getInstance();
        return hourlyWage * hoursPerWeek;
    }


    public void print() {

    }
}
