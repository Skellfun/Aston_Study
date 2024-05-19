package lesson_2.task_1;

public class Sedan extends Car{

    private int luxuryLevel;
    private int numberOfDoors;
    private FuelTypes fuelType;
    private int trunkCapacity;

    public Sedan(int luxuryLevel, int numberOfDoors, FuelTypes fuelType, int trunkCapacity) {
        this.luxuryLevel = luxuryLevel;
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.trunkCapacity = trunkCapacity;
    }

    public int getLuxuryLevel() {
        return luxuryLevel;
    }

    public void setLuxuryLevel(int luxuryLevel) {
        this.luxuryLevel = luxuryLevel;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setDoorCount(int doorCount) {
        this.numberOfDoors = doorCount;
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
        System.out.println("врум-врум");
    }

    @Override
    public void stop() {
        System.out.println("*звуки торможения*");
    }
}
