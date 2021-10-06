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

WebUI.navigateToUrl('https://www.oasis.sk/gardencentrum/')

WebUI.click(findTestObject('Object Repository/Page_OASIS gardencentrum Topoany/input_Novinky_q'))

WebUI.setText(findTestObject('Object Repository/Page_OASIS gardencentrum Topoany/input_Novinky_q_1'), 'salvia')

WebUI.sendKeys(findTestObject('Object Repository/Page_OASIS gardencentrum Topoany/input_Novinky_q_1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_OASIS Topoany - Vyhadvanie - salvia/span_Vsledky vyhadvania_decoration-backgrou_515444'))

WebUI.click(findTestObject('Object Repository/Page_OASIS Topoany - Vyhadvanie - salvia/span_na dotaz_decoration-background-image i_a9a8e0'))

WebUI.closeBrowser()
