package time;

import java.time.LocalDateTime;

public class Time {
    // Instance variables
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    // Default Constructor
    public Time() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        this.year = currentDateTime.getYear();
        this.month = currentDateTime.getMonthValue();
        this.day = currentDateTime.getDayOfMonth();
        this.hour = currentDateTime.getHour();
        this.minute = currentDateTime.getMinute();
        this.second = currentDateTime.getSecond();
    }

    // Overloaded Constructor 1 (Year, Month, Day)
    public Time(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Overloaded Constructor 2 (Year, Month, Day, Hour, Minute, Second)
    public Time(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Getter for all valeus
    public int[] getDateTime() {
        return new int[]{year, month, day, hour, minute, second};
    }

    // Setter for all values
    public void setDateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void displayDateTime() {
        System.out.println("Year: "+year);
        System.out.println("Month: "+month);
        System.out.println("Day: "+day);
        System.out.println("Hour: "+hour);
        System.out.println("Minute: "+minute);
        System.out.println("Second: "+second);
    }

    public static void main(String[] args) {
        
        Time defaultTime = new Time();
        defaultTime.displayDateTime(); // Displaying the current date and time
    
    }
}
