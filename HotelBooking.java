public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        System.out.println("Calling default Constructor");
        this.guestName ="Naman";
        this.roomType = "King's Bed";
        this.nights = 5;
    }

    HotelBooking(String guestName, String roomType, int nights){
        System.out.println("Parameterized Constructor called");
        this.guestName = guestName;
        this.nights = nights;
        this.roomType = roomType;
    }

    HotelBooking(HotelBooking obj){
        System.out.println("Copy Constructor called");
        this.guestName = obj.guestName;
        this.roomType = obj.roomType;
        this.nights = obj.nights;
    }

    public void getHotelBookingDetails(){
        System.out.println("Guest Name: " + this.guestName);
        System.out.println("Room Type: " + this.roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        booking1.getHotelBookingDetails();;

        System.out.println();
        HotelBooking booking2 = new HotelBooking("Manvi", "Double Decker", 5);
        booking2.getHotelBookingDetails();

        System.out.println();
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.guestName = "Manvi Grover";
        booking3.getHotelBookingDetails();

        System.out.println();
        booking2.getHotelBookingDetails();
        
    }
}
