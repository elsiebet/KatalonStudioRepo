import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData



def static runTestCase_0() {
    TestCaseMain.runTestCase('Test Cases/TC01', new TestCaseBinding('Test Cases/TC01',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_1() {
    TestCaseMain.runTestCase('Test Cases/TC02', new TestCaseBinding('Test Cases/TC02',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_2() {
    TestCaseMain.runTestCase('Test Cases/TC03', new TestCaseBinding('Test Cases/TC03',  null), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/AutomationTestSuite1')

suiteProperties.put('name', 'AutomationTestSuite1')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\enguli\\git\\KatalonStudioRepo\\Reports\\AutomationTestSuite1\\20180119_155732\\execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('AutomationTestSuite1', suiteProperties)

TestCaseMain.invokeStartSuite('Test Suites/AutomationTestSuite1')

(0..2).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

TestCaseMain.invokeEndSuite('Test Suites/AutomationTestSuite1')

KeywordLogger.getInstance().endSuite('AutomationTestSuite1', null)
