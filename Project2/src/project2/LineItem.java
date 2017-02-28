package project2;

import java.text.NumberFormat;

public class LineItem {

    private Product jvzProduct;
    private int jvzQuantity;

    public LineItem(Product aProduct, int aQuantity) {
        jvzProduct = aProduct;
        jvzQuantity = aQuantity;
    }

    public Product getJvzProduct() {
        //TODO 
        //Write the code necessary for this method
        return jvzProduct;
    }

    public void setJvzProduct(Product jvzProduct) {
        //TODO 
        //Write the code necessary for this method
        this.jvzProduct = jvzProduct;
    }

    public int getJvzQuantity() {
        //TODO 
        //Write the code necessary for this method
        return jvzQuantity;
    }

    public void setJvzQuantity(int jvzQuantity) {
        //TODO 
        //Write the code necessary for this method
        this.jvzQuantity = jvzQuantity;
    }

    public double getJvzLineTotal() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();     
        return (jvzQuantity * jvzProduct.getPrice());
    }

}
