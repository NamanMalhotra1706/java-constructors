class CarRental {
    
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: Rs." + dailyRate);
        System.out.println("Total Cost: Rs." + calculateTotalCost());
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        // car rental object
        CarRental rental1 = new CarRental("Naman", "DEFENDER", 5, 40.0);

        // rental details
        rental1.displayRentalDetails();
    }
}