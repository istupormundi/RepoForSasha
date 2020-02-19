package task2;

/*реаализуйте класс Саг, моделирующий передвижение автомобиля на бензиновом топливе по оси х.
 Предоставьте методы для передвижения автомобиля на заданное количество километров,
 заполнения топливного бака заданным количеством литров бензина,
 вычисления расстояния,  пройденного от начала координат, а также уровня топлива в баке.
 Укажите расход топлива (в л/км) в качестве параметра конструктора данного класса.
 */

public class Car {
    double fuelConsumption;
    double tankVolume = 50;
    double fuelLevelInTank;
    double x; // I consider x here as initial distance from OX

    Car(double x, double fuel){
        this.x = x;
        this.fuelLevelInTank = fuel;
    }

    //no point to add fuelConsumption to constructor; it's a function of speed
    private final double calculateFuelConsumption(double speed, double distance){

        final double vol1 = 5; //l
        final double vol2  = 10; //l

        double consumption; // l/km
        if (speed >= 100){
            consumption = vol1 / distance;
        }
        else{
            consumption = vol2 / distance;
        }

        return consumption;
    }

    public double drive (double speed, double km){
        return speed / km;
    }

    public double distanceFromOX(double speed, double hours){
        //this function does not make sense, too, cause we do not know vectors p
        double km = speed * hours;
        System.out.println("FAKE distanceFromOX = " + km);

        return km - this.x;
    }

    public double showFuelLevelInTank(double speed, double distance){
        double spentFuel = calculateFuelConsumption(speed, distance);
        double currentFuelLevel = this.fuelLevelInTank - spentFuel;
        System.out.println("currentFuelLevel  = " + currentFuelLevel);

        return currentFuelLevel;
    }

    public double refillFuelTank(double fuelToAdd){
        double newFuelLevel =  this.fuelLevelInTank + fuelToAdd;

        if (newFuelLevel > tankVolume){
            newFuelLevel = 50;
            System.out.println("OUT OF TANK");
        }
        System.out.println("Tank was refilled. New Fuel Level is = " + newFuelLevel);

        return newFuelLevel;
    }
}
