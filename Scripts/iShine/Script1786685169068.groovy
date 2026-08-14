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
WebUI.setText(findTestObject('Object Repository/iShine/Username'), 'sandeep.choudhary@apmosys.com')
WebUI.setText(findTestObject('Object Repository/iShine/Password'), 'Dec@1841')
WebUI.click(findTestObject('Object Repository/iShine/Login_Btn'))
WebUI.newTab('https://mail.apmosys.com/webmail/')
WebUI.setText(findTestObject('Object Repository/iShine/Email_username'), 'sandeep.choudhary@apmosys.com')
WebUI.click(findTestObject('Object Repository/iShine/Email_Next_Btn'))
WebUI.setText(findTestObject('Object Repository/iShine/Email_Pwd'), 'Aug@1841')
WebUI.click(findTestObject('Object Repository/iShine/Email_Sign_in_Btn'))
WebUI.switchToFrame(findTestObject('Object Repository/iShine/Frame_Email_Body'), 10)
String Email_bodytxt=WebUI.getText(findTestObject('Object Repository/iShine/Email_Body_txt'))
String []txt= Email_bodytxt.split(" ")
String otp=txt[4]
WebUI.switchToDefaultContent()
WebUI.switchToWindowIndex(0)
WebUI.setText(findTestObject('Object Repository/iShine/OTP_iShine'), otp)
WebUI.click(findTestObject('Object Repository/iShine/iShine_Confirm_Btn'))