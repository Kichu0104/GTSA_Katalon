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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https:\\\\development.gotimesports.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Username'), 'siva.g+1@spritle.com')

WebUI.setText(findTestObject('Password'), 'Password@123')

WebUI.click(findTestObject('Log In'))

WebUI.verifyElementPresent(findTestObject('Dashboard cards'), 0)

WebUI.click(findTestObject('Create Meet - Dashboard'))

WebUI.click(findTestObject('Create Meet Button - Option'))

WebUI.verifyElementPresent(findTestObject('Re-Sync Button'), 0)

WebUI.click(findTestObject('Governing Body field - New'))

WebUI.click(findTestObject('Governing Body Option - New'))

String randomTemplateName = 'Meet_' + RandomStringUtils.randomNumeric(4)

WebUI.setText(findTestObject('Template Name'), randomTemplateName)

WebUI.click(findTestObject('State field - New'))

WebUI.click(findTestObject('State Option - New'))

WebUI.click(findTestObject('Season field - New'))

WebUI.click(findTestObject('Season Option - New'))

WebUI.click(findTestObject('Division field - New'))

WebUI.click(findTestObject('Division Option - New'))

WebUI.uploadFile(findTestObject('Object Repository/Upload file - New'), 'C:\\Users\\kisho\\Downloads\\PVA Outdoor Championship.mdb')

WebUI.click(findTestObject('Next Button - New'))

// Example: wait for page header or any unique element of the target page
TestObject pageReady = findTestObject('Back button')

WebUI.waitForElementPresent(pageReady, 300 // give enough time for slow navigation
    )

WebUI.waitForElementVisible(pageReady, 100)

WebUI.verifyElementVisible(findTestObject('Templace creation success message'))

WebUI.verifyElementPresent(findTestObject('Templace creation success message'), 0)

WebUI.click(findTestObject('div_Alabama_css-319lph-ValueContainer'))

WebUI.click(findTestObject('City option - New'))

WebUI.setText(findTestObject('Facility - New'), 'Ajey Stadium')

WebUI.click(findTestObject('Meet Director field - New'))

WebUI.click(findTestObject('Meet Director Option - New'))

WebUI.click(findTestObject('Next Button 1 - New'))

WebUI.click(findTestObject('Close icon - New'))

WebUI.click(findTestObject('Meet Type field - New'))

WebUI.click(findTestObject('Meet Type Option - New'))

WebUI.click(findTestObject('Date Picket field - New'))

WebUI.click(findTestObject('Next Month - New (1)'))

WebUI.click(findTestObject('Next Month - New (1)'))

WebUI.click(findTestObject('Next Month - New (1)'))

WebUI.click(findTestObject('Date Select (1)'))

WebUI.click(findTestObject('Time field'))

WebUI.setText(findTestObject('Time field'), '23')

WebUI.setText(findTestObject('Time field'), '00')

WebUI.click(findTestObject('Equipment Type Field - New'))

WebUI.click(findTestObject('Equipment Type Option - New'))

WebUI.click(findTestObject('TC Admin Field - New'))

WebUI.click(findTestObject('TC Admin Option - New'))

WebUI.click(findTestObject('Create Button - New'))

WebUI.click(findTestObject('Confirmation yes'))

WebUI.verifyElementPresent(findTestObject('Dashboard cards'), 0)

