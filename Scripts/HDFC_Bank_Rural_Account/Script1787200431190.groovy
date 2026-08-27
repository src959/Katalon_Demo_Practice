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

CustomKeywords.'Browser_Setup.browse'()
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Discover_Products'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Accounts'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/Rural_Account'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/Locate_Us'))
WebUI.switchToWindowIndex(1)
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/State'))
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Rural_Account/Search_State'), 'Madh')
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/State_Value_MP'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/City'))
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Rural_Account/Search_City'), 'Bur')
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/City_Value_Burhanpur'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/Search_Button'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/View_Branch_Details'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/View_More_Details'))
WebUI.switchToWindowIndex(2)
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/Bank_Services'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/Personal_Loan'))
WebUI.waitForPageLoad(5)
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/Apply_Now_Personal_Loan'))
WebUI.switchToWindowIndex(3)
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Rural_Account/PL_Mobile_no'), '8874500000')
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Rural_Account/PL_DOB'), '15121997')
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/Politically_Exposed_No'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/PL_Checkbox_1'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/PL_Go_To_Bottom_Btn'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/PL_Agree_Btn'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/PL_Checkbox_2'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/PL_Go_To_Bottom_Btn'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/PL_Agree_Btn_2'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Rural_Account/View_Loan_Eligibility_Btn'))



