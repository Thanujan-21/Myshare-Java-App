package View;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abishaya
 */

public class Abi_Part {
    private int Id;
    private String EmployeeName;
    private String email;
    private String position;
   
    
    public Abi_Part(int Id, String EmployeeName, String email,String position ) {
        this.Id = Id;
        this.EmployeeName = EmployeeName;
        this.email = email;
        this.position = position;
       
    }
    
    public int getId() {
        return Id;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }
    
    public String getEmail(){
        return email;
    }

    public String getposition() {
        return position;
    }

    // Method to convert Theni_Part object data to an array for adding to the table model
     public Object[] toObjectArray() {
        return new Object[] { Id, EmployeeName,email,  position };
    }

    public static void main(String[] args) {
    }
}




