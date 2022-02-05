package config;

import java.util.ArrayList;
import support.Emailer;
import support.Emailer;

public class Constants {

	/********************************************************************************************
	 * List all in INITIAL DATA IN PROJECTS
	 ********************************************************************************************/
	public static final String Path_OR = ".\\src\\testing\\objectRepository\\Master_CA.txt";
	
	/********************************************************************************************
	                       
	********************************************************************************************/

	public static final String FailScrnpath = "src\\testing\\reports\\imagesLog\\";

	/*********************************************************************************************
	 * DATABASE CREDENTIALS
	 *********************************************************************************************/

	
	  public static final String DBURL =
	  "jdbc:sqlserver:// CA_AUTOMATION;databaseName =7.P1_Automation"; public
	  static final String userName = "AdminUser"; public static final String pwd =
	  "AUTODEMO@20005";
	 

	public static final String DBdataFilepath = "src\\testing\\dataEngine\\DBdata.xlsx";
	public static final String DBResultFilepath = "src\\testing\\reports\\DBResults.xlsx";

	/*********************************************************************************************
	 * LOGIN CREDENTAILS
	 *********************************************************************************************/

	public static final String DASHBOARD_URL = "  ";
	public static final String DASHBOARD_UN = "  ";
	public static final String DASHBOARD_PWD = "  ";

	public static final String CHECKIN_URL = "  ";
	public static final String CHECKIN_UN = "  ";
	public static final String CHECKIN_PWD = "  ";

	public static final String ADMIN_URL = "  ";
	public static final String ADMIN_UN = "  ";
	public static final String ADMIN_PWD = "  ";

	public static final String CLOUDADMIN_URL = "  ";
	public static final String CLOUDADMIN_UN = "  ";
	public static final String CLOUDADMIN_PWD = "  ";

	/*********************************************************************************************
	 * TEST CASE PATH
	 *********************************************************************************************/

	public static final String[] TCRPath = { "./src/testing/dataEngine/DemoAdmin.xls",
			"./src/testing/reports/TestResult_DemoAdmin.xls", "DemoAdmin.xls" };


	/*******************************************************************************************
	 * REPORT FILE PATH
	 ********************************************************************************************/

	public static String Report1 = "D:\\Product_WorkSpace\\HATF\\src\\testing\\reports\\TestResult_Automation_6.3.xls";
	public static String Report2 = "D:\\Product_WorkSpace\\HATF\\src\\testing\\reports\\TestResult_CheckingSheet.xls";
	public static String Report3 = "D:\\Product_WorkSpace\\HATF\\src\\testing\\reports\\TestResult_New_Admin_Page.xls";

	/*******************************************************************************************
	 * EMAIL ADDRESS
	 ********************************************************************************************/

	public static String Receipient1 = "thyaga@healthasyst.com";
	public static String Receipient2 = "thyaga@healthasyst.com";
	public static String Receipient3 = "thyaga@healthasyst.com";

	/*******************************************************************************************
	 * LIST OF COLUMNS DATA-ENGINE
	 ********************************************************************************************/

	public static final int Col_TestCaseID = 0;
	public static final int Col_TestStepID = 1;
	public static final int Col_PageObject = 3;
	public static final int Col_ActionKeyword = 4;
	public static final int Col_DataSet = 5;

	public static final int Col_RunMode = 2;

	public static final int Col_Result = 3;
	public static final int Col_TestStepResult = 9;

	public static final String KEYWORD_FAIL = "FAILED";
	public static final String KEYWORD_PASS = "PASSED";

	public static final String Sheet_TestCases = "Testsuite";
	public static final String Sheet_TestSteps = "TestCase";

}
