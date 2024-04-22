package opgave03.models.renting;

import opgave03.models.VehicleComponent;

public class Rental extends RentDecorator {
    private int rentalPrice;
    private boolean rentend = false;

    public Rental(VehicleComponent decorated, int rentalPrice) {
        super(decorated);
        this.rentalPrice = rentalPrice;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public boolean isRentend() {
        return rentend;
    }

    public void rent(boolean rentend) {
        this.rentend = rentend;
    }
}
