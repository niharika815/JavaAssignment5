import java.util.Scanner;

class Item {
    int code;
    double price;

    // Method to accept data
    void getData(Scanner sc) {
        System.out.print("Enter item code: ");
        code = sc.nextInt();
        System.out.print("Enter item price: ");
        price = sc.nextDouble();
    }

    // Method to display data
    void display() {
        System.out.printf("%-10d %-10.2f\n", code, price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.println("\nEnter details for item " + (i + 1));
            items[i].getData(sc);
            total += items[i].price;
        }

        System.out.println("\nCode       Price");
        System.out.println("----------------------");
        for (int i = 0; i < 5; i++) {
            items[i].display();
        }

        System.out.println("----------------------");
        System.out.printf("Total      %.2f\n", total);

        sc.close();
    }
}