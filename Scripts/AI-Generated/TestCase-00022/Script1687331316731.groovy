import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-create-and-pass-variable-for-bearer-token'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-create-and-pass-variable-for-bearer-token/49363')

'step 2: At Page_t_how-to-create-and-pass-variable-for-bearer-token click on hyperlink_europe1_discourse_cdn_com_katalon_origi'

testObj = findTestObject('Object Repository/Page_t_how-to-create-and-pass-variable-for-bearer-token/hyperlink_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-create-and-pass-variable-for-bearer-token/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_how-to-create-and-pass-variable-for-bearer-token'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00022_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
