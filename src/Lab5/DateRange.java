package Lab5;

import java.util.Calendar;
import java.util.Date;


public class DateRange {
    private Calendar startDate;
    private Calendar endDate;

    public DateRange(Calendar startDate, Calendar endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public boolean isInRange(DateRange dateRange ){

        return false;
    }



    public int getLastDayOfMonth(Date date){
        return date.getDay();
    }

    public int getFirstDayOfMonth(Date date){
        return date.getDay();
    }
}
