package DealerManagementSystem.Services;

import java.util.ArrayList;
import java.util.List;

import DealerManagementSystem.Abstract.AbstractQuotationServices;
import DealerManagementSystem.Models.Quotation;

public class QuotationServices extends AbstractQuotationServices{
	private List<Quotation> quotations;
	
	public QuotationServices() {
		quotations=new ArrayList<Quotation>();
	}
	
	public Boolean Add(Quotation quotation) {
		if(quotation==null)
			return false;
		
		quotations.add(quotation);
		return true;
	}

	public Quotation GetQuotation(Integer id) {
		return quotations.get(id);
	}

	public List<Quotation> GetAllQuotation() {
		return quotations;
	}
	
}
