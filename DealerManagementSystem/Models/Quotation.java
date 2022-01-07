package DealerManagementSystem.Models;

import java.io.Serializable;

public class Quotation implements Serializable {
	private static final long serialVersionUID = 2352506441147338025L;
	
	private String customerName;
	private Car cardetails;
	private Integer taxtype;	
	
	public Quotation(String setcustomerName, Car setcardetails, Integer settaxtype) {
		customerName=setcustomerName;
		cardetails=setcardetails;
		taxtype=settaxtype;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Car getCardetails() {
		return cardetails;
	}
	public void setCardetails(Car cardetails) {
		this.cardetails = cardetails;
	}
	
	public Integer getTaxtype() {
		return taxtype;
	}
	public void setTaxtype(Integer taxtype) {
		this.taxtype = taxtype;
	}
}
