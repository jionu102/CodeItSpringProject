package Head02_OOP_Programming.example02;

class Order {
    String customer;
    String product;
    int quantity;
    int price;

    Order(String customer, String product, int quantity, int price) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    int getTotalPrice() {
        return quantity * price;
    }

    void printOrderSummary() {
        System.out.println(this.customer + " 님이 주문한 " + this.product + " " + this.quantity + "권의 총액은 " + getTotalPrice() + "원입니다.");
    }
}

public class OOPOrderManager {
    public static void main(String[] args) {
        Order order = new Order("Alice", "Book", 2, 15000);
        order.printOrderSummary();
    }
}
