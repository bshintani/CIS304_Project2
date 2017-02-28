package project2;

public class Validator {

    //TODO - CODE THE VALIDATOR
    //add the method that will validate all the input
    //collected from the form
    //static variable to hold any error that occurs
    private static String errorMessage = "";

    public static String getOrderID(String anID) {
        //run the validation
        //add any errors to the error message
        if (anID.length() == 0) {
            errorMessage += "Order ID cannot be blank\n";
        }
        return anID;
    }

    public static String getFirstName(String aFirstName) {
        if (aFirstName.length() == 0) {
            errorMessage += "First Name cannot be blank\n";
        }
        return aFirstName;
    }
    
    public static String getLastName(String aLastName) {
        if (aLastName.length() == 0) {
            errorMessage += "Last Name cannot be blank\n";
        }
        return aLastName;
    }
    
    public static String getAddress(String anAddress) {
        if (anAddress.length() == 0) {
            errorMessage += "Address cannot be blank\n";
        }
        return anAddress;
    }
    
    public static String getCity(String aCity) {
        if (aCity.length() == 0) {
            errorMessage += "City cannot be blank\n";
        }
        return aCity;
    }
    
    public static String getZip(String aZip) {
        try {
            if (aZip.length() == 5) {
                for (int i = 0; i < aZip.length(); i++) {
                    char number = aZip.charAt(i);
                    if (!Character.isDigit(number)) {
                        errorMessage += "Zip must only contain numbers\n";
                    }
                }
            } else {
                errorMessage += "Zip must be 5 digits\n";
            }
        } catch (Exception ex) {
            errorMessage += "Invalid input\n";
        }
        return aZip;
    }
    
    public static String getState(String aState) {
        try {
            if (aState.length() == 2) {
                for (int i = 0; i < aState.length(); i++) {
                    char letter = aState.charAt(i);
                    if (!Character.isLetter(letter)) {
                        errorMessage += "State must only contain letters\n";
                    }
                }
            } else {
                errorMessage += "State must be 2 letters\n";
            }
        } catch (Exception ex) {
            errorMessage += "Invalid input\n";
        }
        return aState;
    }
    
    public static String getPhone(String aPhone) {
        try {
            if (aPhone.length() == 10) {
                for (int i = 0; i < aPhone.length(); i++) {
                    char number = aPhone.charAt(i);
                    if (!Character.isDigit(number)) {
                        errorMessage += "Phone number must only contain numbers\n";
                    }
                }
            } else {
                errorMessage += "Phone number must be 10 digits\n";
            }
        } catch (Exception ex) {
            errorMessage += "Invalid input\n";
        }
        return aPhone;
    }
    
    //First, check that the input is a length of 6.
    //Second, check that the first two characters are letters
    //Lastly, check that the last four characters are numbers
    public static String getMembership(String aMembership) {
        try {
            if (aMembership.length() == 6) {
                for (int i = 0; i < 2; i++) {
                    char letter = aMembership.charAt(i);
                    if (!Character.isLetter(letter)) {
                        errorMessage += "Membership must start with 2 letters\n";
                    }
                }
                for (int i = 2; i < aMembership.length(); i++) {
                    char number = aMembership.charAt(i);
                    if (!Character.isDigit(number)) {
                        errorMessage += "Membership must end with 4 numbers\n";
                    }
                }
            } else {
                errorMessage += "Membership must be 6 characters\n";
            }
        } catch (Exception ex) {
            errorMessage += "Invalid input\n";
        }
        return aMembership;
    }
    
    //Check whether the quantity input is an Integer then check that it is
    //not less than 0
    public static String getQuantity(String aQty) {
        try {
            int qty = Integer.parseInt(aQty);
            if (qty < 0) {
                errorMessage += "Quantity cannot be less than 0\n";
            }
        } catch (Exception ex) {
            errorMessage += "Invalid input. Must be an integer value\n";
        }
        return aQty;
    }
    
    //method to return the error message	
    public static String getError() {
        return errorMessage;
    }

    //method to clear the error message
    public static void clearError() {
        errorMessage = "";
    }

}
