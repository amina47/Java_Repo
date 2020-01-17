package basic;

public class guest {

    private String name;
    private int guestCapacity;
    private int guestCount;
    private boolean seatAvailability;
    private int partySize;
    private int seatCount;

    public guest() {
    }

    public void printRestaurantSummary() {

        System.out.println ("Name" + name);
        System.out.println ("guestCapacity+guestCapacity");
        System.out.println ("guestcount+guestCount");
        System.out.println ("seatcount");
    }


    public boolean isseatavailable(int partySize) {
        /* private void int seatcount = guestCapacity - guestCount; */

        if (partySize <=( int seatCount)){

            System.out.println(" seat party:welcome");

        }    else{
            System.out.println("seating not available- waiting time=()");
        }
        public void setDetails (String name,int guestCapacity){
            this.name = name;
            this.guestCapacity = guestCapacity;
        }
        public void setGuestCount ( int guestCount){
            this.guestCount += guestCount;
        }
        public void setRemoveParty(int removeParty ){
            this.guestCount = this.guestCount - removeParty;
        }

    }


}

/*
        * Create a restaurant class with attribute name, guestCapacity, guestCount
 * 1. Create a method that tells user if the seats are available
         * 2. Create a method that seatsParty
         * 3. Create a method that removesParty
         * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
        * 5. Create a method that printsRestaurantSummary
        */