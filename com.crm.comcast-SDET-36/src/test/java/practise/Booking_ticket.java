package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Booking_ticket {

	@Test(dataProvider ="data_provider_for_booking")

	public void bookTicket(String src,String dest)
	{System.out.println("Execute source="+src
			+",Destination="+dest);
	}
	@DataProvider
	public Object[][] data_provider_for_booking(){
	Object[][] objarr=new Object[5][2];	
	objarr[0][0]="Bangalore";
	objarr[0][1]="mysore";
	
	objarr[1][0]="Bangalore";
	objarr[1][1]="managalore";
	
	objarr[2][0]="Bangalore";
	objarr[2][1]="udypi";
	
	objarr[3][0]="Bangalore";
	objarr[3][1]="mandiya";
	
	objarr[4][0]="Bangalore";
	objarr[4][1]="dharwad";
	

	return objarr;
	}

	}


