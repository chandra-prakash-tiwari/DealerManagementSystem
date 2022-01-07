package DealerManagementSystem.Services;

import java.util.ArrayList;
import java.util.List;

import DealerManagementSystem.Interfaces.IDealerServices;
import DealerManagementSystem.Models.Dealer;

public class DealerServices implements IDealerServices {
	private List<Dealer> dealers;
	
	public DealerServices() {
		dealers=new ArrayList<Dealer>();
	}

	public Boolean Add(Dealer dealer) {
		if(dealer==null)
			return false;
		
		dealers.add(dealer);
		return true;
	}
	
	public List<Dealer> GetAllDealer() {
		return dealers;
	}
	
	public Dealer GetDealerByRegion(String region) {
		for (Dealer dealer : dealers) {
			if(dealer.getRegion()==region) {
				return dealer;
			}
		}
		
		return null;
	}

}
