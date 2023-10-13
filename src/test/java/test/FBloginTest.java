package test;

import base.FbLoginPage;
import utilities.Excelutilities;

public class FBloginTest 
{
FbLoginPage p1=new FbLoginPage(driver);

String xl="C:\\Users\\vivu4\\OneDrive\\Desktop\\software testing\\Book1.xlsx";
String  sheet="Sheet1";

int rowCount=Excelutilities.getRowCount(xl, sheet);
for(int i=1;i<=rowCont;i++)
{
	String username=Excelutilities.getCellValue(xl, sheet, rowCount, rowCount);
	System.out.println(username);
	String pwd=Excelutilities.getCellValue(username, username, rowCount, rowCount);
	System.out.println(pwd);
	p1.setvalues(username,pwd);
	p1.clickLoginBtn();
}
}
