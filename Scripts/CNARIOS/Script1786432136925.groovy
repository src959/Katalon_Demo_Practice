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
import org.openqa.selenium.WebElement
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement as Keys

WebUI.openBrowser("https://www.cnarios.com/challenges/product-purchasing")
WebUI.maximizeWindow()
//WebUI.click(findTestObject('Object Repository/CNARIOS/Add_to_cart'))
//WebUI.click(findTestObject('Object Repository/CNARIOS/Cart_logo'))
//WebUI.click(findTestObject('Object Repository/CNARIOS/Proceed_to_address'))
//WebUI.setText(findTestObject('Object Repository/CNARIOS/First_Name'), 'Ravikant')
//WebUI.setText(findTestObject('Object Repository/CNARIOS/Last_Name'), 'Patil')
//WebUI.setText(findTestObject('Object Repository/CNARIOS/Address'), 'House No.141, Unique Society, Thane West')
//WebUI.click(findTestObject('Object Repository/CNARIOS/Proceed_to_Payment'))
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/CNARIOS/Pay_Now_Btn'))

////////////////////////////////////////////////////

List<WebElement> buttons=WebUI.findWebElements(findTestObject('Object Repository/CNARIOS/Add_cart'), 10)
for(int i=1;i<=buttons.size();i++)
	 {
		 WebUI.click(findTestObject('Object Repository/CNARIOS/Add_cart'))
		 WebUI.delay(1)
	 }
	
WebUI.click(findTestObject('Object Repository/CNARIOS/Cart_logo'))
WebUI.click(findTestObject('Object Repository/CNARIOS/Proceed_to_address'))
WebUI.setText(findTestObject('Object Repository/CNARIOS/First_Name'), 'Ravikant')
WebUI.setText(findTestObject('Object Repository/CNARIOS/Last_Name'), 'Patil')
WebUI.setText(findTestObject('Object Repository/CNARIOS/Address'), 'House No.141, Unique Society, Thane West')
WebUI.click(findTestObject('Object Repository/CNARIOS/Proceed_to_Payment'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/CNARIOS/Pay_Now_Btn'))
	

