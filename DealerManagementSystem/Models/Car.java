package DealerManagementSystem.Models;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = -2626291914809139633L;
	
	private String name;
	private Double baseprice;
	
	public Car(String setname, Double setbaseprice) {
		name=setname;
		baseprice=setbaseprice;
		
	}
	
	public Car() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getBaseprice() {
		return baseprice;
	}
	public void setBaseprice(Double baseprice) {
		this.baseprice = baseprice;
	}
}
