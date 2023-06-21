import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_verify-data-on-excel-sheet'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/verify-data-on-excel-sheet/61180')

'step 2: At Page_t_verify-data-on-excel-sheet click on hyperlink_ --> navigate to Page_home'

testObj = findTestObject('Object Repository/Page_t_verify-data-on-excel-sheet/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/verify-data-on-excel-sheet/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_home'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00005_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
