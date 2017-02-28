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

        return jvzProduct;
    }

    public void setJvzProduct(Product jvzProduct) {

        this.jvzProduct = jvzProduct;
    }

    public int getJvzQuantity() {

        return jvzQuantity;
    }

    public void setJvzQuantity(int jvzQuantity) {

        this.jvzQuantity = jvzQuantity;
    }

    public double getJvzLineTotal() {

        return (jvzQuantity * jvzProduct.getPrice());
    }

}
