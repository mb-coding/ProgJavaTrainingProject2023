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
        System.out.println(items);
        moneyLeft();
    }
}


