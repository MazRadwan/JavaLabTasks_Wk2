

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

 
    private static int invoiceCount = 0;

    // constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }

    // copy constructor
    public InvoiceItem(InvoiceItem other){
        this.id = other.id;
        this.desc = other.desc;
        this.qty = other.qty;
        this.unitPrice = other.unitPrice;
        invoiceCount++;

    }

    //gettrs
    public String GetID(){
        return id;
    }
    public String GetDesc(){
        return desc;
    }
    public int GetQty(){
        return qty;
    }
    public double GetUnitPrice(){
        return unitPrice;
    }

    //setters
    public void setQty(int qty){
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    //calculate total
    public double getTotal(){
        return unitPrice * qty;
    }


    public String toString(){
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
    }
    
    //static method get invoices
    public static int getInvoiceCount(){
        return invoiceCount;
    }   
}
