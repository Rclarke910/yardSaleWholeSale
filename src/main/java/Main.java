import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void yardSaleWholeSale(String name, double price, int qty){

        double totalPrice = price * qty;
        String formattedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy"));

        System.out.println("Name\tQty\tPrice\tTotal");
        System.out.println("----\t----\t-----\t-------");
        System.out.printf("%-8s%-8d$%.1f\t$%.2f%n", name, qty, price, totalPrice);

        System.out.println("\n\t Thank you. Come again!!!\n");
        System.out.println("Purchased on: " + formattedDate);
    }


    public static void main(String[] args){
        yardSaleWholeSale("eggs", 5.99, 3);
    }
}
