package Sample;

import org.testng.annotations.Test;

public class batch_execution {
@Test(groups ="Smoke testing")
public void create_contact()
{
	System.out.println("smoke testnig");
}
@Test(groups = "Regresion testing")
public void create_product()
{
	System.out.println("regresion testing");
	}
@Test(groups =  {"smoke testing","regresion testing"} )
public void contact_product()
{
System.out.println("Smoke&regredion testing");	
	
}
}
