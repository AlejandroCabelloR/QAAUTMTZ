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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bylyshw7.adb.us-ashburn-1.oraclecloudapps.com/ords/r/portal/fiscv20116/f-login-sv?session=114684091575817')

WebUI.setText(findTestObject('Object Repository/Page_miHumanForce - Fiscalizador/input_Username_P9998_USERNAME'), 'alejandro.cabello.rios@automatiza.cl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_miHumanForce - Fiscalizador/input_Password_P9998_PASSWORD'), 
    'ZPB7kCZgQyzmmpSS2+uzzw==')

WebUI.click(findTestObject('Page_miHumanForce - Fiscalizador/button_Ingresar'))

