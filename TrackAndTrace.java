import java.util.Scanner;

public class TrackAndTrace{

    public static Scanner kbd = new Scanner(System.in);

    public static int n = 0;
    
    public static boolean overlap(int p1Start, int p1End, int p2Start, int p2End){ 
        
        if (p1Start <= p2End && p2Start >= p1End) {
            return false;
        }else if (p1Start >= p2End && p2Start <= p1End) {
            return false;
        }else if (p1End >= p2Start && p2End <= p1Start) {
            return false;
        }else{
            return true;
        }
    }
    
    public static int getOverlaps(int infectStart, int infectEnd) {
    
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Enter the number of customers: ");
        int numCustomers = kbd.nextInt();
        
         for (int i = 0; i < numCustomers; i++){
            System.out.println("Enter the customer's name: ");
            String customerName = kbd.next();
            
            System.out.println("Enter the arrival time: ");
            int arrivalTime = kbd.nextInt();
            
            System.out.println("Enter the departure time: ");
            int departureTime = kbd.nextInt();
            
            if (arrivalTime <= infectStart && departureTime >= infectEnd) {
                System.out.println(customerName + " does not need a test.");
                n = n;
            } else if (arrivalTime >= infectEnd || departureTime <= infectStart){
                System.out.println(customerName + " does not need a test.");
                n = n;
            } else if (arrivalTime == infectStart && departureTime == infectEnd){
                System.out.println(customerName + " needs a test.");
                n += 1;
            } else {
                System.out.println(customerName + " needs a test.");
                n += 1;
            }
        }
        System.out.println("There are " + n + " tests needed.");
        return n;
    }
    
    public static void main(String[] args){
        System.out.println("Enter the start time: ");
        int infectStart = kbd.nextInt();
        
        System.out.println("Enter the end time: ");
        int infectEnd = kbd.nextInt();
        
        getOverlaps(infectStart, infectEnd);
    }
}
