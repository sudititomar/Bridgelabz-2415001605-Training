class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.totalCost = 0.0;
    }

    CarRental(String customerName, String carModel, int rentalDays, double ratePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = rentalDays * ratePerDay;
    }
}

