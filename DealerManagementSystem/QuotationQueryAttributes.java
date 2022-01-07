package DealerManagementSystem;

import java.io.Serializable;

import DealerManagementSystem.Models.Car;

public class QuotationQueryAttributes implements Serializable{
	static final long serialVersionUID = 7658411330900721543L;
	
	public String customername;
	public String Region;
	public Double Budget;
	public Integer tax; 
	public Car car;
}
