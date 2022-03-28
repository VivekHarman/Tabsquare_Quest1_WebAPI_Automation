import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

APIResponse = WS.sendRequest(findTestObject('WebServiceRequest/TabSquare_GetRequest'))

WS.verifyResponseStatusCode(APIResponse, 200)

WS.verifyElementPropertyValue(APIResponse, 'address', 'Singapore')

WS.verifyElementPropertyValue(APIResponse, 'employeeDetails[0].firstName', 'Andre')

WS.verifyElementPropertyValue(APIResponse, 'employeeDetails[0].lastName', 'Wijaya')

WS.verifyElementPropertyValue(APIResponse, 'employeeDetails[0].DOB', 221150)

WS.verifyElementPropertyValue(APIResponse, 'employeeDetails[1].firstName', 'Sam')

WS.verifyElementPropertyValue(APIResponse, 'employeeDetails[1].lastName', 'Smith')

WS.verifyElementPropertyValue(APIResponse, 'employeeDetails[1].DOB', 512300)

