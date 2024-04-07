package testpkg;

import org.testng.annotations.Test;


import basepkg.BaseClass;
import pagepkg.PageClass;

import utilities.Utilities;

public class TestClass extends BaseClass {

	@Test
	public void verifyLoginWithValidCred () throws Exception

	{
		PageClass p1 = new PageClass(driver);
	            String xl = "C:\\\\Users\\\\lenovo\\\\Desktop\\\\finalproject.xlsx";

	            String Sheet = "Sheet1";

	            int rowCount = Utilities.getRowCount(xl, Sheet);
	         
	            for (int i=1;i<=rowCount;i++)

	            {
	            	p1.account();

	                        String email=Utilities.getCellValue(xl, Sheet, i, 0);
                               System.out.println("email---"+email);
	                       
	                        //Passing Username and password as parameters
	                        p1.setvalues(email);
                         //Submitting the data by clicking on login button                   
                             p1.clickLoginButton();
                             p1.account();
                             p1.sign();
                             p1.cart();
                             
                            
	                        

	                        
	            }
}

}

