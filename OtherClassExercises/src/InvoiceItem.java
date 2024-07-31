public class InvoiceItem  {

    //defining the class fields;
    private String id;
    private String desc;
    private int quantity;
    private double unitPrice;

    //creating the main constructor;
    public InvoiceItem (String id, String desc, int quantity, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    //creating getters


    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    //creating setters
    public void setQty(int qty) {
        this.quantity = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    //creating custom getters
    public double getTotal() {
        return this.unitPrice*this.quantity;
    }

    public String toString() {
        return "InvoiceItem[id="+this.getID()+", desc="+this.getDesc()+", qty="+this.getQty()+", unitPrice="+this.getUnitPrice()+"]";
    }

}