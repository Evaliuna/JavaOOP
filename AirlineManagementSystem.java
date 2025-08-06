class Passenger {
    String name, passport, ticket;
    
    Passenger(String name, String passport, String ticket) {
        this.name = name;
        this.passport = passport;
        this.ticket = ticket;
    }
    
    void checkIn() {
        System.out.println(name + " checking in (Ticket: " + ticket + ")");
    }
    
    void board() {
        System.out.println(name + " boarding");
    }
}

class EconomyPassenger extends Passenger {
    String baggage, meal;
    
    EconomyPassenger(String name, String passport, String ticket, 
                   String baggage, String meal) {
        super(name, passport, ticket);
        this.baggage = baggage;
        this.meal = meal;
    }
    
    @Override void checkIn() {
        super.checkIn();
        System.out.println("Baggage: " + baggage + ", Meal: " + meal);
    }
}

class BusinessPassenger extends EconomyPassenger {
    boolean lounge, priority;
    
    BusinessPassenger(String name, String passport, String ticket,
                     String baggage, String meal, 
                     boolean lounge, boolean priority) {
        super(name, passport, ticket, baggage, meal);
        this.lounge = lounge;
        this.priority = priority;
    }
    
    @Override void checkIn() {
        System.out.println(name + " at Business Class check-in" + 
                          (lounge ? " (Lounge Access)" : ""));
    }
    
    @Override void board() {
        System.out.println(name + (priority ? " boarding FIRST" : " boarding"));
    }
}

public class AirlineMangementSystem {
    public static void main(String[] args) {
        Passenger[] passengers = {
            new Passenger("David", "P111", "T111"),
            new EconomyPassenger("Emily", "P222", "T222", "20kg", "Veg"),
            new BusinessPassenger("Mike", "P333", "T333", "30kg", "Non-Veg", true, true)
        };
        
        for (Passenger p : passengers) {
            p.checkIn();
            p.board();
            System.out.println();
        }
    }
}
