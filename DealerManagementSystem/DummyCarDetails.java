package DealerManagementSystem;

import DealerManagementSystem.Interfaces.ICarServices;
import DealerManagementSystem.Models.Car;

public class DummyCarDetails {
	public DummyCarDetails(ICarServices carservices) {		
		carservices.Add(new Car("Nexon", (double) 1200000));
		carservices.Add(new Car("Harrier", (double) 1500000));
		carservices.Add(new Car("Tiago", (double) 800000));
	}
}
