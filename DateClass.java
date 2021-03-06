package com.company;

public class DateClass {
    private String monthName;
    private int monthNumber;
    private int day;
    int year;

    //Getters/Setters
    public int getDay() {
        return day;
    }

    public void setDay(int newDay) {
        day = newDay;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int newMonthNumber) {
        if (getDay() == 30 && newMonthNumber == 4 || newMonthNumber == 6 || newMonthNumber == 9 || newMonthNumber == 11)
            monthNumber = newMonthNumber;
        else
            System.out.println("Error: Invalid DateClass " + getMonthNumber() + "/" + getDay() + "/" + getYear());
        if (getDay() == 31 && newMonthNumber == 1 || newMonthNumber == 3 || newMonthNumber == 5 || newMonthNumber == 7
                || newMonthNumber == 8 || newMonthNumber == 10 || newMonthNumber == 12)
            setMonthNumber(newMonthNumber);
        else
            System.out.println("Error: Invalid DateClass " + getMonthNumber() + "/" + getDay() + "/" + getYear());
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String newMonth) {
        monthName = newMonth;
    }

    //Constructors
    public DateClass() {
        setDay(1);
        setYear(0);
        setMonthNumber(1);
        setMonthName("January");
    }

    public DateClass(String newMonthName, int newDay) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        setMonthName(newMonthName);
        setDay(newDay);
        setYear(0);
        setMonthName(months[getMonthNumber()]);
    }

    public DateClass(int mmddyyyy) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        setMonthNumber(mmddyyyy / 1000000);
        setDay((mmddyyyy % 1000000) / 10000);
        setYear(mmddyyyy % 10000);
        setMonthName(months[getMonthNumber()]);
    }

    //Methods
    public String toStr() {
        return "" + getMonthName() + " " + getDay() + ", " + getYear();
    }

    public boolean isLeapYear() {
        boolean rv = false;
        if (getYear() % 400 == 0)
            rv = true;
        else if (getYear() % 4 == 0 && getYear() % 100 != 0)
            rv = true;
        return rv;
    }

    public boolean isLastDayOfMonth() {
        boolean rv = false;
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int lastDay = monthDay[getMonthNumber()];
        if (getDay() == lastDay)
            rv = true;
        return rv;
    }

    public boolean isBefore(DateClass d) {
        boolean rv = false;
        if (d.getYear() < getYear())
            rv = true;
        else if (d.getMonthNumber() < getMonthNumber())
            rv = true;
        else if (d.getDay() < getDay())
            rv = true;
        return rv;
    }

    public boolean isAfter(DateClass d) {
        boolean rv = false;
        if (d.getYear() > getYear())
            rv = true;
        else if (d.getMonthNumber() > getMonthNumber())
            rv = true;
        else if (d.getDay() > getDay())
            rv = true;
        return rv;
    }

    public boolean isSameDate(DateClass d) {
        boolean rv = false;
        if (d.getYear() == getYear() && d.getDay() == getDay() && d.getMonthNumber() == getMonthNumber())
            rv = true;
        return rv;
    }

    public DateClass nextDate() {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        DateClass rv = new DateClass();

        if (getMonthNumber() == 12 && getDay() == 31) {
            rv.setDay(1);
            rv.setYear(getYear() + 1);
            rv.setMonthName("January");
            rv.setMonthNumber(1);
        } else {
            if (getDay() < monthDay[getMonthNumber()]) {
                rv.setDay(getDay() + 1);
                rv.setMonthNumber(getMonthNumber());
                rv.setYear(getYear());
                rv.setMonthName(months[getMonthNumber()]);
            } else {
                rv.setDay(1);
                rv.setMonthNumber(getMonthNumber() + 1);
                rv.setYear(getYear());
                rv.setMonthName(months[getMonthNumber() + 1]);
            }
        }
        return rv;
    }

    public DateClass prevDate() {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        DateClass rv = new DateClass();

        if (getMonthNumber() == 1 && getDay() == 1) {
            rv.setDay(31);
            rv.setYear(getYear() - 1);
            rv.setMonthName("December");
            rv.setMonthNumber(12);
        } else {
            if (getDay() > 1) {
                rv.setDay(getDay() - 1);
                rv.setMonthNumber(getMonthNumber());
                rv.setYear(getYear());
                rv.setMonthName(months[getMonthNumber()]);
            } else {
                rv.setDay(monthDay[getMonthNumber() - 1]);
                rv.setMonthNumber(getMonthNumber() - 1);
                rv.setYear(getYear());
                rv.setMonthName(months[getMonthNumber() - 1]);
            }
        }
        return rv;
    }

    public int daysApart(DateClass d) {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int rv = 0;

        if (d.getYear() == getYear()) {
            if (d.getMonthNumber() != getMonthNumber()) {
                if (d.getMonthNumber() < getMonthNumber()) {
                    for (int i = d.getMonthNumber(); i <= getMonthNumber(); i++)
                        rv += monthDay[i];
                    rv -= (d.getDay() + getDay());
                }
                if (d.getMonthNumber() > getMonthNumber()) {
                    for (int i = getMonthNumber(); i <= d.getMonthNumber(); i++)
                        rv += monthDay[i];
                    rv -= (d.getDay() + getDay());
                }
            }
            else {
                if (d.getDay() < getDay())
                    rv += (getDay() - d.getDay());
                else
                    rv += (d.getDay() - getDay());
            }
        }
        else {
            if (d.getYear() < getYear()) {
                for (int i = d.getYear(); i <= getYear(); i++) {
                    for (int j = 1; j < monthDay.length; j++)
                        rv += monthDay[j];
                }
                for (int i = 1; i < d.getMonthNumber(); i++)
                    rv -= monthDay[i];
                rv -= d.getDay();
            }
            else {
                for (int i = getYear(); i <= d.getYear(); i++) {
                    for (int j = 1; j < monthDay.length; j++)
                        rv += monthDay[j];
                }
                for (int i = 1; i < d.getMonthNumber(); i++)
                    rv -= monthDay[i];
                rv -= d.getDay();
            }
        }
        return rv;
    }

    public int dayOfYear() {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int rv = 0;

        for (int i = 1; i < getMonthNumber(); i++)
            rv += monthDay[i];
        rv += getDay();

        return rv;
    }

    public int daysLeftInMonth() {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return (monthDay[getMonthNumber()] - getDay());
    }

    public int daysLeftInYear() {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int rv = 0;

        for (int i = getMonthNumber(); i < monthDay.length; i++)
            rv += monthDay[i];
        rv -= getDay();

        return rv;
    }

    public int daysLeftInDecade() {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int rv = 0;

        for (int i = getYear(); i < getYear() + 10; i++) {
            while (i % 10 != 0)
                for (int j = 1; j < monthDay.length; j++)
                    rv += monthDay[j];
            if (i % 10 == 0)
                break;
        }
        for(int i = 1; i < getMonthNumber(); i++)
            rv -= monthDay[i];
        rv -= getDay();

        return rv;
    }

    public int daysLeftInCentury() {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int rv = 0;

        for (int i = getYear(); i < getYear() + 100; i++) {
            while (i % 100 != 0)
                for (int j = 1; j < monthDay.length; j++)
                    rv += monthDay[j];
            if (i % 100 == 0)
                break;
        }
        for(int i = 1; i < getMonthNumber(); i++)
            rv -= monthDay[i];
        rv -= getDay();

        return rv;
    }

    public String foo() {
        return getMonthName();

    }

}
