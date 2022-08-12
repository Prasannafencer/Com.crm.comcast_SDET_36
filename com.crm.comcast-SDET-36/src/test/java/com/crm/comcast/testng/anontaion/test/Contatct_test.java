package com.crm.comcast.testng.anontaion.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Contatct_test {

@BeforeMethod
public void config()
{
	System.out.println("before method");}
	

@AfterMethod
public void createorgtest()
{
System.out.println("after method");	
}
@Test(priority = 1)
public void createcontactpage() {

System.out.println("testing");
}
@Test(priority = -1)
public void contactpage()
{
System.out.println("test2");	
}
}