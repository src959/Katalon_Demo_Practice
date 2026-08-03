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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import javassist.bytecode.stackmap.BasicBlock.Catch

import org.openqa.selenium.Keys as Keys

CustomKeywords.'Browser_Setup.browse'()

WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/radio_1'))
WebUI.setText(findTestObject('Object Repository/Rahul_Shetty_Academy/Type_to_select_country'), 'India')
WebUI.waitForElementClickable(findTestObject('Object Repository/Rahul_Shetty_Academy/India'), 5)
WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/Select_Dropdown'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Rahul_Shetty_Academy/Select_Dropdown'), 'option1', false)
WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/checkobox'))

// Switch Window Example
//WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/openwindow'))
//WebUI.switchToWindowIndex(1)
//WebUI.delay(2)
//WebUI.closeWindowIndex(1)
//WebUI.switchToWindowIndex(0)

//Switch Tab Example
//WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/opentab'))
//WebUI.switchToWindowIndex(1)
//WebUI.delay(2)
//WebUI.closeWindowIndex(1)
//WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('Object Repository/Rahul_Shetty_Academy/Enter_ur_Name'), 'Sandeep')
WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/AlertBtn'))
WebUI.delay(1)
WebUI.acceptAlert()

WebUI.scrollToElement(findTestObject('Object Repository/Rahul_Shetty_Academy/MouseHover'), 3)
WebUI.mouseOver(findTestObject('Object Repository/Rahul_Shetty_Academy/MouseHover'))
WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/click_on_top'))

WebUI.switchToFrame(findTestObject('Object Repository/Rahul_Shetty_Academy/iFrame'), 5)



try {
    // 1. We change FailureHandling to STOP_ON_FAILURE so it triggers our catch block properly if the click fails
    WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/Courses'), FailureHandling.STOP_ON_FAILURE)
    
    // 2. Clicking 'Courses' opens a brand new browser tab. We must switch to it (Index 1)
    WebUI.switchToWindowIndex(1)
    
    // 3. Wait for the search textbox to become ready on the newly opened page
    WebUI.waitForElementVisible(findTestObject('Object Repository/Rahul_Shetty_Academy/Search_Product_Names'), 10)
    
    // 4. Input text into the search bar
    WebUI.setText(findTestObject('Object Repository/Rahul_Shetty_Academy/Search_Product_Names'), 'Selenium')
    WebUI.delay(2)
    WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/Learn_More'))
} 

catch (Throwable e) {
    // e.toString() automatically prints the full exception name along with the message
    KeywordUtil.logInfo("Error Captured: " + e.toString())
}

WebUI.takeScreenshot("C:/Users/apmosys/Katalon Studio/Demo_Practice/Screenshots/demo.png")
WebUI.delay(4)
CustomKeywords.'Browser_Setup.close'()



//WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/Courses'))
//WebUI.setText(findTestObject('Object Repository/Rahul_Shetty_Academy/Search_Product_Names'), 'Selenium')
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Rahul_Shetty_Academy/Learn_More'))
//WebUI.takeScreenshot("C:/Users/apmosys/Katalon Studio/Demo_Practice/Screenshots/demo.png")
//
//WebUI.delay(4)
//CustomKeywords.'Browser_Setup.close'()




