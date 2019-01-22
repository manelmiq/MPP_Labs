package Lab5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PayRollApplication {
    public static void main (String[] args){
        Employee  employee1 = new Salaried(1000);
        Employee  employee2 = new HourlyEmployee(1000, 20);
        Employee  employee3 = new Commissioned(0.7, 1000);
        GregorianCalendar date1 = new GregorianCalendar(2000, Calendar.FEBRUARY, 2);
        GregorianCalendar date2 = new GregorianCalendar(2000, Calendar.JANUARY, 2);
        Order order1 = new Order(1, date1, 1000  );
        Order order2 = new Order(2, date2, 1000  );
        ((Commissioned) employee3).addOrder(order1);
        ((Commissioned) employee3).addOrder(order2);
        System.out.println(employee1.calcCompensation(1,2000 ));
        System.out.println(employee2.calcCompensation(1,2000 ));
        System.out.println(employee3.calcCompensation(1,2000 ));


    }
}
