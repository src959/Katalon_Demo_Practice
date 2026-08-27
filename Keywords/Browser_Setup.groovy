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

public class Browser_Setup {
    @Keyword
	def browse() {
		//WebUI.openBrowser("https://www.royalcaribbean.com/gbr/en/cruise-ships/odyssey-of-the-seas?country=GBR&ecid=ps_296038244133&country=IND&gclsrc=aw.ds&gad_source=1&gad_campaignid=21414173483&gbraid=0AAAAACp6Eg8P8JK7EtrQaaYsNfE-pgB1T&gclid=EAIaIQobChMImJ2NhaD3lQMVbMI8Ah1EXDoHEAAYAiAAEgI_GPD_BwE")
		//WebUI.openBrowser("https://www.ixigo.com/trains")
		//WebUI.openBrowser("https://rahulshettyacademy.com/AutomationPractice/")
		//WebUI.openBrowser("https://ishine.apmosys.com/#/login?returnUrl=%2Fhome")
		WebUI.openBrowser('https://www.hdfc.bank.in/')
		WebUI.maximizeWindow()
    }
	
	@Keyword
	def close() {
		WebUI.closeBrowser()
	}
}
