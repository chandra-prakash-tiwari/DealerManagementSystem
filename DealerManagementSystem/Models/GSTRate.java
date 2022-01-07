package DealerManagementSystem.Models;

import java.io.Serializable;

public class GSTRate implements Serializable {
	private static final long serialVersionUID = -5174605646227554872L;

	public class GSTSlabs{
		Integer slab1=5;
		Integer slab2=8;
		Integer slab3=12;
		Integer slab4=18;
	}
	
	public Integer GetGSTSlabs(double price) {
		GSTSlabs gs=new GSTSlabs();
		if(price<=800000) {
			return gs.slab1;
		}
		else if(price<=120000) {
			return gs.slab2;
		}
		else if(price<=150000) {
			return gs.slab3;
		}
		else {
			return gs.slab4;
		}
	}
}
