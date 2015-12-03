import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalesTax {

    public static void main(String[] args) {
        double purchaseAmount = 20.13;
        double tax = purchaseAmount * 0.06;
        double total = purchaseAmount + tax;

        System.out.println("Sales tax is " + round(tax, 2) + " on an item that cost " + purchaseAmount +
                " for a total of " + round(total, 2));
        }

    public static double round(double value, int places) {
            if (places < 0) throw new IllegalArgumentException();
            BigDecimal bd = new BigDecimal(value);
            bd = bd.setScale(places, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }
}