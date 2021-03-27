package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(1, "BMW", 321));
        cars.add(new Car(2, "BMW", 322));
        cars.add(new Car(3, "BMW", 323));
        cars.add(new Car(4, "BMW", 324));
        cars.add(new Car(5, "BMW", 325));
    }

    @Override
    public List<Car> showCars(Integer count) {
        if(count < 2 || count > 4) return cars;
        List<Car> cars1 = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            cars1.add(cars.get(i));
        }
        return cars1;
    }
}
