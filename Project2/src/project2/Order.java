package project2;

import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Order {

    //class variables
    private String orderID;
    private Customer orderCustomer;
    private Clerk orderClerk;
    private ArrayList<LineItem> lineItems;

    //store totals
    private double subtotal;
    private double tax;
    private double total;

    //constant defining tax
    private static double TAX_RATE = 0.0825;

    private int productCount;

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public Order(String anID) {
        lineItems = new ArrayList<LineItem>();

        orderID = anID;
        subtotal = 0;
        tax = 0;
        total = 0;
    }

    public void setOrderID(String anID) {
        orderID = anID;
    }

    public void setOrderCustomer(Customer aCustomer) {
        orderCustomer = aCustomer;
    }

    public void setOrderClerk(Clerk aClerk) {
        orderClerk = aClerk;
    }

    public void setOrderProduct(Product aProduct, int aQty) {

        productCount++;

        this.lineItems.add(new LineItem(aProduct, aQty));

    }
    
    //make method to access arraylist
    public LineItem getLineItem(int anID) {
        return this.lineItems.get(anID);
    }

    public String getOrderID() {
        return orderID;
    }

    public void calcSubtotal() {
        for (LineItem li : lineItems) {
            subtotal += li.getJvzQuantity() * li.getJvzProduct().getPrice();
        }
    }

    public void calcTax() {
        tax = subtotal * TAX_RATE;
    }

    public void calcTotal() {
        total = subtotal + tax;
    }

//    public String toString() {
//        NumberFormat nf = NumberFormat.getCurrencyInstance();
//
//        String result = "";
//
//        result += "CASHIER @ REGISTER\n " + orderClerk.getFirstName() + " " + orderClerk.getLastName() + " @ " + orderClerk.getRegisterNbr() + "\n\n";
//
//        result += "Order # " + orderID + "\n\n";
//
//        result += "CUSTOMER INFO\n" + orderCustomer.toString() + "";
//
//        result += "\nNUMBER OF ITEMS SOLD = " + getNumberItemsSold() + "\n\n";
//
//        for (LineItem li : lineItems) {
//            result += li.getJvzQuantity() + "  @  " + nf.format(li.getJvzProduct().getPrice()) + " = " + nf.format(li.getJvzQuantity() * li.getJvzProduct().getPrice()) + "\n";
//            result += "    " + li.getJvzProduct().getDescription() + "\n\n";
//        }
//
//        result += "TOTALS\n";
//        result += "Subtotal: " + nf.format(subtotal) + "\n";
//        result += "Tax: " + nf.format(tax) + "\n";
//        result += "Total: " + nf.format(total);
//
//        return result;
//    }
    //Returns the number of items sold
    public int getNumberItemsSold() {
        int totalQty = 0;
        for (LineItem li : lineItems) {
            totalQty += li.getJvzQuantity();
        }

        return totalQty;
    }

    public String getSubTotal() {
        String result = nf.format(subtotal);
        return result;
    }

    public String getTax() {
        String result = nf.format(tax);
        return result;
    }

    public String getTotal() {
        String result = nf.format(total);
        return result;
    }

    public Customer getCustomer() {
        return orderCustomer;
    }

    public double getLineTotal(int iLine) {
        //Select the LineItem from the ArrayList    
        LineItem selectedItem = lineItems.get(iLine);

        //Get the total for that item   
        return selectedItem.getJvzLineTotal();
    }

}
