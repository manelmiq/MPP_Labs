package Lab5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Commissioned extends Employee {

    private double commission;
    private double baseSalary;
    private List<Order> orderList;

    public Commissioned(double commission, double baseSalary) {
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    @Override
    public double calcGrossPay(DateRange dateRange) {
        double grossSalary = 0;
        grossSalary += baseSalary;





        for (Order order : orderList) {
            if ((order.getOrderDate().get(Calendar.MONTH) == month) && (order.getOrderDate().get(Calendar.YEAR) == year)) {
                grossSalary += order.getOrderAmount();
            }
        }

        return grossSalary;
    }



    @Override
    public void print() {

    }


}



