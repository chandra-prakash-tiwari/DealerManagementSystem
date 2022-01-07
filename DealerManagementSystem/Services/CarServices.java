package DealerManagementSystem.Services;

import java.util.ArrayList;
import java.util.List;

import DealerManagementSystem.Interfaces.ICarServices;
import DealerManagementSystem.Models.Car;
import DealerManagementSystem.Models.GSTRate;
import DealerManagementSystem.Models.VatRate;

public class CarServices implements ICarServices {
	private List<Car> cars;
	
	public CarServices() {
		cars=new ArrayList<Car>();
	}

	public Boolean Add(Car car) {
		if(car==null)
			return false;
		
		cars.add(car);
		return true;
	}

	public List<Car> GetCars() {
		return cars;
	}
	
	public List<Car> GetAllUnderBaseprice(Double price, Integer taxtype){
		List<Car> resultantcars=new ArrayList<Car>();
		
		for (Car car : cars) {
			double baseprice=car.getBaseprice();
			if((baseprice+(baseprice*taxtype==1?new GSTRate().GetGSTSlabs(baseprice):new VatRate().GetVatSlabs(baseprice)))<price) {
				resultantcars.add(car);
			}
		}
		
		return resultantcars;
	}
}
