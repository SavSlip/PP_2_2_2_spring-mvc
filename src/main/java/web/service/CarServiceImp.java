package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Car1", "Red1", 2001));
        carList.add(new Car("Car2", "Red2", 2002));
        carList.add(new Car("Car3", "Red3", 2003));
        carList.add(new Car("Car4", "Red4", 2004));
        carList.add(new Car("Car5", "Red5", 2005));
    }

    @Override
    public List<Car> getCar(Integer count) {
        List<Car> resultingCarList = new ArrayList<>();
        if (count == null || count >= 5){
            resultingCarList = carList;
        } else {
            for (int i = 0; i < count; i++) {
                resultingCarList.add(carList.get(i));
            }
        }
        return resultingCarList;
    }

    @Override
    public String getPageTitle(boolean isEmpty) {
        return isEmpty ? "Not found cars" : "List of cars";
    }
}
