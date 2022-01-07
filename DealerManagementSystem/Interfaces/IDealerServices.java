package DealerManagementSystem.Interfaces;

import java.util.List;

import DealerManagementSystem.Models.Dealer;

public interface IDealerServices {
	Boolean Add(Dealer dealer);
	List<Dealer> GetAllDealer();
	Dealer GetDealerByRegion(String region);
}
