

public class TestInvoice {
    public static void main(String[] args) {
        InvoiceItem item1 = new InvoiceItem("1", "Laptop", 2 ,1500.00);
        InvoiceItem item2 = new InvoiceItem("2", "Mouse", 5, 25.00);
        InvoiceItem item3 = new InvoiceItem("3", "Keyboard", 3, 45.00);
        InvoiceItem item4 = new InvoiceItem("4", "Monitor", 1, 300.00);

        //copy of one item
        InvoiceItem item5 = new InvoiceItem(item1);

        //print items
        System.out.println();
        System.out.println();
        System.out.println("Total $" + item1.getTotal());
        System.out.println("Total $" + item2.getTotal());
        System.out.println("Total $" + item3.getTotal());
        System.out.println("Total $" + item4.getTotal());
        System.out.println("Total $" + item5.getTotal());

        //$ of invoices
        System.out.println("Number of invoices generated: " + InvoiceItem.getInvoiceCount());
    
    }

}