import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {

    // initializing variables
    static Integer money = 1000;

    // method that prints the amount of money left
    public static void moneyLeft() {
        System.out.println("You currently have $" + money + ".");
    }

    public static void main(String[] args) {
        List<String> items = new ArrayList<String>();
        items.add("Falcon500");
        items.add("Falcon Motor Shaft");
        items.add("CANcoder");
        items.add("CANivore");
        items.add("PDP");
        items.add("Battery Cable");
        items.add("Talon Tach");
        moneyLeft();
        List<Double> prices = new ArrayList<Double>();
        prices.add(219.99);
        prices.add(19.99);
        prices.add(69.99);
        prices.add(299.99);
        prices.add(204.99);
        prices.add(15.99);
        prices.add(13.99);
        System.out.println("Below are the products that you can buy from CTRE:");
        Integer productQuantity = 0;
        Double newMoney = 1000.0;
        for (int i = 0; i < 5; i++) {
            String product = items.get(i) + " $" + (prices.get(i)).toString();
            System.out.println(product);
        }
        System.out.println("What product would you like to add to your cart?");
        try (Scanner productScanner = new Scanner(System.in);)
        {
            String newProduct = productScanner.nextLine();
            System.out.println("How many " + newProduct + "s " + "would you like to add to your cart?");


            try(Scanner quantityScanner = new Scanner(System.in);)
            {
                productQuantity = quantityScanner.nextInt();
            }
            catch(Exception ex)
            {
                System.out.println("Invalid Entry");
            }

            if (newProduct.equals(items.get(0))){
                System.out.println("");
                newMoney = newMoney - (productQuantity * prices.get(0));
                System.out.print(newMoney);
            }
            else if (newProduct.equals(items.get(1))) {
                System.out.println("");
                newMoney = newMoney - (productQuantity * prices.get(1));
                System.out.print(newMoney);
            }
            else if (newProduct.equals(items.get(2))) {
                System.out.println("");
                newMoney = newMoney - (productQuantity * prices.get(2));
                System.out.print(newMoney);
            }
            else if (newProduct.equals(items.get(3))) {
                System.out.println("");
                newMoney = newMoney - (productQuantity * prices.get(3));
                System.out.print(newMoney);
            }
            else if (newProduct.equals(items.get(4))) {
                System.out.println("");
                newMoney = newMoney - (productQuantity * prices.get(4));
                System.out.print(newMoney);
            }
            else if (newProduct.equals(items.get(5))) {
                System.out.println("");
                newMoney = newMoney - (productQuantity * prices.get(5));
                System.out.print(newMoney);
            }
            else if (newProduct.equals(items.get(6))) {
                System.out.println("");
                newMoney = newMoney - (productQuantity * prices.get(6));
                System.out.print(newMoney);
            }
        } 
        catch(Exception ex)
        {
            System.out.println("Invalid Entry");
        }


    }
}


