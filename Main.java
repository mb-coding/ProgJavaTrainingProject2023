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
        for (int i = 0; i < 5; i++) {
            String product = items.get(i) + " $" + (prices.get(i)).toString();
            System.out.println(product);
        }
        System.out.println("What product would you like to add to your cart?");
        try (Scanner scanner = new Scanner(System.in);)
        {
            String newProduct = scanner.nextLine();
            System.out.println(newProduct);
            System.out.println(newProduct == items.get(1));
            if (newProduct == items.get(0)){
                System.out.print("Yay");
            }
            else {
                System.out.print("Didn't work");
            }
        } 
        catch(Exception ex)
        {
            System.out.println("Invalid Entry");
        }


    }
}


