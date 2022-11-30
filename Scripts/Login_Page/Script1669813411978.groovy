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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www-dev.star.astra.co.id/')

WebUI.verifyElementText(findTestObject('Page_ASSIST - Astra Motor Integrated System/p_Selamat Datang di Astra Motor Integrated System (ASSIST)'), 
    'Selamat Datang di Astra Motor Integrated System (ASSIST)')

WebUI.verifyElementPresent(findTestObject('Page_ASSIST - Astra Motor Integrated System/input_Login_ant-input'), 0)

WebUI.verifyElementPresent(findTestObject('Page_ASSIST - Astra Motor Integrated System/button_Login'), 0)

WebUI.setText(findTestObject('Page_ASSIST - Astra Motor Integrated System/input_Login_ant-input'), 'stardealer')

WebUI.click(findTestObject('Page_ASSIST - Astra Motor Integrated System/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Login - Astra Motor Integrated System (ASSIST)/strong_Selamat Datang di Astra Motor Integrated System (ASSIST)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Login - Astra Motor Integrated System (ASSIST)/strong_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Login - Astra Motor Integrated System (ASSIST)/h1_Sign in'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Login - Astra Motor Integrated System (ASSIST)/input_Username_Username'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Login - Astra Motor Integrated System (ASSIST)/input_Password_Password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Login - Astra Motor Integrated System (ASSIST)/button_Sign in'), 0)

