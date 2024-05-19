package lesson_2.task_1;

public class Truck extends Car{

    private int maxLoadCapacity;
    private int numberOfDoors;
    private FuelTypes fuelType;
    private int trunkCapacity;

    public Truck(int maxLoadCapacity, int numberOfDoors, FuelTypes fuelType, int trunkCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.trunkCapacity = trunkCapacity;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public FuelTypes getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelTypes fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public void start() {
        System.out.println("гулкий врум-врум");
    }

    @Override
    public void stop() {
        System.out.println("долгие звуки торможения");
    }
}
