import metadata.ParkingSpotType;
import metadata.VehicleType;

public abstract class ParkingSpot {
    private Vehicle vehicle;
    private String spotNumber;
    private boolean isFree;
    private final ParkingSpotType parkingSpotType;

    public ParkingSpot(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public Vehicle getVehicleType() {
        return vehicle;
    }

    public void setVehicleType(Vehicle vehicleType) {
        this.vehicle = vehicleType;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(String spotNumber) {
        this.spotNumber = spotNumber;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isFree = false;
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicle = null;
        this.isFree = true;
    }
}

