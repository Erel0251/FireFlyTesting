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

WebUI.navigateToUrl('https://demo.firefly-iii.org/login')

WebUI.click(findTestObject('Object Repository/Create New Budget/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Create New Budget/Page_Whats playing  Firefly III/a_Budgets'))

WebUI.click(findTestObject('Object Repository/Create New Budget/Page_Budgets  Firefly III/a_New budget'))

WebUI.setText(findTestObject('Object Repository/Create New Budget/Page_Create a new budget  Budgets  Firefly III/input_name'), 
    'Courses')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Budget/Page_Create a new budget  Budgets  Firefly III/select_No auto-budgetSet a fixed amount eve_005aeb'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Create New Budget/Page_Create a new budget  Budgets  Firefly III/input_auto_budget_amount'), 
    'Hello world')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Budget/Page_Create a new budget  Budgets  Firefly III/select_DailyWeeklyMonthlyQuarterlyEvery hal_69941c'), 
    'daily', true)

WebUI.click(findTestObject('Object Repository/Create New Budget/Page_Create a new budget  Budgets  Firefly III/button_Store new budget'))

