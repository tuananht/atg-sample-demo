import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-find-a-web-table'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-find-a-web-table/31479')

'step 2: At Page_t_unable-to-find-a-web-table click on code_object'

testObj = findTestObject('Object Repository/Page_t_unable-to-find-a-web-table/code_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/unable-to-find-a-web-table/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_unable-to-find-a-web-table'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00044_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
