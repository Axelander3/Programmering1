import javax.swing.*;

public class Uppg2 {

    public static void main(String[] args) {
        boolean going = true;
        while (going) { // gör så att den körs tills du har fått ett "valid" pris.
            try {
                double price = calculatePrice(Integer.parseInt(JOptionPane.showInputDialog("Age?")));
                JOptionPane.showMessageDialog(null, "PRICE = " + price + "SEK");
                going = false; // gör att den inte körs igen

            } catch (NumberFormatException e) { // Om input inte är bara nummer
                JOptionPane.showMessageDialog(null, "Bad input, please use numbers only.");
            } catch (IllegalArgumentException e1) { // om input är mindre änn 0
                JOptionPane.showMessageDialog(null, "Negative age, please use a positive age.");
            }
        }
    }

    public static double calculatePrice(int age) {
        double price;
        if (age <0)  { // kollar om åldrar
            throw new IllegalArgumentException("Negative price.");
        } else if (age <= 6) {
            price  = 0;
            return price;
        } else if (age <=19) {
            price = 14;
            return price;
        } else if (age <=25) {
            price = 28;
            return price;
        }  else if (age <= 65) {
            price = 34;
            return price;
        } else {
            price = 28;
            return price;
        }

    }
}
