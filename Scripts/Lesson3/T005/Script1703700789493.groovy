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
WebUI.navigateToUrl('https://rise.fairsketch.com/')
WebUI.setText(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/input_email'),'admin@demo.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/input_password'),'k338bVHfr8nLp6qcLQ2I7Q==')
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/button_Sign in'))
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/btn_Project'))
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/btn_Add project'))
WebUI.setText(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/input_Project'),'KieuHi')
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/type_Project'))
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/select_project'))
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/click_Client'))
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/input_Client'))
WebUI.setText(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/ipt_description'),'Ok bạn nha!')
WebUI.setText(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/input_date'),'29-11-2023')
WebUI.setText(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/input_Deadline'),'31-12-2023')
WebUI.setText(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/input_Price'),'3000')
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/click_Label'))
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/ipt_Label'))
WebUI.click(findTestObject('Object Repository/Page_Sign in  RISE - Ultimate Project Manag_4c2035/btn_Submit'))