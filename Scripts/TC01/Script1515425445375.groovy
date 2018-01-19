import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for (def row = 1; row <= findTestData('HRM_Login_Creds').getRowNumbers(); row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('http://opensource.demo.orangehrmlive.com/')

    WebUI.click(findTestObject('Page_OrangeHRM/span_Username'))

    WebUI.setText(findTestObject('Page_OrangeHRM/input_txtUsername'), findTestData('HRM_Login_Creds').getValue('UserName', 
            row))

    WebUI.setText(findTestObject('Page_OrangeHRM/input_txtPassword'), findTestData('HRM_Login_Creds').getValue('Password', 
            row))

    WebUI.click(findTestObject('Page_OrangeHRM/input_Submit'))

    //WebUI.click(findTestObject('Page_OrangeHRM/span_Invalid credentials'))
    // boolean flag
    //def String str=WebUI.getText('Page_OrangeHRM/span_Invalid credentials')
    WebUI.verifyTextPresent(findTestData('HRM_Login_Creds').getValue('Validation', row), false)

    // CustomKeywords.'com.lisa.utilities.CheckElement.CheckElementContaintsString'(findTestObject('Page_OrangeHRM/span_Invalid credentials'), 
    // findTestData('HRM_Login_Creds').getValue('Validation', row))
    //println(flag)
    // if (flag != true) {
    //     break
    // }
    WebUI.closeBrowser()
}

