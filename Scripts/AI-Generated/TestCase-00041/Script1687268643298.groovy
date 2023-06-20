import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_error-stack-trace-java-lang-classnotfoundexception-custommethods-databasemethods'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/error-stack-trace-java-lang-classnotfoundexception-custommethods-databasemethods/13330')

'step 2: At Page_t_error-stack-trace-java-lang-classnotfoundexception-custommethods-databasemethods click on button_search_button'

testObj = findTestObject('Object Repository/Page_t_error-stack-trace-java-lang-classnotfoundexception-custommethods-databasemethods/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/error-stack-trace-java-lang-classnotfoundexception-custommethods-databasemethods/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_error-stack-trace-java-lang-classnotfoundexception-custommethods-databasemethods'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00041_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
