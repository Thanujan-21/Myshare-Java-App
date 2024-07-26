package View;

/**
 *
 * @author Theni
 */




public class Theni_Part {
    private int orderId;
    private String customerName;
    private String email;
    private String product;
    private double unitPrice;
    private int quantity;
    private double totalPrice;
    private String orderStatus;
    
    public Theni_Part(int orderId, String customerName, String email,String product, double unitPrice, int quantity, double totalPrice, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.email = email;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
    }
    
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }
    
    public String getEmail(){
        return email;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
    

    // Method to calculate the total price based on quantity and other factors
    private double calculateTotalPrice(int quantity, double unitPrice) {
        return quantity * unitPrice;
    }

    // Method to convert Theni_Part object data to an array for adding to the table model
     public Object[] toObjectArray() {
        return new Object[] { orderId, customerName,email,  product, unitPrice, quantity, totalPrice, orderStatus };
    }

    public static void main(String[] args) {
    }
}




