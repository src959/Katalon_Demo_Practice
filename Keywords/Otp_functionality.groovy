import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Otp_functionality {
    @Keyword
	def otp(String Username,String Email_password) {
		WebUI.newTab('https://mail.apmosys.com/webmail/')
		WebUI.setText(findTestObject('Object Repository/iShine/Email_username'), Username )
		WebUI.click(findTestObject('Object Repository/iShine/Email_Next_Btn'))
		WebUI.setText(findTestObject('Object Repository/iShine/Email_Pwd'), Email_password)
		WebUI.click(findTestObject('Object Repository/iShine/Email_Sign_in_Btn'))
		WebUI.switchToFrame(findTestObject('Object Repository/iShine/Frame_Email_Body'), 10)
		String Email_bodytxt=WebUI.getText(findTestObject('Object Repository/iShine/Email_Body_txt'))
		String []txt= Email_bodytxt.split(" ")
		String otp=txt[4]
		WebUI.switchToDefaultContent()
		WebUI.switchToWindowIndex(0)
		WebUI.setText(findTestObject('Object Repository/iShine/OTP_iShine'), otp)
		WebUI.click(findTestObject('Object Repository/iShine/iShine_Confirm_Btn'))
	}
}
