public class Main
{
    public static void main(String[] args)
    {
        ShoppingBill s1=new ShoppingBill(1,10000,2);
        ShoppingBill s2=new ShoppingBill(2,20000,3);

        double bill1 = s1.findBill();
        double discount1 = s1.findDiscount(bill1,0.15);

        double bill2 = s2.findBill();
        double discount2 = s2.findDiscount(bill2,0.25);

        System.out.println("Bill-1");
        System.out.println("Bill Amount:"+bill1);
        System.out.println("Discount:"+discount1);
        System.out.println();
        System.out.println("Bill-2");
        System.out.println("Bill Amount:"+bill2);
        System.out.println("Discount:"+discount2);
    }


}
