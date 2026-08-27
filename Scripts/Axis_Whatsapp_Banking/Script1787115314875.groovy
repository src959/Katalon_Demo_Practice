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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

ChromeOptions options = new ChromeOptions()
options.setExperimentalOption("excludeSwitches", ["enable-automation"])
options.setExperimentalOption("useAutomationExtension", false)

WebDriver driver = new ChromeDriver(options)
DriverFactory.changeWebDriver(driver)

//driver.executecdpCommand("Page.addScriptToEvaluateOnNewDocument", [
//	"source": "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})"
//])

Map<String, Object> scriptParams = new HashMap<String, Object>()
scriptParams.put("source", "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})")

driver.executeCdpCommand("Page.addScriptToEvaluateOnNewDocument", scriptParams)
WebUI.maximizeWindow()

//SCENARIO-2 WHATSAPP BANKING
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.axis.bank.in')
//WebUI.maximizeWindow()
WebUI.delay(5)
WebUI.mouseOver(findTestObject('Object Repository/Axis_Scenario/Bank_Smart'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Whatsapp_Banking'))
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Sign_up_Now'))
WebUI.switchToWindowIndex(1)
WebUI.click(findTestObject('Object Repository/Axis_Scenario/Select_Country_Code_dropdown'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Axis_Scenario/Select_Country_Code_dropdown'), '91', false)
WebUI.setText(findTestObject('Object Repository/Axis_Scenario/mobile_no_whatsapp_banking'), '9988990044')
//WebUI.setText(findTestObject('Object Repository/Axis_Scenario/Captcha_Whatsapp_banking'), 'gW2Yn8')

//String Captchaa = JOptionPane.showInputDialog('Enter the Captcha')
//WebUI.setText(findTestObject('Object Repository/Axis_Scenario/Enter_Captcha_Whatsapp_Banking'), Captchaa)
//WebUI.click(findTestObject('Object Repository/Axis_Scenario/Agree_Checkbox_whatsapp_banking'))
//WebUI.click(findTestObject('Object Repository/Axis_Scenario/Submit_Btn_Whatsapp_Banking'))
