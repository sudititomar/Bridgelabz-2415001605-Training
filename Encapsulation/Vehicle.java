abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 1000; }
    public String getInsuranceDetails() { return "Standard coverage"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; }
    public double calculateInsurance() { return 300; }
    public String getInsuranceDetails() { return "Basic coverage"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Large vehicle coverage"; }
}
