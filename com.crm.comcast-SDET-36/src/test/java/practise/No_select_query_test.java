package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crm.comcast.genericutility.Database_utility;
import com.crm.comcast.genericutility.Sql_utility;
import com.mysql.cj.jdbc.Driver;

public class No_select_query_test {


		
		public static void main(String[] args) throws Throwable {
			// TODO Auto-generated method stub
			
		Sql_utility slib=new Sql_utility();	
		slib.noselectquery("insert into students_info values('8', 'mr','vishnu', 'M')");
		//Connection conn=null;
			//int result=0;
		//try {
			//com.mysql.cj.jdbc.Driver driverref=new Driver();
			//*step1 create*/
			//DriverManager.registerDriver(driverref);
			/*step2 connection*/
			
			//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			//System.out.println("connetcion done");
			
			
			/*step3 create query  */
			//java.sql.Statement state=conn.createStatement();
			 //String query = "insert into students_info values('8', 'mr','vishnu', 'M')";
			 /*step4 execute query*/
			 //result=state.executeUpdate(query);
			//}
			//catch(Exception e)
			//{
				//System.out.println("exception");
			//}finally{
				//if(result==1)
				//{
					//System.out.println("project inserted succesfully");
					
				//}
				//else
				//{
					//System.out.println("project is not succesfully");
				//}
		
			//conn.close();
			//System.out.println("tabe is closed");
			//}
			
			
				
				
				
			
			}
		
	}


