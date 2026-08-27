import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.swing.JOptionPane

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'Browser_Setup.browse'()
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Discover_Products'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Accounts'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Current_Account'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Apply_Now'))
WebUI.switchToWindowIndex(1)
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Current_Account/Entity_Name'), 'ABC PVT LTD')
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Current_Account/Authorized_Person_Name'), 'Digvijay Sharma')
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Current_Account/Mobile_No'), '8109138132')
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Current_Account/Email_id'), 'abc@gmail.com')
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Current_Account/Pincode'), '400615')
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Existing_Cust_Bank_Text'))
//WebUI.waitForElementClickable(findTestObject('Object Repository/HDFC_Bank_Current_Account/Existing_Cust_Yes'), 10)
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Existing_Cust_Yes'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Select_Cuurent_Ac_type'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Current_ac_type_value'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Select_Constitution_type'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Constitution_Type_Value'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Consent_1_Checkbox'))
//WebUI.waitForElementPresent(findTestObject('Object Repository/HDFC_Bank_Current_Account/Checkbox_1_Agree'), 3)
WebUI.scrollToElement(findTestObject('Object Repository/HDFC_Bank_Current_Account/Privacy_Policy'), 10)
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Checkbox_1_Agree'))
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Consent_2_Checkbox'))
WebUI.scrollToElement(findTestObject('Object Repository/HDFC_Bank_Current_Account/Privacy_Policy_2nd'), 10)
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Checkbox_2_Agree'))

String Captchaa =JOptionPane.showInputDialog(null,'Please Enter the Captcha')
WebUI.setText(findTestObject('Object Repository/HDFC_Bank_Current_Account/Captcha_Code'), Captchaa)
WebUI.click(findTestObject('Object Repository/HDFC_Bank_Current_Account/Get_OTP_Btn'))
//String Captcha_error_msg=WebUI.getText(findTestObject('Object Repository/HDFC_Bank_Current_Account/Captcha_Error_Msg'))
//KeywordUtil.logInfo(Captcha_error_msg)

