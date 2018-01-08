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
def row
for (row = 1; row <= findTestData('New Test Data for Test Case').getRowNumbers(); row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')

   Login(findTestData('New Test Data for Test Case').getValue(
		'UserName', row),findTestData('New Test Data for Test Case').getValue(
		'Password', row))

    WebUI.click(findTestObject('Page_Execute Automation/input_Login'))

    WebUI.selectOptionByValue(findTestObject('Page_Execute Automation/select_TitleId'), '2', true)

    WebUI.setText(findTestObject('Page_Execute Automation/input_Initial'), findTestData('New Test Data for Test Case').getValue(
            'Initial', row))

    CustomKeywords.'com.lisa.utilities.CommonUtilities.CheckDropDownListElementExist'(findTestObject('Page_Execute Automation/select_TitleId'), 
        'Ms.')

    WebUI.setText(findTestObject('Page_Execute Automation/input_FirstName'), findTestData('New Test Data for Test Case').getValue(
            'LastName', row))

    WebUI.setText(findTestObject('Page_Execute Automation/input_MiddleName'), findTestData('New Test Data for Test Case').getValue(
            'LastName1', row))

    WebUI.click(findTestObject('Page_Execute Automation/input_Female'))

    WebUI.click(findTestObject('Page_Execute Automation/input_Save'))

    WebUI.click(findTestObject('Page_Execute Automation/a_HtmlPopup'))

    WebUI.switchToWindowTitle('Popup Window')

    WebUI.selectOptionByValue(findTestObject('Page_Popup Window/select_TitleId'), '2', true)

    WebUI.setText(findTestObject('Page_Popup Window/input_FirstName'), 'Merc')

    WebUI.setText(findTestObject('Page_Popup Window/input_MiddleName'), 'mm')

    WebUI.setText(findTestObject('Page_Popup Window/input_LastName'), 'mm')

    WebUI.setText(findTestObject('Page_Popup Window/input_Initial'), 'mm')

    WebUI.selectOptionByValue(findTestObject('Page_Popup Window/select_Country'), '4', true)

    WebUI.click(findTestObject('Page_Popup Window/input_Save'))

    WebUI.switchToWindowTitle('Execute Automation')

    WebUI.click(findTestObject('Page_Execute Automation/input_generate'))
}

def Login(def username, def password){
	
	WebUI.setText(findTestObject('Page_Execute Automation/input_UserName'), username)

WebUI.setText(findTestObject('Page_Execute Automation/input_Password'), password)

}
