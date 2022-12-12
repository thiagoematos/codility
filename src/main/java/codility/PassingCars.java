package codility;

import static java.util.Arrays.stream;

public class PassingCars {

    private static final int EAST = 0;
    private static final int WEST = 1;

    public int solution(int[] carsOnTheRoad) {
        var passingCar = 0;

        var quantityOfCarsToWest = stream(carsOnTheRoad).filter(it -> it == WEST).sum();

        for (var directionOfCar : carsOnTheRoad) {
            if (directionOfCar == EAST) {
                passingCar += quantityOfCarsToWest;
            } else {
                quantityOfCarsToWest--;
            }

            if (passingCar > 1_000_000_000) return -1;
        }

        return passingCar;
    }
}
