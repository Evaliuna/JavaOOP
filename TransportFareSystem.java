abstract class Transport {    
    double fare; 
    abstract void calculateFare(double distance);

    void printTicket() {
        System.out.println("Your ticket fare is: $" + String.format("%.2f", fare));    }
    }
class Bus extends Transport {
    Boolean student;

    Bus(Boolean student) {      
     this.student = student;
    }   

   @Override
    void calculateFare(double distance){ 
       fare = distance *1.5;
      if(student){  
       fare = fare *0.5;
     }   
}
   @Override 
   void printTicket(){ System.out.println("Bus Ticket : " +(student ?"Student Discount Applied" : ""));
   super.printTicket();  }
 }                                                           
class Train extends Transport {  

    @Override
    void calculateFare(double distance) {    
     fare = distance * 2.0;
    }
    @Override   
    void printTicket() {
        System.out.print("Train Ticket\n");   
        super.printTicket();
    }
  }
class Metro extends Transport {
    boolean peakHour;
    Metro(boolean peakHour) {    
    this.peakHour = peakHour;
    }

    @Override   
    void calculateFare(double distance) {
        fare = distance * 2.5;  
        if (peakHour) {
            fare *= 1.25;     
       }
    }

    @Override
    void printTicket() {        
        System.out.print("Metro Ticket" + (peakHour ? " (Peak Hour Surcharge Applied)" : ""));
        super.printTicket();   
    }
}
public class TransportFareSystem{
 public static void main(String args[]){  
    Transport bus = new Bus(true);
    bus.calculateFare(3.0);  
    bus.printTicket();
    Transport bus2 = new Bus(false);
    bus2.calculateFare(3.0); 
    bus2.printTicket();
    Transport train = new Train();
    train.calculateFare(3.0);  
    train.printTicket();
    Transport metro = new Metro(true);
    metro.calculateFare(3.0); 
    metro.printTicket();
 }
}
