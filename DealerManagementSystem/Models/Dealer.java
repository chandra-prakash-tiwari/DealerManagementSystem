package DealerManagementSystem.Models;

import java.io.Serializable;
import java.util.List;

public class Dealer implements Serializable {
	private static final long serialVersionUID = -565673889230312273L;
	
	private String comapanyname;
	private String mobilenumber;
	private String region;
	private String address;
	private List<Car> cars;
	
	public Dealer(String setcomapanyname, String setmobilenumber, String setregion, String setaddress, List<Car> setcars) {
		comapanyname=setcomapanyname;
		mobilenumber=setmobilenumber;
		region=setregion;
		address=setaddress;
		cars=setcars;
	}
	
	public Dealer() {
		
	}
	
	public String getComapanyname() {
		return comapanyname;
	}
	public void setComapanyname(String comapanyname) {
		this.comapanyname = comapanyname;
	}
	
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
}
