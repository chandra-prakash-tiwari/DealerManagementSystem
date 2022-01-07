package DealerManagementSystem;

import java.util.List;

import DealerManagementSystem.Abstract.AbstractQuotationServices;
import DealerManagementSystem.FileHandling.FileHandlarOutput;
import DealerManagementSystem.FileHandling.GenericObjectWriter;
import DealerManagementSystem.Interfaces.ICarServices;
import DealerManagementSystem.Interfaces.IDealerServices;
import DealerManagementSystem.Models.Car;
import DealerManagementSystem.Models.GSTRate;
import DealerManagementSystem.Models.Quotation;
import DealerManagementSystem.Models.VatRate;

public class CustomerUI {
	public static void GetQuotation(IDealerServices dealerservices, ICarServices carservices, AbstractQuotationServices quotationservice) throws Exception {
		FileHandlarOutput input=new FileHandlarOutput(Constrants.FILE_NAME);
		GenericObjectWriter<QuotationQueryAttributes> objectwriter=new GenericObjectWriter<QuotationQueryAttributes>(Constrants.OBJECT_FILE_NAME);
		
		do {	
		    input.Write(Constrants.WELCOME_NOTE);
		    System.out.println(Constrants.WELCOME_NOTE);
			
		    CustomerUI ui=new CustomerUI();
			QuotationQueryAttributes query=new QuotationQueryAttributes();
			
			
			System.out.print(Constrants.ENTER_NAME);
			input.Write(Constrants.ENTER_NAME );
			query.customername=TakeInput.GetString();
			input.Write(query.customername );
			
			System.out.print(Constrants.ENTER_REGION);
			input.Write(Constrants.ENTER_REGION );
			query.Region=TakeInput.GetString();
			input.Write(query.Region);
			
			System.out.print(Constrants.ENTER_BUDGET);
			input.Write(Constrants.ENTER_BUDGET );
			query.Budget=TakeInput.GetDouble();
			input.Write(Double.toString(query.Budget) );
			
			System.out.print(Constrants.ENTER_TAX_CHOICE);
			input.Write(Constrants.ENTER_TAX_CHOICE);
			query.tax=TakeInput.GetInteger();
			input.Write(Integer.toString(query.tax) );
			
			List<Car> cars=ui.QuotationQuery(query, dealerservices, carservices);
			System.out.println(cars.size()>0 ? Constrants.CAR_DETAILS_ININVENTORY : Constrants.CAR_NOT_INVENTORY);
			input.Write((cars.size()>0 ? Constrants.CAR_DETAILS_ININVENTORY : Constrants.CAR_NOT_INVENTORY) );
		
			for(int i=0;i<cars.size();i++) {
				System.out.println(i+1+". "+cars.get(i).getName());
				input.Write((i+1+". "+cars.get(i).getName()) );
			}
			
			if(cars.size()>0) {
				query.car=cars.get((TakeInput.GetInteger()-1));
				System.out.println();
				
				System.out.println("Hello "+ query.customername+ "!");
				input.Write(("Hello "+ query.customername+ "!") );
				
				System.out.println("You have choices "+ query.car.getName());
				input.Write(("You have choices "+ query.car.getName()) );
				
				Integer taxRatio= query.tax==1?
						new GSTRate().GetGSTSlabs(query.car.getBaseprice()):
						new VatRate().GetVatSlabs(query.car.getBaseprice());
				System.out.print("Total value is "+ (query.car.getBaseprice()+(query.car.getBaseprice()*taxRatio/100)));	
			}
			objectwriter.Write(query);
			quotationservice.Add(new Quotation(query.customername, query.car, query.tax));
			System.out.print("\nDo you want query another ?");
		}while(TakeInput.GetBoolean());
		objectwriter.close();
		input.CloseFile();
	}

	public List<Car> QuotationQuery(QuotationQueryAttributes attribute, IDealerServices delearservices, ICarServices carservices) {
		delearservices.GetDealerByRegion(attribute.Region);
		return carservices.GetAllUnderBaseprice(attribute.Budget, attribute.tax);
	}
}
