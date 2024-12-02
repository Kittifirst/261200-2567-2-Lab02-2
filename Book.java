public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title,String author,double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        } else {
            System.out.println("This Price is Negative");
        }
    }

    public void applyDiscount(double discountPer){
        if ((discountPer > 0.0) && (discountPer < 100.0)) {
            double discount = this.price * (discountPer / 100);
            this.price -= discount;
            System.out.printf("Discount applied: %.2f%%\n", discountPer);
            System.out.printf("New price: %.2f\n", this.price);
        }
        else {
            System.out.println("An appropriate error message and do not update the price.");
        }
    }
}



