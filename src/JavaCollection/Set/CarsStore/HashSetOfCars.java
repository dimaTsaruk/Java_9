package JavaCollection.Set.CarsStore;

import java.util.HashSet;

public class HashSetOfCars {

    public static void main(String[] args) {
        HashSet<Car> dealer = new HashSet<>();
        Car bmwX6 = new Car("BMW", "X6", 2021, 55_000);
        Car audiA8 = new Car("Audi", "A8", 2022, 54_000);
        Car teslaSX = new Car("Tesla", "spaceX", 2025, 52_000);

        dealer.add(bmwX6);
        dealer.add(audiA8);
        dealer.add(teslaSX);

        for (Car car : dealer)
            System.out.println(car);
    }
}
