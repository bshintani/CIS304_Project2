package project2;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class JavaZonFrame extends javax.swing.JFrame implements ActionListener, ItemListener {

    private JPanel jPanel1;
    private JButton btnAdd;
    private JComboBox cboItem1, cboItem2, cboItem3;
    private JTextField txtQty1, txtQty2, txtQty3;
    private JTextField txtPrice1, txtPrice2, txtPrice3;
    private JTextField txtLineTotal3, txtLineTotal2, txtLineTotal1;
    private JLabel jLabel14, jLabel12, jLabel11, jLabel10, jLabel2;
    private JLabel jLabel3, jLabel4, jLabel5, jLabel9;
    private JLabel jLabel8, jLabel7, jLabel6, jLabel1, jLabel13;
    private JTextField txtOrderID, txtFirstName, txtLastName, txtPhone, txtMemberShip;
    private JButton btnReset;
    private JLabel jLabel15, jLabel16, jLabel17, jLabel18;
    private JButton btnImport;
    private JTextField txtStreet, txtCity, txtState, txtZip;
    private JTextField txtTotal;
    private JTextField txtTax;
    private JTextField txtSubtotal;
    private JLabel lblLineTotal;
    private JLabel lblTotal;
    private JLabel lblTax;
    private JLabel lblSubtotal;
    private JButton btnExport;
    private JButton btnClear;
    private JButton btnList;
    private JButton btnFind;
    private JButton btnDelete;

    private JavaZon jz;
    private Menu menu;

    public JavaZonFrame() {
        try {
            GridLayout thisLayout = new GridLayout(1, 1);
            thisLayout.setColumns(1);
            thisLayout.setHgap(5);
            thisLayout.setVgap(5);
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            jz = new JavaZon();
            menu = new Menu();

            String menuItems[] = menu.getMenuDescriptions();

            getContentPane().setLayout(thisLayout);

            jPanel1 = new JPanel();
            getContentPane().add(jPanel1);
            GridBagLayout jPanel1Layout = new GridBagLayout();
            /*jPanel1Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1};
			jPanel1Layout.rowHeights = new int[] {20, 20, 7, 7, 7, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 7, 20, 20};
			jPanel1Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1};
			jPanel1Layout.columnWidths = new int[] {20, 7, 7, 7, 7, 20, 20, 20};
             */
            jPanel1.setLayout(jPanel1Layout);
            jPanel1.setPreferredSize(new java.awt.Dimension(499, 426));

            btnAdd = new JButton();
            jPanel1.add(btnAdd, new GridBagConstraints(1, 17, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            btnAdd.setText("Add");
            btnAdd.addActionListener(this);

            btnDelete = new JButton();
            jPanel1.add(btnDelete, new GridBagConstraints(2, 17, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            btnDelete.setText("Delete");
            btnDelete.addActionListener(this);

            btnFind = new JButton();
            jPanel1.add(btnFind, new GridBagConstraints(3, 17, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            btnFind.setText("Find");
            btnFind.addActionListener(this);

            btnList = new JButton();
            jPanel1.add(btnList, new GridBagConstraints(4, 17, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            btnList.setText("List");
            btnList.addActionListener(this);

            btnClear = new JButton();
            jPanel1.add(btnClear, new GridBagConstraints(5, 17, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            btnClear.setText("Clear");
            btnClear.addActionListener(this);

            txtOrderID = new JTextField();
            jPanel1.add(txtOrderID, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtOrderID.setPreferredSize(new java.awt.Dimension(110, 24));

            btnReset = new JButton();
            jPanel1.add(btnReset, new GridBagConstraints(6, 17, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            btnReset.setText("Reset");
            btnReset.addActionListener(this);
            
            btnImport = new JButton();
            jPanel1.add(btnImport, new GridBagConstraints(4, 18, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            btnImport.setText("Import");
            btnImport.addActionListener(this);
            
            btnExport = new JButton();
            jPanel1.add(btnExport, new GridBagConstraints(5, 18, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            btnExport.setText("Export");
            btnExport.addActionListener(this);

            txtFirstName = new JTextField();
            jPanel1.add(txtFirstName, new GridBagConstraints(2, 3, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtFirstName.setPreferredSize(new java.awt.Dimension(175, 24));

            txtLastName = new JTextField();
            jPanel1.add(txtLastName, new GridBagConstraints(5, 3, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtLastName.setPreferredSize(new java.awt.Dimension(175, 24));
            
            txtMemberShip = new JTextField();
            jPanel1.add(txtMemberShip, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtMemberShip.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtStreet = new JTextField();
            jPanel1.add(txtStreet, new GridBagConstraints(2, 5, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtStreet.setPreferredSize(new java.awt.Dimension(175, 24));
            
            txtCity = new JTextField();
            jPanel1.add(txtCity, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtCity.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtPhone = new JTextField();
            jPanel1.add(txtPhone, new GridBagConstraints(5, 4, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtPhone.setPreferredSize(new java.awt.Dimension(175, 24));
            
            txtState = new JTextField();
            jPanel1.add(txtState, new GridBagConstraints(4, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtState.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtZip = new JTextField();
            jPanel1.add(txtZip, new GridBagConstraints(6, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtZip.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtQty1 = new JTextField();
            jPanel1.add(txtQty1, new GridBagConstraints(3, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtQty1.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtQty2 = new JTextField();
            jPanel1.add(txtQty2, new GridBagConstraints(3, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtQty2.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtQty3 = new JTextField();
            jPanel1.add(txtQty3, new GridBagConstraints(3, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtQty3.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtPrice1 = new JTextField();
            jPanel1.add(txtPrice1, new GridBagConstraints(4, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtPrice1.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtPrice2 = new JTextField();
            jPanel1.add(txtPrice2, new GridBagConstraints(4, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtPrice2.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtPrice3 = new JTextField();
            jPanel1.add(txtPrice3, new GridBagConstraints(4, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtPrice3.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtLineTotal1 = new JTextField();
            jPanel1.add(txtLineTotal1, new GridBagConstraints(5, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtLineTotal1.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtLineTotal2 = new JTextField();
            jPanel1.add(txtLineTotal2, new GridBagConstraints(5, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtLineTotal2.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtLineTotal3 = new JTextField();
            jPanel1.add(txtLineTotal3, new GridBagConstraints(5, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtLineTotal3.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtSubtotal = new JTextField();
            jPanel1.add(txtSubtotal, new GridBagConstraints(5, 11, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtSubtotal.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtTax = new JTextField();
            jPanel1.add(txtTax, new GridBagConstraints(5, 12, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtTax.setPreferredSize(new java.awt.Dimension(110, 24));
            
            txtTotal = new JTextField();
            jPanel1.add(txtTotal, new GridBagConstraints(5, 13, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            txtTotal.setPreferredSize(new java.awt.Dimension(110, 24));
            
            cboItem1 = new JComboBox(menu.getMenuDescriptions());
            jPanel1.add(cboItem1, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            cboItem1.setSelectedIndex(-1);
            cboItem1.addItemListener(this);
            
            cboItem2 = new JComboBox(menu.getMenuDescriptions());
            jPanel1.add(cboItem2, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            cboItem2.setSelectedIndex(-1);
            cboItem2.addItemListener(this);
            
            cboItem3 = new JComboBox(menu.getMenuDescriptions());
            jPanel1.add(cboItem3, new GridBagConstraints(2, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            cboItem3.setSelectedIndex(-1);
            cboItem3.addItemListener(this);
            
            jLabel1 = new JLabel();
            jPanel1.add(jLabel1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel1.setText("Order ID:");

            jLabel2 = new JLabel();
            jPanel1.add(jLabel2, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel2.setText("First Name:");

            jLabel3 = new JLabel();
            jPanel1.add(jLabel3, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel3.setText("Last Name:");
            
            jLabel4 = new JLabel();
            jPanel1.add(jLabel4, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel4.setText("Membership:");

            jLabel5 = new JLabel();
            jPanel1.add(jLabel5, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel5.setText("Street:");
            
            jLabel6 = new JLabel();
            jPanel1.add(jLabel6, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel6.setText("City:");
            
            jLabel7 = new JLabel();
            jPanel1.add(jLabel7, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel7.setText("Phone:");
            
            jLabel8 = new JLabel();
            jPanel1.add(jLabel8, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel8.setText("State:");
            
            jLabel9 = new JLabel();
            jPanel1.add(jLabel9, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel9.setText("Zip:");
            
            jLabel10 = new JLabel();
            jPanel1.add(jLabel10, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel10.setText("Product:");
            
            jLabel11 = new JLabel();
            jPanel1.add(jLabel11, new GridBagConstraints(3, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel11.setText("Quantity:");
            
            jLabel12 = new JLabel();
            jPanel1.add(jLabel12, new GridBagConstraints(4, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel12.setText("Price:");
            
            jLabel14 = new JLabel();
            jPanel1.add(jLabel14, new GridBagConstraints(5, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel14.setText("LineTotal:");
            
            jLabel15 = new JLabel();
            jPanel1.add(jLabel15, new GridBagConstraints(4, 11, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel15.setText("Subtotal:");
            
            jLabel16 = new JLabel();
            jPanel1.add(jLabel16, new GridBagConstraints(4, 12, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel16.setText("Tax:");
            
            jLabel17 = new JLabel();
            jPanel1.add(jLabel17, new GridBagConstraints(4, 13, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel17.setText("Total:");
            
            jLabel18 = new JLabel();
            jPanel1.add(jLabel18, new GridBagConstraints(3, 18, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
            jLabel18.setText("File Options");
            
            jLabel13 = new JLabel();
            jPanel1.add(jLabel13, new GridBagConstraints(2, 0, 3, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
            jLabel13.setText("Welcome to JAVAZON III");

            //TODO ADD THE REST OF THE CONTROLS
            //REFER TO HANDOUT FOR THE CONTROLS NEEDED
            //AND THE LOCATION OF EACH ITEM
            pack();
            this.setSize(507, 500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        //based on the object that trigerred the event
        //call the appropriate method

        //Call addOrder
        //Call clearOrders
        //Call deleteOrder
        //Call findOrder
        //call printOrders
        //call resetForm
        if (e.getSource() == btnAdd) {
            addOrder();
        } else if (e.getSource() == btnDelete) {
            deleteOrder();
        } else if (e.getSource() == btnFind) {
            findOrder();
        } else if (e.getSource() == btnList) {
            printOrders();
        } else if (e.getSource() == btnReset) {
            resetForm();
        }

    }

    public void itemStateChanged(ItemEvent e) {
        //example of method to display the price of the product
        //based on what item was selected

        Object o = e.getSource();
        if (o == cboItem1) {
            if (cboItem1.getSelectedIndex() != -1) {
                txtPrice1.setText(menu.getPrice(cboItem1.getSelectedIndex()));
                
                
            }
        } else if (o == cboItem2) {
            if (cboItem2.getSelectedIndex() != -1) {
                txtPrice2.setText(menu.getPrice(cboItem2.getSelectedIndex()));
            }
        } else if (o == cboItem3) {
            if (cboItem3.getSelectedIndex() != -1) {
                txtPrice3.setText(menu.getPrice(cboItem3.getSelectedIndex()));
            }
        }

        //TODO add code to display the price 
        //for the other comboboxes and textfields for the line item price
    }

    private void addOrder() {
        //CREATE VARIABLES TO HOLD INPUT
        //TODO
        //PASS THE INPUT TO THE VALIDATOR\
        //THE ONLY VALIDATION IN THIS PROJECT
        //IS THAT STRING VALUES ARE NOT BLANK
        //AND NUMERICAL VALUES ARE THE CORRECT TYPE
        //FOR EXAMPLE QUANTITY SHOULD BE INTEGER
        //PRICE SHOULD BE DOUBLE
        //EVERYTHING ELSE IS OK

        Validator.clearError(); //before we start processing we clear any errors

        String orderID = Validator.getOrderID(txtOrderID.getText());
        String firstName = Validator.getFirstName(txtFirstName.getText());

        //add the other variables to hold your values from the validator in here
        //see below what variables you will need to create a customer object and an order object
        String lastName = Validator.getLastName(txtLastName.getText());
        String street = Validator.getAddress(txtStreet.getText());
        String city = Validator.getCity(txtCity.getText());
        String zip = Validator.getZip(txtZip.getText());
        String state = Validator.getState(txtState.getText());
        String phone = Validator.getPhone(txtPhone.getText());
        String membership = Validator.getMembership(txtMemberShip.getText());

        //Example of how to validate the combobox from the validator
        //After you create the validation method called getQuantity in the validator
        //uncomment the Validator.getQuantity... line
        if (this.cboItem1.getSelectedIndex() != -1) {
            Validator.getQuantity(txtQty1.getText());
        } else if (this.cboItem2.getSelectedIndex() != -1) {
            Validator.getQuantity(txtQty2.getText());
        } else if (this.cboItem3.getSelectedIndex() != -1) {
            Validator.getQuantity(txtQty3.getText());
        }

        //do the same thing for the other 2 comboboxes
        //if there are errors then display them to the user
        //otherwise start creating the objects for the order
        if (Validator.getError().length() != 0) {
            JOptionPane.showMessageDialog(null, "An Error Occured:\n\n" + Validator.getError());

        } else {
            Customer customer = new Customer(firstName, lastName, street, city,
                    state, zip, phone, membership);

            Order order = new Order(orderID);
            order.setOrderCustomer(customer);

            if (this.cboItem1.getSelectedIndex() != -1) {
                Product product1 = menu.getMenu()[this.cboItem1.getSelectedIndex()];
                order.setOrderProduct(product1, Integer.parseInt(txtQty1.getText()));
                this.txtLineTotal1.setText(String.valueOf(order.getLineTotal(0))); //Need to numberformat these outputs
            } if (this.cboItem2.getSelectedIndex() != -1) {
                Product product2 = menu.getMenu()[this.cboItem2.getSelectedIndex()];
                order.setOrderProduct(product2, Integer.parseInt(txtQty2.getText()));
                this.txtLineTotal2.setText(String.valueOf(order.getLineTotal(1)));
            } if (this.cboItem3.getSelectedIndex() != -1) {
                Product product3 = menu.getMenu()[this.cboItem3.getSelectedIndex()];
                order.setOrderProduct(product3, Integer.parseInt(txtQty3.getText()));
                this.txtLineTotal3.setText(String.valueOf(order.getLineTotal(2)));
            }
            
            //do the same for the other 2 comboboxes
            jz.addOrder(order);
            jz.setClerk(orderID);
            jz.processOrder(orderID);

            //TODO
            //INSTEAD OF GET RECEIPT YOU NEED TO CREATE METHODS THAT
            //WILL RETURN INDIVIDUAL VALUES
            //FOR EACH LINE ITEM RETRIEVE THE TOTALS
            //FOR THE WHOLE ORDER RETRIEVE THE SUBTOTAL, TAX, TOTAL
            //DISPLAY THESE RESULTS IN THE APPROPRIATE BOXES INSTEAD OF THE JOPTIONPANE BOX
            //JOptionPane.showMessageDialog(null, jz.getReceipt(orderID));
            
            this.txtSubtotal.setText(order.getSubTotal());
            this.txtTax.setText(order.getTax());
            this.txtTotal.setText(order.getTotal());
            
            JOptionPane.showMessageDialog(null, "Order " + orderID + " was Saved");
        }

    }

    private void deleteOrder() {
        String orderID = JOptionPane.showInputDialog("Enter Order ID to Delete");
        String result = jz.deleteOrder(orderID);

        JOptionPane.showMessageDialog(null, result);
    }

    private void findOrder() {
        //find a particular order

        //TODO
        //Fill the screen with the order that was retrieved
        //All the fields should be blanked out and filled with the values from the new order
        String input = txtOrderID.getText();
        Order foundOrder = jz.findOrder(input);
        if (foundOrder != null) {
            Customer foundCustomer = foundOrder.getCustomer();

            txtFirstName.setText(foundCustomer.getFirstName());
            txtLastName.setText(foundCustomer.getLastName());
            txtStreet.setText(foundCustomer.getAddress());
            String city = txtCity.getText();
            String state = txtState.getText();
            String zip = txtZip.getText();
            String phone = txtPhone.getText();
            String membership = txtMemberShip.getText();

            //Example how to set the value of a combobox
            this.cboItem3.setSelectedItem("VB");
        } else {

            JOptionPane.showMessageDialog(null, "Order Not Found");;
        }
    }

    private void clearOrders() {
        //clear orders
        jz.clearOrders();
        JOptionPane.showMessageDialog(null, "Orders Cleared!");
    }

    private void printOrders() {
        //print summary of orders
        String result = jz.getOrdersSummary();
        if (result.length() == 0) {
            JOptionPane.showMessageDialog(null, "No Orders Available!");
        } else {
            JOptionPane.showMessageDialog(null, jz.getOrdersSummary());
        }
    }

    public void resetForm() {
        //TODO
        //ADD code here to reset the form to a blank state

        txtOrderID.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMemberShip.setText("");
        txtStreet.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtPhone.setText("");
        txtQty1.setText("");
        txtQty2.setText("");
        txtQty3.setText("");
        txtPrice1.setText("");
        txtPrice2.setText("");
        txtPrice3.setText("");
        txtLineTotal1.setText("");
        txtLineTotal2.setText("");
        txtLineTotal3.setText("");

        try {

            this.cboItem1.setSelectedIndex(-1);
            this.cboItem2.setSelectedIndex(-1);
            this.cboItem3.setSelectedIndex(-1);

        } catch (Exception ex) {
            //ignore error
        }
    }

}
