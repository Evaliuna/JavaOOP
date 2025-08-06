// Base Order class
class Order {
    private String orderID;
    private String customerName;
    private double totalAmount;

    public Order(String orderID, String customerName, double totalAmount) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public void processOrder() {
        System.out.println("Processing order #" + orderID);
    }

    public void displayDetails() {
        System.out.println("Order #" + orderID + 
                         "\nCustomer: " + customerName + 
                         "\nTotal: $" + totalAmount);
    }
}

// OnlineOrder extends Order
class OnlineOrder extends Order {
    private String deliveryAddress;
    private String paymentMethod;

    public OnlineOrder(String orderID, String customer, double total, 
                      String address, String payment) {
        super(orderID, customer, total);
        this.deliveryAddress = address;
        this.paymentMethod = payment;
    }

    @Override
    public void processOrder() {
        super.processOrder();
        System.out.println("Shipping to: " + deliveryAddress);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Address: " + deliveryAddress + 
                          "\nPayment: " + paymentMethod);
    }
}

// ExpressOrder extends OnlineOrder
class ExpressOrder extends OnlineOrder {
    private String deliveryTime;
    private boolean priorityHandling;

    public ExpressOrder(String orderID, String customer, double total, 
                       String address, String payment,
                       String deliveryTime, boolean priority) {
        super(orderID, customer, total, address, payment);
        this.deliveryTime = deliveryTime;
        this.priorityHandling = priority;
    }

    @Override
    public void processOrder() {
        System.out.println("=== EXPRESS ORDER ===");
        super.processOrder();
        System.out.println("Guaranteed delivery: " + deliveryTime);
        System.out.println("Priority handling: " + (priorityHandling ? "YES" : "NO"));
    }
}

// ECommercePlatform main class
public class ECommercePlatform {
    public static void main(String[] args) {
        Order regular = new Order("1001", "Bob Johnson", 49.99);
        OnlineOrder online = new OnlineOrder("1002", "Alice Smith", 99.99, 
                                           "123 Main St", "Credit Card");
        ExpressOrder express = new ExpressOrder("1003", "Charlie Brown", 149.99, 
                                             "456 Oak Ave", "PayPal", 
                                             "Next Day", true);

        System.out.println("=== Processing Orders ===");
        regular.processOrder();
        System.out.println();
        
        online.processOrder();
        System.out.println();
        
        express.processOrder();
    }
}
