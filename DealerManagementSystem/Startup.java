package DealerManagementSystem;

import DealerManagementSystem.Abstract.AbstractQuotationServices;
import DealerManagementSystem.Interfaces.ICarServices;
import DealerManagementSystem.Interfaces.IDealerServices;
import DealerManagementSystem.Services.CarServices;
import DealerManagementSystem.Services.DealerServices;
import DealerManagementSystem.Services.QuotationServices;

public class Startup {
	public static void main(String[] args) throws Exception {
		IDealerServices dealerservices=new DealerServices();
		ICarServices carservices=new CarServices();
		AbstractQuotationServices quotationservice=new QuotationServices();
		new DummyCarDetails(carservices);
		new DummyDealerDeatails(dealerservices, carservices);
		CustomerUI.GetQuotation(dealerservices, carservices, quotationservice);
	}
}
