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

WebUI.openBrowser('https://www.axis.bank.in/')
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Lodge_Complaint'))
WebUI.switchToWindowIndex(1)
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Start_selection_here'))
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Value_Bank_Ac'))
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Continue_selecting'))
WebUI.click(findTestObject('Object Repository/Axis_Scenario/All_Savings_Ac'))
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Choose_from_below_points'))
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Cheque_book'))
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Chat'))
WebUI.switchToWindowIndex(2)
WebUI.setText(findTestObject('Object Repository/Axis_Scenario/Email_id'), 'src@gmail.com')
WebUI.setText(findTestObject('Object Repository/Axis_Scenario/Mobile_no'), '8896521474')
WebUI.setText(findTestObject('Object Repository/Axis_Scenario/Enter_Captcha'), '3I7WKk')


//String Captchaa = JOptionPane.showInputDialog('Enter the Captcha')
//WebUI.setText(findTestObject('Object Repository/Axis_Scenario/Enter_Captcha'), Captchaa)
//WebUI.click(findTestObject('Object Repository/Axis_Scenario/Start_chating'))


String error=WebUI.getText(findTestObject('Object Repository/Axis_Scenario/Error_Msg'))
if(WebUI.verifyElementPresent(findTestObject('Object Repository/Axis_Scenario/Error_Msg'), 10)) {
	KeywordUtil.logInfo(error)
}

