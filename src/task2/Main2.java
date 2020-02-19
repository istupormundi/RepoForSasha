package task2;

public class Main2 {

    public static void main(String[] args){
        Car myRecklessCar = new Car(44, 34);

        double myFavoriteSpeed = 100;
        double howManyHoursIDrove = myRecklessCar.drive(myFavoriteSpeed, 1000);
        double distanceFromOX = myRecklessCar.distanceFromOX(myFavoriteSpeed, howManyHoursIDrove);

        if (myRecklessCar.showFuelLevelInTank(myFavoriteSpeed, 1000) <= 5){
            myRecklessCar.refillFuelTank(40);
        }

        System.out.println("distanceFromOX = " + distanceFromOX + "km");
    }
}
