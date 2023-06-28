import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {

    // initializing variables
    Double money = 1000.0;
    Integer productQuantity = 0;
    List<String> items = new ArrayList<String>(); {
        items.add("Falcon500");
        items.add("Falcon Motor Shaft");
        items.add("CANcoder");
        items.add("CANivore");
        items.add("PDP");
        items.add("Battery Cable");
        items.add("Talon Tach");
        }

        List<Double> prices = new ArrayList<Double>(); {
        prices.add(219.99);
        prices.add(19.99);
        prices.add(69.99);
        prices.add(299.99);
        prices.add(204.99);
        prices.add(15.99);
        prices.add(13.99);
        }

    public static void main(String[] args) {
        Main instance = new Main();
        System.out.println("\n" + "Below are the products that you can buy from CTRE:" + "\n");
        instance.doStuff();

    }

    // method that prints the amount of money left
    public void moneyLeft() {
        System.out.println("You currently have $" + money + ".");
    }

    public void doStuff() {
        for (int i = 0; i < 5; i++) {
            String product = items.get(i) + " $" + (prices.get(i)).toString();
            System.out.println(product);
        }
        System.out.println("\n" + "What product would you like to add to your cart?");
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
                calculate(0);
            }
            else if (newProduct.equals(items.get(1))) {
                calculate(1);
            }
            else if (newProduct.equals(items.get(2))) {
                calculate(2);
            }
            else if (newProduct.equals(items.get(3))) {
                calculate(3);
            }
            else if (newProduct.equals(items.get(4))) {
                calculate(4);
            }
            else if (newProduct.equals(items.get(5))) {
                calculate(5);
            }
            else if (newProduct.equals(items.get(6))) {
                calculate(6);
            }
        } 
        catch(Exception ex)
        {
            System.out.println("Invalid Entry");
        }

    }

    public void calculate(Integer x){
        money = money - (productQuantity * prices.get(x));
        moneyLeft();
    }
}
