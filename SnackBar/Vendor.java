package SnackBar;

import Number42.Coins;
/* Complete the Vendor constructor- done
Complete the setStock mutator- done
Complete the getStock accessor- done
Complete the addMoney mutator-done
Complete the getDeposit accessor- done
Complete the makeSale method- Done
Complete the getChangeString method- Done
Complete the getTotalSales static method- Done
Change the password to the prefix of your email (the part before the @).- done
Submit Snackbar.java - done
Submit Vendor.java - done
Submit link to GitHub repository- done
Follows Java coding convenstion https://google.github.io/styleguide/javaguide.html */
/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
    // Fields:

    private int price;
    private int stock;
    private int deposit;
    private int change;

    private static double totalSales = 0;
    //make a private static double variable called totalSales that has an initial value of 0


    /**
     * Constructs a Vendor
     * @param price the price of a single item in cents (int)
     * @param stock number of items to place in stock (int)
     */
    public Vendor(int price, int stock)
    {
        this.price = price;
        this.stock = stock;
        //You need to complete this using this. notation
    }

    /**
     * Sets the quantity of items in stock.
     * @param stock number of items to place in stock (int)
     */


    public void setStock(int stock)
    {
         this.stock = stock;
        //You need to complete this using this. notation
    }

    /**
     * Returns the number of items currently in stock.
     * @return number of items currently in stock (int)
     */
    public int getStock()
    {
        //complete this
        return this.stock;
    }

    /**
     * Adds a specified amount (in cents) to the
     * deposited amount.
     * @param d number of cents to add to the deposit (int)
     */
    public void addMoney(int d)
    {
        deposit += d;
        //Correctly adds money to the amount of money that will be given to the vending machine
        //You need to complete this using mutator
    }

    /**
     * Returns the currently deposited amount (in cents).
     * @return number of cents in the current deposit (int)
     */
    public int getDeposit()
    {

        return deposit;
    }

    /**
     * Implements a sale.  If there are items in stock and
     * the deposited amount is greater than or equal to
     * the single item price, then adjusts the stock
     * and calculates and sets change and returns true;
     * otherwise refunds the whole deposit (moves it into
     * change) and returns false.
     * @return true for a successful sale, false otherwise (boolean)
     */
    public boolean makeSale()
    {
        if(this.stock > 0 && this.deposit >= this.price)
        {
            this.stock -= 1;
            this.change = this.deposit - this.price;
            return true;
        }
        else {
            change += this.deposit;
            return false;
        }

    }

    /**
     * Returns and zeroes out the amount of change (from
     * the last sale or refund).
     * @return number of cents in the current change (int)
     */
    public int getChange()
    {
        int c=change;
        change=0;
        return c;
    }

    public String getChangeString()
    {
        //From Ethan: create a get method that returns the amount and type of coins that should be returned by the machine
        /*
        note that the coin class has a .getQuarters(), a .getDimes() etc etc (use the coin class!)
        */
        Coins coins = new Coins(change);
        String changeString = "";
        changeString =  "Your total change is " + coins.getPennies()+ " pennies, " + coins.getQuarters() + " quarters, " +
        coins.getDimes() +" dimes, " + " and " + coins.getNickles() + " nickels.";
        return changeString;
    }
    
    /**
    * Returns the total number of sales and resets the total number of sales to 0
    * Hint: use a temp variable
    *
    * @return number of sales
    */
    public static double getTotalSales()
    {
        double temp;
        temp = totalSales;
        totalSales = 0;
        return temp;






        //complete this
    }
}
