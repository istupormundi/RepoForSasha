package task2;

public class Car {
    double fuelConsumption; // l/km
    int mileage; // I consider it as initial distance from OX
    double tankVolume;
    double fuelLevelInTank;

    Car(int mileage, double fuelConsumption, double fuelLevelInTank, double tankVolume){
        this.mileage = mileage;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevelInTank = fuelLevelInTank;
        this.tankVolume = tankVolume;
    }

    //should be called after each driving
    private void increaseMileAgeAfterDriving(int km){
        mileage += km;
        //System.out.println("mileage: " + mileage);
    }

    //should be called after each driving
    private double calculateFuelLevelInTank(int km){
        //System.out.println("fuelLevelInTank BEFORE driving: " + fuelLevelInTank);
        fuelLevelInTank = fuelLevelInTank - fuelConsumption * km;
        //System.out.println("fuelLevelInTank AFTER driving: " + fuelLevelInTank);

        return fuelLevelInTank;
    }

    private void estimateTrip(int km){
        double delta = fuelLevelInTank - fuelConsumption * km;
        double requiredFuel = fuelConsumption * km;
        double expectedDistance = fuelLevelInTank / fuelConsumption;

        if (delta > 0 && requiredFuel < tankVolume){
            System.out.println("W A R N I N G: not enough fuel to the trip");
        }

        if (expectedDistance < km) {
            System.out.println("W A R N I N G: you can drive only " + expectedDistance + " km");
        }
    }

    public void stopCarIfTankIsEmpty(){
        System.out.println("STOPPED. FUEL TANK IS EMPTY");
    }

    public void drive(int km){
        int currentRun = 0;
        estimateTrip(km);

        //quasi event listener
        for (int i = 1; i <= km; i++){
            currentRun++;
            double fuel = calculateFuelLevelInTank(i);
            if (fuel <= 1){
                stopCarIfTankIsEmpty();
                System.out.println("W A R N I N G: !!!Refill the tank!!!");
                break;
            }
        }
        increaseMileAgeAfterDriving(currentRun);
    }

    public void displayFuelLevel(){
        System.out.println("CURRENT FUEL LEVEL: " + fuelLevelInTank);
    }

    //still mostly useless method
    public double returnDistanceFromOX(){
        //System.out.println("mileage: " + mileage);

        return mileage;
    }

    public void refillFuelTank(double fuelToAdd){
        //System.out.println("fuelLevelInTank BEFORE refill: " + fuelLevelInTank);

        //льём по литрику (: quasi EventHandler
        for(int i = 1; i <= fuelToAdd; i++){
            fuelLevelInTank++;
            if (fuelLevelInTank >= tankVolume){
                break;
            }
        }
        //System.out.println("fuelLevelInTank AFTER refill: " + fuelLevelInTank);
    }
}
