package Controller;

/**
 *
 * @author Thanujan
 */

import Model.Supplier;

public class SupplierController {

    Supplier SupplierObj;

    public Supplier addSupplier(String SID, String SupplierName, String Item) {
        SupplierObj = new Supplier(SID, SupplierName, Item);
        return SupplierObj;
    }
}