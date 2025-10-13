abstract class Vehicles {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicles(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public int getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public abstract double calculateFare(double distance);
    public String getVehicleDetails() {
        return vehicleId + " " + driverName + " " + ratePerKm;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    private String location;
    public Car(int id, String name, double rate) { super(id, name, rate); }
    public double calculateFare(double distance) { return distance * getRatePerKm(); }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}

class Bike extends Vehicle implements GPS {
    private String location;
    public Bike(int id, String name, double rate) { super(id, name, rate); }
    public double calculateFare(double distance) { return distance * getRatePerKm() * 0.8; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}

class Auto extends Vehicle implements GPS {
    private String location;
    public Auto(int id, String name, double rate) { super(id, name, rate); }
    public double calculateFare(double distance) { return distance * getRatePerKm() * 0.6; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}
