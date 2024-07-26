package View;

/**
 *
 * @author Kirisha
 */




public class Kirisha_part {
    private int orderId;
    private String customerName;
    private int EmployeeId;
    
    public Kirisha_part(int orderId, String customerName, int EmployeeId) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.EmployeeId = EmployeeId;
    }
    
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }
    
    public int getEmployeeId(){
        return EmployeeId;
    }
   

    // Method to convert Kirisha_part object data to an array for adding to the table model
     public Object[] toObjectArray() {
        return new Object[] { orderId, customerName,EmployeeId };
    }

    public static void main(String[] args) {
    }
}




