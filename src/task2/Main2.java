package task2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Tank Volume");
        double tankVolume = Double.parseDouble(input.nextLine());

        System.out.println("Enter Fuel Consumption");
        double fuelConsumption = Double.parseDouble(input.nextLine());

        System.out.println("How many km do you want to drive?");
        int km = Integer.parseInt(input.nextLine());

        Car myRecklessCar = new Car(10, fuelConsumption, 40, tankVolume);
        myRecklessCar.drive(km);
        myRecklessCar.displayFuelLevel();
        myRecklessCar.returnDistanceFromOX();
        myRecklessCar.refillFuelTank(30);
        myRecklessCar.displayFuelLevel();

        myRecklessCar.drive(50);
        myRecklessCar.displayFuelLevel();
    }
}
