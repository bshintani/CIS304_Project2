package project2;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JOptionPane;

public class JavaZon {

    private ArrayList<Clerk> clerksList;//Arraylist to hold all the clerks
    private HashMap<String, Order> jvzOrder;//Hashmap to hold orders the key pair value consists of (OrderID, Order Object)

    public JavaZon() {
        //initialize the Clerk
        clerksList = new ArrayList<Clerk>();
        //initialize the orders
        jvzOrder = new HashMap<String, Order>();

        //load clerks
        loadClerkList();
    }

    public void addOrder(Order anOrder) {

        jvzOrder.put(anOrder.getOrderID(), anOrder);

    }
    
    public void processOrder(String anID) {
        Order selectedOrder = jvzOrder.get(anID);

        selectedOrder.calcSubtotal();
        selectedOrder.calcTax();
        selectedOrder.calcTotal();
    }

    public void loadClerkList() {

        Clerk musicClerk = new Clerk("EMP100", 1, "Homer", "Simpson", "243 North Main", "Spingfield", "CA", "98765", "909-987-6666");
        Clerk bookClerk = new Clerk("EMP200", 2, "Bart", "Simpson", "454 North Euclid", "Spingfield", "CA", "98765", "909-987-4444");
        Clerk gameClerk = new Clerk("EMP300", 3, "Lisa", "Simpson", "767 North Holt", "Spingfield", "CA", "98765", "909-987-3333");

        clerksList.add(musicClerk);
        clerksList.add(bookClerk);
        clerksList.add(gameClerk);
    }

    public void setClerk(String anID) {
        Random rand = new Random();
        int i = rand.nextInt(3);

        Order selectedOrder = jvzOrder.get(anID);
        selectedOrder.setOrderClerk(clerksList.get(i));
    }

    public String getReceipt(String anID) {
        String result;

        Order selectedOrder = jvzOrder.get(anID);

        result = "JAVAZON WHOLESALE STORE\n\n";

        result += "90404 CENTRAL AVE\n";
        result += "MONTCLAIR, CA, 91763\n";
        result += "  (909)345-9876\n\n";

        result += selectedOrder.toString();

        return result;
    }

    public String getOrdersSummary() {

        String result = "";
        Order selectedOrder;
        Customer selectedCustomer;

        for (Map.Entry<String, Order> anEntry : jvzOrder.entrySet()) {
            selectedOrder = anEntry.getValue();
            selectedCustomer = selectedOrder.getCustomer();

            result += "Order ID: " + selectedOrder.getOrderID() + ", ";
            result += "Customer Name: " + selectedCustomer.getFirstName() + " " + selectedCustomer.getLastName() + ", ";
            result += selectedOrder.getTotal() + "\n";
        }

        return result;
    }

    public String deleteOrder(String anID) {
        String result = "";

        if (jvzOrder.containsKey(anID)) {
            jvzOrder.remove(anID);       
            result = "Order ID: " + anID + " has been deleted";
        } else if (!jvzOrder.containsKey(anID)) {
            result = "Order ID: " + anID + " was not found";
        }

        return result;
    }

    public Order findOrder(String anID) {
        Order selectedOrder = null;

        //TODO 
        //check if the HashMap contains the order
        //If it does then store the order in selectedOrder and return selectedOrder
        //If the order is not found then return a null
        if (jvzOrder.containsKey(anID)) {
            selectedOrder = jvzOrder.get(anID);
        } else {
            return selectedOrder;
        }

        return selectedOrder;
    }

    public void clearOrders() {

        jvzOrder.clear();
    }
}
