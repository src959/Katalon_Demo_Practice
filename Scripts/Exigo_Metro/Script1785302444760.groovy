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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'Browser_Setup.browse'()

WebUI.click(findTestObject('Object Repository/Exigo_Website/click_on_metro_ticket'))
WebUI.switchToWindowIndex(1)
WebUI.click(findTestObject('Object Repository/Exigo_Website/click_on_from'))
WebUI.setText(findTestObject('Object Repository/Exigo_Website/From_Input'), 'Andheri')
WebUI.click(findTestObject('Object Repository/Exigo_Website/Click_on_Andheri'))
WebUI.setText(findTestObject('Object Repository/Exigo_Website/To_Input'), 'Ghatkopar')
WebUI.click(findTestObject('Object Repository/Exigo_Website/click_on_ghatkopar'))
WebUI.click(findTestObject('Object Repository/Exigo_Website/passenger_plus_icon'))
WebUI.click(findTestObject('Object Repository/Exigo_Website/Proceedto Pay'))
WebUI.switchToWindowIndex(0)
WebUI.delay(3)
