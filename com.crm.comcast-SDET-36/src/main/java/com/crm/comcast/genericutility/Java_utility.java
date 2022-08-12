package com.crm.comcast.genericutility;



	import java.sql.Date;


public class Java_utility {
		/**
		 *its used to generate random number
		 *@return int data 
		 */
		public int getRanDomnumber()
		{
			java.util.Random random=new java.util.Random();
			int intRandom=random.nextInt(10000);
			return intRandom;
		}
		/**
		 * used to get system data & time in isi format
		 * @return
		 */
		public String getSystemDataAndTime()
		{
		Date date=new Date(0);
		return date.toString();
			}
		/**
		 * used to get system dat in yyyy-mm-DD format
		 * @return
		 */
		public String getSystemDateWithFormate()
		{
		Date date = new Date(0);
		String dateAndTime= date.toString();
		String YYYY=dateAndTime.split(" ")[1];
		String DD=dateAndTime.split(" ")[2];
		int mm=date.getMonth();
		String finalformate=YYYY+"-"+mm+"-"+DD;
		return finalformate;
		}
		}

