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

WebUI.click(findTestObject('Object Repository/Page_Portal - miHumanForce/i_Opciones_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Page_Portal - miHumanForce/a_Cambiar Contrasea'))

WebUI.click(findTestObject('Object Repository/Page_Cambiar Contrasea/label_Ingrese Su Nueva Contrasea'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cambiar Contrasea/input_Cambiar Contrasea_P16_PASSWORD_1'), 
    'BD7RouBgtIi/+RXZqglwkA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cambiar Contrasea/input_Ingrese Su Nueva Contrasea_P16_PASSWORD_2'), 
    'GYeuM6ErPq8VfoTYN/S01g==')

WebUI.click(findTestObject('Object Repository/Page_Cambiar Contrasea/button_Cambiar'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Cambiar Contrasea/i_Se ha producido 1 error_fa fa-times panel-close'))

