package task2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Car myRecklessCar = new Car(0, 0, 0, 0);
        //myRecklessCar.mileage = 10;

        /* TODO: @amatsuka, please, review
        смари, я добавила квази-бесконечный цикл
        не совсем, как ты просил, но для поиграться норм получилось
         */

        while (true){

            System.out.println("Enter Tank Volume");
            myRecklessCar.tankVolume = Double.parseDouble(input.nextLine());

            System.out.println("Enter Fuel Consumption");
            myRecklessCar.fuelConsumption = Double.parseDouble(input.nextLine());

            myRecklessCar.displayFuelLevel();

            System.out.println("How many km do you want to drive?");

            myRecklessCar.drive(Integer.parseInt(input.nextLine()));
            myRecklessCar.displayFuelLevel();
            myRecklessCar.returnDistanceFromOX();

            //give a chance to refill
            System.out.println("How much fuel do you want to add?");
            int petrol = Integer.parseInt(input.nextLine());

            myRecklessCar.refillFuelTank(petrol);
            myRecklessCar.displayFuelLevel();

            if (myRecklessCar.fuelLevelInTank <= 0){
                myRecklessCar.stopCarIfTankIsEmpty();
                break;
            }
        }
    }
}
