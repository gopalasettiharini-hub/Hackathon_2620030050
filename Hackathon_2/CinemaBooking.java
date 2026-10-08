import java.util.Scanner;

class MovieTicket {
    String name;
    double price;
    int tickets;

    MovieTicket(String name, double price, int tickets) {
        this.name = name;
        this.price = price;
        this.tickets = tickets;
    }

    void displayBill() {
        double total = price * tickets;
        double discount = 0;

        if (tickets >= 5) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("Movie: " + name);
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}

public class CinemaBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double price = sc.nextDouble();
        int tickets = sc.nextInt();

        MovieTicket m = new MovieTicket(name, price, tickets);
        m.displayBill();
    }
}