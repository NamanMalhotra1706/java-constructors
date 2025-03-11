public class Vehicle{
    String ownerName;
    String vehicleType;

    static int registrationFee = 1000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs." + registrationFee);
    }

    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: Rs." + registrationFee);
    }

    public static void main(String[] args) {
        
        Vehicle vehicle1 = new Vehicle("Naman", "Car");
        Vehicle vehicle2 = new Vehicle("Naman Malhotra", "Bike");

        
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        System.out.println("\nUpdating registration fee...");
        Vehicle.updateRegistrationFee(150);

        
        System.out.println("\nAfter updating fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}    
