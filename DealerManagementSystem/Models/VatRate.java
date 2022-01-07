package DealerManagementSystem.Models;

import java.io.Serializable;

public class VatRate  implements Serializable {
	private static final long serialVersionUID = 3933608568988755051L;

	public class VatSlabs{
		Integer slab1=6;
		Integer slab2=9;
		Integer slab3=11;
		Integer slab4=20;
	}
	
	public Integer GetVatSlabs(Double price) {
		VatSlabs vs=new VatSlabs();
		if(price<=750000) {
			return vs.slab1;
		}
		else if(price<=110000) {
			return vs.slab2;
		}
		else if(price<=170000) {
			return vs.slab3;
		}
		else {
			return vs.slab4;
		}
	}
}
