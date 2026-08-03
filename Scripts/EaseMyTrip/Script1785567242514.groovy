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
import org.openqa.selenium.chrome.ChromeOptions

WebUI.openBrowser("https://www.easemytrip.com/")
WebUI.maximizeWindow()
WebUI.waitForPageLoad(7)
WebUI.click(findTestObject('Object Repository/EaseMyTrip/FROM_City'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/EaseMyTrip/FROM_City'), 'Mumbai')
WebUI.click(findTestObject('Object Repository/EaseMyTrip/To_City'))
WebUI.setText(findTestObject('Object Repository/EaseMyTrip/To_City'), 'Goa')
WebUI.click(findTestObject('Object Repository/EaseMyTrip/Departure_date'))
WebUI.click(findTestObject('Object Repository/EaseMyTrip/Return_Date'))
WebUI.click(findTestObject('Object Repository/EaseMyTrip/TRAVELLERS and Class'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/EaseMyTrip/Adults_Add_Button'))
WebUI.click(findTestObject('Object Repository/EaseMyTrip/Childrens_Add_button'))
WebUI.click(findTestObject('Object Repository/EaseMyTrip/Search_Flight'))