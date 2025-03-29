// Karol G00436758
public class CalcTax {
    public static void main(String[] args) {
        final double TAX_RATE = 0.21;
        double wage = 450, taxPaid;
        // Calculate the tax paid by multiplying the wage by the tax rate
        taxPaid = wage * TAX_RATE;
        System.out.println("WAGE: £" + wage);
        System.out.println("TAX RATE: " + TAX_RATE);
        System.out.println("TAX PAID: " + taxPaid);
        System.out.println("TAKE HOMTE PAY: " + (wage - taxPaid));
    }
}
