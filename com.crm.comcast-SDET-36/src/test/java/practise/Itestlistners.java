package practise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Itestlistners implements ITestListener {
	ExtentReports report;
	 ExtentTest test;
	@Override		
    public void onFinish(ITestContext arg0) {					
       	report.flush();		
        		
    }		

  		
    public void onStart(ITestContext arg0) {					
        ExtentHtextemlReporter htmlReport=new ExtentHtmlReporter(new File(".\\ExtentReport\\report.html"));				
        htmlReport.config().setDocumentTitle("Extent Report");
        htmlReport.config().setTheme(Theme.DARK);
        htmlReport.config().setReportName("Functional Test");
         report=new ExtentReports();
        report.attachReporter(htmlReport);
        report.setSystemInfo("TestURL", "https://example.com");
        report.setSystemInfo("Platform", "Windows 10");
        report.setSystemInfo("Reporter Name", "Nithesh");
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        test.log(Status.FAIL, result.getMethod().getMethodName()+" is failed");
        test.log(Status.FAIL, result.getThrowable());
		try {
			String path = WebDriverUtiity.takeScreenshot(BaseClass.staticDriver, result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(path);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
       
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
       test.log(Status.SKIP, result.getMethod().getMethodName()+" is skipped");				
       test.log(Status.SKIP, result.getThrowable());	
    }		

    @Override		
    public void onTestStart(ITestResult result) {					
       test=report.createTest(result.getMethod().getMethodName());				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
       test.log(Status.PASS, arg0.getMethod().getMethodName()+" is passed");			
        		
    }	

}

}
