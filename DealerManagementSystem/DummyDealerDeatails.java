package DealerManagementSystem;

import DealerManagementSystem.Interfaces.ICarServices;
import DealerManagementSystem.Interfaces.IDealerServices;
import DealerManagementSystem.Models.Dealer;
import DealerManagementSystem.Models.Region;

public class DummyDealerDeatails {
	public DummyDealerDeatails(IDealerServices dealerservices, ICarServices carservices) {		
		dealerservices.Add(new Dealer("abc pvt ltd.", "9898989898", new Region().india, "Ranchi", carservices.GetCars()));
	}
}
