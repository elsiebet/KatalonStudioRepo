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

Mobile.startApplication('D:\\QA\\APK\\MaterialLoginExample.apk', true)

Mobile.tap(findTestObject('android.widget.EditText0'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('android.widget.EditText0 (1)'), 'elsiebet@yahoo.com', 0)

Mobile.tap(findTestObject('android.widget.EditText1'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('android.widget.EditText1 (1)'), 'Test', 0)

Mobile.tap(findTestObject('android.widget.Button0 - LOGIN'), 0)

//Mobile.verifyMatch('Hello world!', 'Hello world!', false)
Mobile.verifyElementAttributeValue(findTestObject('android.widget.TextView1 - Hello world'), 'text', 'testing', 3)

Mobile.closeApplication()



