import javax.swing.*;

public class Uppg2 {

    public static void main(String[] args) {
        boolean going = true;
        while (going)
        try {
            double price = calculatePrice(Integer.parseInt(JOptionPane.showInputDialog("Age?")));
            JOptionPane.showMessageDialog(null, "PRICE = " + price + "SEK");
            going = false;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Bad input, please use numbers only.");
        } catch (IllegalArgumentException e1) {
            JOptionPane.showMessageDialog(null, "Negative age, please use a positive age.");
        }



    }

    public static double calculatePrice(int age) {
        double price;
        if (age <0)  {
            throw new IllegalArgumentException("Negative price.");
        } else if (age < 7) {
            price  = 0;
            return price;
        } else if (age <20) {
            price = 14;
            return price;
        } else if (age <26) {
            price = 28;
            return price;
        }  else if (age < 65) {
            price = 34;
            return price;
        } else {
            price = 28;
            return price;
        }

    }
}
