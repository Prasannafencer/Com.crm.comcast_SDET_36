package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_test {

	@Test(dataProvider ="data_provider_for_booking")

public void bookTicket(String src,String dest,int ticket)
{System.out.println("Execute source="+src
		+",Destination="+dest);
}
@DataProvider
public Object[][] data_provider_for_booking(){
Object[][] objarr=new Object[5][3];	
objarr[0][0]="Bangalore";
objarr[0][1]="mysore";
objarr[0][2]=10;
objarr[1][0]="Bangalore";
objarr[1][1]="managalore";
objarr[1][2]=10;
objarr[2][0]="Bangalore";
objarr[2][1]="udypi";
objarr[2][2]=10;
objarr[3][0]="Bangalore";
objarr[3][1]="mandiya";
objarr[3][2]=10;
objarr[4][0]="Bangalore";
objarr[4][1]="dharwad";
objarr[4][2]=10;

return objarr;
}

}
