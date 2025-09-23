import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https:\\\\development.gotimesports.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Username'), 'siva.g+1@spritle.com')

WebUI.setText(findTestObject('Password'), 'Password@123')

WebUI.click(findTestObject('Log In'))

WebUI.verifyElementPresent(findTestObject('Dashboard cards'), 0)

WebUI.click(findTestObject('Create Meet - Dashboard'))

WebUI.click(findTestObject('Create Meet Button - Option'))

WebUI.click(findTestObject('Skip button'))

WebUI.click(findTestObject('Governing body field'))

WebUI.click(findTestObject('Governing body option'))

WebUI.click(findTestObject('State field'))

WebUI.click(findTestObject('State option'))

WebUI.click(findTestObject('City field'))

WebUI.click(findTestObject('City option'))

String randomName = "Meet_" + RandomStringUtils.randomNumeric(4)
WebUI.setText(findTestObject('Meet Name'), randomName)

WebUI.click(findTestObject('Template field'))

WebUI.click(findTestObject('Template option'))

WebUI.click(findTestObject('Meet Type field'))

WebUI.click(findTestObject('Meet Type Option'))

WebUI.setText(findTestObject('Facility'), 'Ajey Stadium')

WebUI.click(findTestObject('Meet Director field'))

WebUI.click(findTestObject('Meet Director option'))

WebUI.click(findTestObject('Date field'))

WebUI.click(findTestObject('Next Month'))

WebUI.click(findTestObject('Date select'))

WebUI.click(findTestObject('Time field'))

WebUI.setText(findTestObject('Time field'), '23')

WebUI.setText(findTestObject('Time field'), '00')

WebUI.click(findTestObject('Close icon'))

WebUI.click(findTestObject('Equipment Type field'))

WebUI.click(findTestObject('Equipment Type option'))

WebUI.click(findTestObject('TC Admin field'))

WebUI.click(findTestObject('TC Admin option'))

WebUI.click(findTestObject('Create Meet Button'))

WebUI.click(findTestObject('button_Are you sure want to create_swal2-co_8cc185'))

WebUI.closeBrowser()

