package Lab5;

import java.util.Calendar;

public class PayRollApplication {
    public static void main (String[] args){

        Employee  employee = new Salaried(500000);

        System.out.println(employee.calcCompensation(1, 5));


    }
}
