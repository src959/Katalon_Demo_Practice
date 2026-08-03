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

WebUI.click(findTestObject('Object Repository/Exigo_Website/click_on_Hotels'))
WebUI.click(findTestObject('Object Repository/Exigo_Website/Destinatio_hotel'))
WebUI.setText(findTestObject('Object Repository/Exigo_Website/Destinatio_hotel'), 'Goa')
WebUI.click(findTestObject('Object Repository/Exigo_Website/selectNorthGoa'))
WebUI.click(findTestObject('Object Repository/Exigo_Website/Checkin_Date_15_Aug'))
WebUI.click(findTestObject('Object Repository/Exigo_Website/Checkout_date_18Aug'))
WebUI.click(findTestObject('Object Repository/Exigo_Website/Rooms_Add_icon'))
WebUI.click(findTestObject('Object Repository/Exigo_Website/Adults_add_icon'))
WebUI.click(findTestObject('Object Repository/Exigo_Website/Childrens_Add_icons'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Exigo_Website/Hotel_Search'))
WebUI.click(findTestObject('Object Repository/Exigo_Website/close_aid_2_Hotel'))
WebUI.scrollToElement(findTestObject('Object Repository/Exigo_Website/Hotel_sai'), 0)
WebUI.click(findTestObject('Object Repository/Exigo_Website/Hotel_sai'))
WebUI.switchToWindowIndex(1)
String title=WebUI.getWindowTitle()
print(title)
WebUI.click(findTestObject('Object Repository/Exigo_Website/Reserve_room'))

