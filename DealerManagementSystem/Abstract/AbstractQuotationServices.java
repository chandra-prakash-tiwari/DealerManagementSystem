package DealerManagementSystem.Abstract;

import DealerManagementSystem.Models.Quotation;

public abstract class AbstractQuotationServices {
	public abstract Boolean Add(Quotation quotation);
	public abstract Quotation GetQuotation(Integer id);
}
