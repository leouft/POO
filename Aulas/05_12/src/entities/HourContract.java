package entities;

import java.util.Date;

public class HourContract {
    public Date date;
    private double valuePerHour;
    private int hours;

    public HourContract(Date date, double value, int hours){
        this.date = date; this.valuePerHour = value; this.hours = hours;
    }

    public double totalValue() {
        return valuePerHour*hours;
    }
}
