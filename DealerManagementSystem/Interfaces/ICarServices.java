package DealerManagementSystem.Interfaces;

import java.util.List;

import DealerManagementSystem.Models.Car;


public interface ICarServices {
	Boolean Add(Car car);
	List<Car> GetCars();
	List<Car> GetAllUnderBaseprice(Double price, Integer taxtype);
}
