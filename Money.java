package com.company;

public class Money {

    //Instance variables
    private int dollars;
    private int cents;
    private String currency;

    //Task 2: Getters/Setters
    public int getDollars() {
        return dollars;
    }
    public void setDollars(int newDollars) {
        dollars = newDollars;
    }

    public int getCents() {
        return cents;
    }
    public void setCents(int newCents) {
        cents = newCents;
        if(dollars >= 0) {
            while (cents > 99) {
                cents -= 100;
                dollars += 1;
            }
            while (cents < 0) {
                cents += 100;
                dollars--;
            }
        } else {
            //dollars < 0
            while (cents > 0) {
                cents -= 100;
                dollars++;
            }
            while (cents <= -100) {
                cents += 100;
                dollars --;
            }
        }
    }

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String newCurrency) {
        currency = newCurrency;
    }

    //Task 1: Constructors
    public Money() {
    }
    public Money(int d, int c) {
        setDollars(d);
        setCents(c); //All work done here
    }

    public Money(int d, int c, String currency) {
        setDollars(d);
        setCents(c);
        setCurrency(currency);
    }
    public Money(double a) {
        //m can be for ex, 10.25
        int amt = (int)(a * 100); //1025
        setDollars(0);
        setCents(amt);
    }

    //Task 3
    public boolean isGreaterThan(Money m) {
        if (dollars * 100 + cents > m.getDollars() * 100 + m.getCents())
            return true;
        else
            return false;

//        if (dollars > m.dollars)
//            return true;
//        else if( dollars == m.dollars && cents > m.cents)
//            return true;
//        else
//            return false;
    }

    public boolean isLessThan(Money m) {
        if(dollars > m.getDollars())
            return true;
        else if(dollars == m.getDollars() && cents < m.getCents())
            return true;
        else
            return false;
    }

    public boolean bigMoney() {
        if (dollars > 100)
            return true;
        else if( dollars == 100 && cents > 0)
            return true;
        else
            return false;
    }

    //Task 4: Other methods
    //Vern methods such as add() will change the object
    //Noun objects such as sum() will return a new object
    public void add(Money m) {
        setDollars(dollars + m.getDollars());
        setCents(cents + m.getCents());
    }

    public void sub(Money m) {
        setDollars(dollars - m.getDollars());
        setCents(cents - m.getCents());
    }

    public void mult(int multiplier) {
        setDollars(dollars * multiplier);
        setCents(cents * multiplier);
    }

    public Money changeFrom20() {
        Money rv = new Money();
        rv.dollars = 20 - dollars;
        rv.cents = 0 - cents;

        while (rv.cents < 0) {
            rv.cents += 100;
            rv.dollars -= 1;
        }
        return rv;
    }

    public boolean isNegative() {
        //returns true when less than 0
        return dollars + cents < 0;
    }

    //Task 5
    public String toStr() {
        String rv = "$";
        if(isNegative())
            rv = "-$";

        if(Math.abs(cents) >= 10)
            rv = rv + Math.abs(dollars) + "." + Math.abs(cents);
        else
            rv = rv + Math.abs(dollars) + ".0" + Math.abs(cents);
        return rv;

//        String[] ar = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
//
//        for (int i = 1; i < 10; i++) {
//            if ((int) (dollars / 100) == i)
//                rv += ar[i];
//        }
//        for (int i = 1; i < 10; i++) {
//            if ((int) ((dollars / 10) % 10) == i)
//                rv += ar[i - 1];
//        }
//        for (int i = 1; i < 10; i++) {
//            if ((int) (dollars % 10) == i)
//                rv += ar[i - 1];
//        }
//        for (int i = 1; i < 10; i++) {
//            if ((int) (cents / 10) == i)
//                rv += "." + ar[i - 1];
//        }
//        for (int i = 1; i < 10; i++) {
//            if ((int) (cents % 10) == i)
//                rv += ar[i - 1];
//        }
//
//        return rv;

    }

    public String toEnglish() {
        String rv = "";

        String[] onesToTeens = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
        "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        int d = dollars; //729

        if(isNegative()) {
            rv = "Negative ";
            d = -d;
        }
        if(d / 100 > 0) {
            rv = onesToTeens[d/100] + " Hundred ";
            d = d % 100; //29
        }
        if(d >= 20) {
            rv += tens[d/10] + " ";
            d %= 10; //29 -> 9, or 20 -> 0
            if(d == 0)
                rv += " dollars";
            else
                rv += onesToTeens[d] + " dollars";
            rv += onesToTeens[d % 10] + " dollars";

        } else {
            //d < 20
            rv += onesToTeens[d] + " dollars";
        }
        if(dollars == 1)
            rv = "One dollar";
        if(dollars == -1)
            rv = "Negative One Dollar";

        return rv;

//        //Hundreds digit if statements
//        if (dollars / 100 == 1)
//            returnValue = returnValue + "One hundred ";
//        if (dollars / 100 == 2)
//            returnValue = returnValue + "Two hundred ";
//        if (dollars / 100 == 3)
//            returnValue = returnValue + "Three hundred ";
//        if (dollars / 100 == 4)
//            returnValue = returnValue + "Four hundred ";
//        if (dollars / 100 == 5)
//            returnValue = returnValue + "Five hundred ";
//        if (dollars / 100 == 6)
//            returnValue = returnValue + "Six hundred ";
//        if (dollars / 100 == 7)
//            returnValue = returnValue + "Seven hundred ";
//        if (dollars / 100 == 8)
//            returnValue = returnValue + "Eight hundred ";
//        if (dollars / 100 == 9)
//            returnValue = returnValue + "Nine hundred ";
//
//        if(dollars / 100 != 0) {
//            //Irregular tens digit if statements
//            if (dollars % 100 == 10)
//                returnValue = returnValue + "and ten ";
//            if (dollars % 100 == 11)
//                returnValue = returnValue + "and eleven ";
//            if (dollars % 100 == 12)
//                returnValue = returnValue + "and twelve ";
//            if (dollars % 100 == 13)
//                returnValue = returnValue + "and thirteen ";
//            if (dollars % 100 == 14)
//                returnValue = returnValue + "and fourteen ";
//            if (dollars % 100 == 15)
//                returnValue = returnValue + "and fifteen ";
//            if (dollars % 100 == 16)
//                returnValue = returnValue + "and sixteen ";
//            if (dollars % 100 == 17)
//                returnValue = returnValue + "and seventeen ";
//            if (dollars % 100 == 18)
//                returnValue = returnValue + "and eighteen ";
//            if (dollars % 100 == 19)
//                returnValue = returnValue + "and nineteen ";
//        } else{
//            //Irregular tens digit if statements
//            if (dollars % 100 == 10)
//                returnValue = returnValue + "Ten ";
//            if (dollars % 100 == 11)
//                returnValue = returnValue + "Eleven ";
//            if (dollars % 100 == 12)
//                returnValue = returnValue + "Twelve ";
//            if (dollars % 100 == 13)
//                returnValue = returnValue + "Thirteen ";
//            if (dollars % 100 == 14)
//                returnValue = returnValue + "Fourteen ";
//            if (dollars % 100 == 15)
//                returnValue = returnValue + "Fifteen ";
//            if (dollars % 100 == 16)
//                returnValue = returnValue + "Sixteen ";
//            if (dollars % 100 == 17)
//                returnValue = returnValue + "Seventeen ";
//            if (dollars % 100 == 18)
//                returnValue = returnValue + "Eighteen ";
//            if (dollars % 100 == 19)
//                returnValue = returnValue + "Nineteen ";
//        }
//
//        if(dollars / 100 != 0) {
//            //Rest of the tens digit if statements
//            if ((dollars % 100) / 10 == 2)
//                returnValue = returnValue + "and twenty ";
//            if ((dollars % 100) / 10 == 3)
//                returnValue = returnValue + "and thirty ";
//            if ((dollars % 100) / 10 == 4)
//                returnValue = returnValue + "and forty ";
//            if ((dollars % 100) / 10 == 5)
//                returnValue = returnValue + "and fifty ";
//            if ((dollars % 100) / 10 == 6)
//                returnValue = returnValue + "and sixty ";
//            if ((dollars % 100) / 10 == 7)
//                returnValue = returnValue + "and seventy ";
//            if ((dollars % 100) / 10 == 8)
//                returnValue = returnValue + "and eighty ";
//            if ((dollars % 100) / 10 == 9)
//                returnValue = returnValue + "and ninety ";
//        } else {
//            //Rest of the tens digit if statements
//            if ((dollars % 100) / 10 == 2)
//                returnValue = returnValue + "Twenty ";
//            if ((dollars % 100) / 10 == 3)
//                returnValue = returnValue + "Thirty ";
//            if ((dollars % 100) / 10 == 4)
//                returnValue = returnValue + "Forty ";
//            if ((dollars % 100) / 10 == 5)
//                returnValue = returnValue + "Fifty ";
//            if ((dollars % 100) / 10 == 6)
//                returnValue = returnValue + "Sixty ";
//            if ((dollars % 100) / 10 == 7)
//                returnValue = returnValue + "Seventy ";
//            if ((dollars % 100) / 10 == 8)
//                returnValue = returnValue + "Eighty ";
//            if ((dollars % 100) / 10 == 9)
//                returnValue = returnValue + "Ninety ";
//        }
//
//        //Ones digit if statements
//        if ((dollars % 100) / 10 != 1) {
//            if (dollars % 10 == 1)
//                returnValue = returnValue + "one ";
//            if (dollars % 10 == 2)
//                returnValue = returnValue + "two ";
//            if (dollars % 10 == 3)
//                returnValue = returnValue + "three ";
//            if (dollars % 10 == 4)
//                returnValue = returnValue + "four ";
//            if (dollars % 10 == 5)
//                returnValue = returnValue + "five ";
//            if (dollars % 10 == 6)
//                returnValue = returnValue + "six ";
//            if (dollars % 10 == 7)
//                returnValue = returnValue + "seven ";
//            if (dollars % 10 == 8)
//                returnValue = returnValue + "eight ";
//            if (dollars % 10 == 9)
//                returnValue = returnValue + "nine ";
//        }
//        returnValue = returnValue + "dollars ";
//
//        //Irregular tens digit cents if statements
//        if (cents % 100 == 10)
//            returnValue = returnValue + "and ten ";
//        if (cents % 100 == 11)
//            returnValue = returnValue + "and eleven ";
//        if (cents % 100 == 12)
//            returnValue = returnValue + "and twelve ";
//        if (cents % 100 == 13)
//            returnValue = returnValue + "and thirteen ";
//        if (cents % 100 == 14)
//            returnValue = returnValue + "and fourteen ";
//        if (cents % 100 == 15)
//            returnValue = returnValue + "and fifteen ";
//        if (cents % 100 == 16)
//            returnValue = returnValue + "and sixteen ";
//        if (cents % 100 == 17)
//            returnValue = returnValue + "and seventeen ";
//        if (cents % 100 == 18)
//            returnValue = returnValue + "and eighteen ";
//        if (cents % 100 == 19)
//            returnValue = returnValue + "and nineteen ";
//
//        //Rest of tens digit cents if statements
//        if ((cents % 100) / 10 == 2)
//            returnValue = returnValue + "and twenty ";
//        if ((cents % 100) / 10 == 3)
//            returnValue = returnValue + "and thirty ";
//        if ((cents % 100) / 10 == 4)
//            returnValue = returnValue + "and forty ";
//        if ((cents % 100) / 10 == 5)
//            returnValue = returnValue + "and fifty ";
//        if ((cents % 100) / 10 == 6)
//            returnValue = returnValue + "and sixty ";
//        if ((cents % 100) / 10 == 7)
//            returnValue = returnValue + "and seventy ";
//        if ((cents % 100) / 10 == 8)
//            returnValue = returnValue + "and eighty ";
//        if ((cents % 100) / 10 == 9)
//            returnValue = returnValue + "and ninety ";
//
//        //Ones digit if statements
//        if ((cents % 100) / 10 != 1) {
//            if (cents % 10 == 1)
//                returnValue = returnValue + "one ";
//            if (cents % 10 == 2)
//                returnValue = returnValue + "two ";
//            if (cents % 10 == 3)
//                returnValue = returnValue + "three ";
//            if (cents % 10 == 4)
//                returnValue = returnValue + "four ";
//            if (cents % 10 == 5)
//                returnValue = returnValue + "five ";
//            if (cents % 10 == 6)
//                returnValue = returnValue + "six ";
//            if (cents % 10 == 7)
//                returnValue = returnValue + "seven ";
//            if (cents % 10 == 8)
//                returnValue = returnValue + "eight ";
//            if (cents % 10 == 9)
//                returnValue = returnValue + "nine ";
//        }
//
//        returnValue = returnValue + "cents";
//        return returnValue;
    }

    public static int round(double a) {
        return (int) (a + 0.5);
    }

    public Money product(double mult) {
        return new Money(0, round(mult * (dollars*100 + cents)));
    }

}//end Money class
