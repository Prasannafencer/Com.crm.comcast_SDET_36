package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crm.comcast.genericutility.Sql_utility;
import com.mysql.cj.jdbc.Driver;



public class Select_query_test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	Sql_utility slib=new Sql_utility();
	slib.selectquery("select * from students_info"); 
	
	
	}}
	
		//Connection conn=null;
		//try {
		//com.mysql.cj.jdbc.Driver driverref=new Driver();
		/*step1 create*/
		//DriverManager.registerDriver(driverref);
		/*step2 connection*/
		//while(result.next())
		//{
			//System.out.println(result.getString(1)+"\t" +result.getString(2)+"\t" +result.getString(3)+"\t" +result.getString(4));
			
		//}}
		//catch(Exception e) {
			//System.out.println("exception");
		//}
		//finally
		//{
			//conn.close();
			//System.out.println("close the tabe");
		//}

		//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		//System.out.println("connetcion done");
		
		
		/*step3 create query  */
		//java.sql.Statement state=conn.createStatement();
		 //String query = "select * from students_info";
		 /*step4 execute query*/
		//ResultSet result=state.executeQuery(query);
		
				
				
	


		
		
		
	


