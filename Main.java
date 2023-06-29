import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;

public class Main {
    Double money = 1000.0;
    Integer productQuantity = 0;
    String newProduct = "";
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
    List<String> boughtItems = new ArrayList<String>(); {
    }
    List<Integer> boughtQuantities = new ArrayList<Integer>(); {
    }

    public static void main(String[] args) {
        Main instance = new Main();
        System.out.println("\n" + "Below are the products that you can buy from CTRE:" + "\n");
        for (int i = 0; i < 5; i++) {
            String product = instance.items.get(i) + " $" + (instance.prices.get(i)).toString();
            System.out.println(product);
        }
        instance.doStuff();
    }

    // method that prints the amount of money left
    public void moneyLeft() {
        System.out.println("\n" + "You currently have $" + money + " left.");
    }

    public void doStuff() {
        System.out.println("\n" + "What product would you like to add to your cart?");
        try (Scanner productScanner = new Scanner(System.in);)
        {
            newProduct = productScanner.nextLine();
            if (newProduct.equals(items.get(0)) || newProduct.equals(items.get(1)) || newProduct.equals(items.get(2)) || newProduct.equals(items.get(3)) || newProduct.equals(items.get(4)) || newProduct.equals(items.get(5)) || newProduct.equals(items.get(6))){
                System.out.println("\n" + "How many " + newProduct + "s " + "would you like to add to your cart?");
            }
            else {
                System.out.println("Please enter a valid product");
                doStuff();
            }

            try(Scanner quantityScanner = new Scanner(System.in);)
            {
                productQuantity = quantityScanner.nextInt();
            }
            catch(Exception ex)
            {
                System.out.println("Please input a positive integer." + "\n");

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
            else {
                System.out.println("Error");
            }
        } 
        catch(Exception ex)
        {
            System.out.println("Error");
        }

    }

    public void calculate(Integer x){
        Double totalPrice = (productQuantity * prices.get(x));
        money = money - totalPrice;
        if (money < 0.0){
            System.out.println("\n" + "Sorry, you don't have enough to buy this product.");
            money = money + totalPrice;
        }
        else{
            System.out.println(productQuantity.toString() + " " + newProduct + "s were added to your cart.");
            boughtItems.add(items.get(x));
            boughtQuantities.add(productQuantity);
        }
        money = Math.round(money*100.0) / 100.0;
        moneyLeft();
        if (money > 13.99) {
            areDone();
        }
        else {
            System.out.println("You no longer have enough money to buy anything else.");
            endGame();
        }

    }
     
    public void areDone(){
        System.out.println("\n" + "Do you want to continue shopping? Please input Yes or No.");
        try(Scanner areDoneScanner = new Scanner(System.in);)
        {
            String done = areDoneScanner.nextLine();
            if (done.equals("No")){
                doStuff();
            }
            else if (done.equals("Yes")) {
                endGame();
            }
            else{
                areDone();
            }
        }
        catch(Exception ex)
        {
            System.out.println("Invalid Entry");
        }
    }

    public void endGame() {
        System.out.println("\n" + "Below are the items you purchased:");
        for (int i = 0; i < boughtItems.size(); i++) {
            String product = "x" + (boughtQuantities.get(i)).toString() + " " + boughtItems.get(i);
            System.out.println(product);
        }
    }
}
