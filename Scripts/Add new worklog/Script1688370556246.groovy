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

Mobile.startExistingApplication('com.serenity.demoapp', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Application Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/Work Logs'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/Filter_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/Plus_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/Plus_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/Enter_Project'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Add Worklog/Enter_Project'), 'Pay2Flex', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/Pay2Flex'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/Add Tag_Enter'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/tag_9812'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/Enter_description'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Add Worklog/Enter_description'), 'Dhesini Test', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/StartDate_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/5date'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/Ok_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/Ok_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/StartTime_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/EndDate_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/10date'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/Ok_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/Ok_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('Add Worklog/Save_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Add Worklog/Save_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Add Worklog/Dhesini Test_details'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Logout/Settings_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Logout/Settings_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Logout/Language_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Logout/Change Theme_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Logout/Logout_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Logout/Logout_btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

welcome = Mobile.verifyElementExist(findTestObject('Login/Welcome to'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication(FailureHandling.CONTINUE_ON_FAILURE)

