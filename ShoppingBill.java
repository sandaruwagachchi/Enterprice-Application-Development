public class ShoppingBill extends Bill
{
    private double unitPrice=0;
    private int quantity=0;

    public ShoppingBill(int billNumber,double unitPrice,int quantity)
    {
        super(billNumber);
        this.unitPrice=unitPrice;
        this.quantity=quantity;

    }
    public double findBill()
    {
        return unitPrice * quantity;
    }
}
