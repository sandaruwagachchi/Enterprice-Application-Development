public class Bill
{
    private int billNumber;

public Bill(int billNumber)
{
    this.billNumber=billNumber;
}
public double findDiscount(double billAmount,double discountRate)
    {
       return billAmount * discountRate;
    }
}
